package com.btssio.graphique;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.*;

import java.awt.*;
import java.io.File;

public class ClubViewer extends JFrame {
    private JTable clubTable;
    private DefaultTableModel tableModel;

    public ClubViewer() {
       
        setTitle("Clubs de la région");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);

       
        tableModel = new DefaultTableModel(new Object[]{"ID", "Nom", "Adresse", "Contact", "Téléphone", "Mail", "Site"}, 0);
        clubTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(clubTable);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

      
        readXML();

    
        setVisible(true);
    }

    private void readXML() {
        try {
            File file = new File("/Volumes/SANDISK/AP/Mission_1/src/com/btssio/graphique/club.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);

            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("club");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                String id = element.getAttribute("id");
                String nom = element.getElementsByTagName("nom").item(0).getTextContent();
                String adresse = element.getElementsByTagName("adresse").item(0).getTextContent();
                String contact = element.getElementsByTagName("contact").item(0).getTextContent();
                String tel = element.getElementsByTagName("tel").item(0).getTextContent();
                String mail = element.getElementsByTagName("mail").item(0).getTextContent();
                String site = element.getElementsByTagName("site").item(0).getTextContent();

                Object[] row = {id, nom, adresse, contact, tel, mail, site};
                tableModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ClubViewer();
        });
    }
}
