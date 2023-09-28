package com.btssio.ozenne;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import com.btssio.ozenne.Client;
import com.btssio.ozenne.Client_Niveau2;
import com.btssio.ozenne.Client_Niveau3;

public class Club {

    public static void main(String[] args) {
        try {
            String filename = "C:\\Utilisateurs\\User\\tests\\Téléchargement\\GestionAdherents\\documentation\\club.xml";
            List<Client> clients = getTousLesClients(filename);
            
            // Afficher les informations des clients
            for (Client client : clients) {
                System.out.println(client.toString());
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    // Reste du code (la méthode getTousLesClients reste inchangée)
    // ...

	
	
	static public List<Client> getTousLesClients(String filename) throws ParserConfigurationException, SAXException, IOException{
	
		List<Client> lesClients = new ArrayList<Client>();		
		
			  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		        DocumentBuilder builder = factory.newDocumentBuilder();
		        Document document = builder.parse(new File("C:\\Utilisateurs\\User\\tests\\Téléchargement\\GestionAdherents\\documentation \\club.xml"));
		      
		        NodeList nodeList = document.getDocumentElement().getChildNodes();
		        for (int i = 0; i < nodeList.getLength(); i++) {
		            Node node = nodeList.item(i);
		            if (node.getNodeType() == Node.ELEMENT_NODE) {
		                Element elem = (Element) node;
		               int id = Integer.parseInt(elem.getAttribute("id"));
		                String nom = elem.getElementsByTagName("nom")
		                        .item(0).getChildNodes().item(0).getNodeValue();
		                nom+= " ";
		               nom+= elem.getElementsByTagName("prenom").item(0)
		                        .getChildNodes().item(0).getNodeValue();
		                String nom_structure = elem.getElementsByTagName("structure_nom")
		                        .item(0).getChildNodes().item(0).getNodeValue();
		                String adresse = elem.getElementsByTagName("structure_adresse")
		                        .item(0).getChildNodes().item(0).getNodeValue();
		                String mail = elem.getElementsByTagName("mail")
		                        .item(0).getChildNodes().item(0).getNodeValue();
		                int structure = Integer.parseInt(elem.getElementsByTagName("structure_id").item(0)
		                        .getChildNodes().item(0).getNodeValue());
		                switch (structure) {
		                
		                case 1 : lesClients.add(new Clients(id,nom,mail,adresse,nom_structure));break;
		                //case 2 : lesClients.add(new Client_Niveau2(id,nom,mail,adresse,nom_structure));break;
		                //case 3 : lesClients.add(new Client_Niveau3(id,nom,mail,adresse,nom_structure));break;
		                default : lesClients.add(new Clients(id,nom,mail,adresse,nom_structure));break;
		            }
		        }
		        }
		        for (Client empl: lesClients)
		       System.out.println(empl.toString());
		  
		  return lesClients;
	}
	

}
		  
	    

	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
