package com.btssio.graphique;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Component;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.ScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Scrollbar;

public class Client extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lbl_nom;
	private JTextField text_nom;
	private JTextField text_nom_naiss;
	private JTextField text_prenom;
	private JTextField text_date_naiss;
	private JTextField text_pays_ville_naiss;
	private JTextField text_nationalite;
	private JTextField text_adresse;
	private JTextField text_code_postal;
	private JTextField text_ville;
	private JTextField text_tel_1;
	private JTextField text_tel_2;
	private JTextField text_courriel;
	private JTextField text_nom_prenom_responsable;
	private JComboBox<String> adherentsComboBox;
	
	ArrayList<String> valeurs = new ArrayList<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            try {
	                Client frame = new Client();
	                frame.setVisible(true);
	                
	                // Charger les adhérents
	                frame.chargerAdherents();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    });

	}
	
	private void afficherAdherents() {
        // Afficher les adhérents
       afficherAdherents1();
	}
	
	public void afficherAdherents1() {
        System.out.println("Adhérents enregistrés :");
        for (String adherent : valeurs) {
            System.out.println("Nom: " + adherent);
        }
	}
	private void sauvegarderAdherents() {
	    try (PrintWriter writer = new PrintWriter("adherents.txt")) {
	        for (String adherent : valeurs) {
	            writer.println(adherent);
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	}
	private void chargerAdherents() {
	    try (Scanner scanner = new Scanner(new File("adherents.txt"))) {
	        while (scanner.hasNextLine()) {
	            String adherent = scanner.nextLine();
	            valeurs.add(adherent);
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	}
	private void remplirJComboBox() {
		adherentsComboBox.removeAllItems(); // Nettoyer la liste déroulante
	    
	    for (String adherent : valeurs) {
	        // Ajouter seulement le nom de l'adhérent à la liste
	        adherentsComboBox.addItem(extractNom(adherent));
	    }
	}

	// Méthode pour extraire le nom de l'adhérent
	private String extractNom(String adherent) {
	    // Le nom est la première valeur dans la liste
	    String[] valeursAdherent = adherent.split(",");
	    if (valeursAdherent.length > 0) {
	        return valeursAdherent[0];
	    }
	    return "";
	}
	
	private void actualiserListeAdherents() {
	    remplirJComboBox();
	}
	  private void supprimerAdherent() {
	        int selectedIndex = adherentsComboBox.getSelectedIndex();
	        if (selectedIndex != -1) {
	            String adhérentSélectionné = (String) adherentsComboBox.getSelectedItem();
	            adherentsComboBox.removeItem(adhérentSélectionné);
	            valeurs.remove(adhérentSélectionné);
	            JOptionPane.showMessageDialog(this, "Adhérent supprimé : " + adhérentSélectionné);
	            sauvegarderAdherents(); // Sauvegarde la liste mise à jour des adhérents
	        } else {
	            JOptionPane.showMessageDialog(this, "Aucun adhérent sélectionné.");
	        }
	    }
	/**
	 * Create the frame.
	 */
	public Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 652);
		contentPane = new JPanel();
		contentPane.setVerifyInputWhenFocusTarget(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl_nom = new JLabel("Nom :");
		lbl_nom.setBounds(73, 31, 64, 14);
		lbl_nom.setOpaque(true);
		contentPane.add(lbl_nom);
		
		JLabel lbl_nom_naiss = new JLabel("Nom de naissance :");
		lbl_nom_naiss.setBounds(73, 71, 129, 14);
		contentPane.add(lbl_nom_naiss);
		
		JLabel lbl_prenom = new JLabel("Prénom : ");
		lbl_prenom.setBounds(381, 31, 64, 14);
		contentPane.add(lbl_prenom);
		
		JLabel lbl_genre = new JLabel("Genre :");
		lbl_genre.setBounds(381, 71, 60, 14);
		contentPane.add(lbl_genre);
		
		JCheckBox chckbx_masculin = new JCheckBox("Masculin");
		chckbx_masculin.setBounds(447, 67, 96, 23);
		contentPane.add(chckbx_masculin);
		
		JCheckBox chckbx_feminin = new JCheckBox("Féminin");
		chckbx_feminin.setBounds(545, 67, 74, 23);
		contentPane.add(chckbx_feminin);
		
		text_nom = new JTextField();
		text_nom.setBounds(212, 28, 86, 20);
		contentPane.add(text_nom);
		text_nom.setColumns(10);
		
		text_nom_naiss = new JTextField();
		text_nom_naiss.setBounds(212, 68, 86, 20);
		contentPane.add(text_nom_naiss);
		text_nom_naiss.setColumns(10);
		
		text_prenom = new JTextField();
		text_prenom.setBounds(451, 28, 86, 20);
		contentPane.add(text_prenom);
		text_prenom.setColumns(10);
		
		JLabel lbl_date_naiss = new JLabel("Date de naissance :");
		lbl_date_naiss.setBounds(73, 169, 99, 14);
		contentPane.add(lbl_date_naiss);
		
		text_date_naiss = new JTextField();
		text_date_naiss.setBounds(182, 166, 86, 20);
		contentPane.add(text_date_naiss);
		text_date_naiss.setColumns(10);
		
		JLabel lbl_pays_ville_naiss = new JLabel("Pays et ville de naissance :");
		lbl_pays_ville_naiss.setBounds(278, 169, 138, 14);
		contentPane.add(lbl_pays_ville_naiss);
		
		text_pays_ville_naiss = new JTextField();
		text_pays_ville_naiss.setBounds(416, 166, 86, 20);
		contentPane.add(text_pays_ville_naiss);
		text_pays_ville_naiss.setColumns(10);
		
		JLabel lbl_nationalite = new JLabel("Nationalité :");
		lbl_nationalite.setBounds(512, 169, 69, 14);
		contentPane.add(lbl_nationalite);
		
		text_nationalite = new JTextField();
		text_nationalite.setBounds(591, 166, 86, 20);
		contentPane.add(text_nationalite);
		text_nationalite.setColumns(10);
		
		JLabel lbl_adresse = new JLabel("Adresse : ");
		lbl_adresse.setBounds(73, 207, 64, 14);
		contentPane.add(lbl_adresse);
		
		text_adresse = new JTextField();
		text_adresse.setBounds(153, 204, 524, 20);
		contentPane.add(text_adresse);
		text_adresse.setColumns(10);
		
		JLabel lbl_code_postal = new JLabel("Code postal :");
		lbl_code_postal.setBounds(73, 242, 74, 14);
		contentPane.add(lbl_code_postal);
		
		text_code_postal = new JTextField();
		text_code_postal.setBounds(153, 239, 138, 20);
		contentPane.add(text_code_postal);
		text_code_postal.setColumns(10);
		
		JLabel lbl_ville = new JLabel("Ville :");
		lbl_ville.setBounds(300, 242, 46, 14);
		contentPane.add(lbl_ville);
		
		text_ville = new JTextField();
		text_ville.setBounds(346, 239, 331, 20);
		contentPane.add(text_ville);
		text_ville.setColumns(10);
		
		JLabel lbl_telephone_1 = new JLabel("Téléphone 1 :");
		lbl_telephone_1.setBounds(73, 270, 86, 14);
		contentPane.add(lbl_telephone_1);
		
		text_tel_1 = new JTextField();
		text_tel_1.setBounds(153, 267, 141, 20);
		contentPane.add(text_tel_1);
		text_tel_1.setColumns(10);
		
		JLabel lbl_telephone_2 = new JLabel("Téléphone 2 :");
		lbl_telephone_2.setBounds(308, 270, 81, 14);
		contentPane.add(lbl_telephone_2);
		
		text_tel_2 = new JTextField();
		text_tel_2.setColumns(10);
		text_tel_2.setBounds(399, 267, 182, 20);
		contentPane.add(text_tel_2);
		
		JLabel lbl_courriel = new JLabel("Courriel :");
		lbl_courriel.setBounds(73, 304, 64, 14);
		contentPane.add(lbl_courriel);
		
		text_courriel = new JTextField();
		text_courriel.setBounds(153, 301, 524, 20);
		contentPane.add(text_courriel);
		text_courriel.setColumns(10);
		
		JLabel lbl_nom_prenom_responsable = new JLabel("Nom et prenom du responsable :");
		lbl_nom_prenom_responsable.setBounds(73, 338, 200, 14);
		contentPane.add(lbl_nom_prenom_responsable);
		
		text_nom_prenom_responsable = new JTextField();
		text_nom_prenom_responsable.setBounds(283, 335, 394, 20);
		contentPane.add(text_nom_prenom_responsable);
		text_nom_prenom_responsable.setColumns(10);
		
		JLabel lbl_pratique = new JLabel("Pratique :");
		lbl_pratique.setBounds(361, 394, 55, 14);
		contentPane.add(lbl_pratique);
		
		JCheckBox loisir = new JCheckBox("loisir");
		loisir.setBounds(423, 390, 64, 23);
		contentPane.add(loisir);
		
		JCheckBox competition = new JCheckBox("compétition");
		competition.setBounds(510, 390, 109, 23);
		contentPane.add(competition);
		
		JLabel lbl_lateralite = new JLabel("Latéralité :");
		lbl_lateralite.setBounds(361, 417, 80, 14);
		contentPane.add(lbl_lateralite);
		
		JCheckBox droitier = new JCheckBox("droitier");
		droitier.setBounds(424, 413, 78, 23);
		contentPane.add(droitier);
		
		JCheckBox gaucher = new JCheckBox("gaucher");
		gaucher.setBounds(512, 413, 74, 23);
		contentPane.add(gaucher);
		
		JLabel lbl_informations_personnelles = new JLabel("Informations Personelles");
		lbl_informations_personnelles.setBounds(73, 124, 166, 14);
		contentPane.add(lbl_informations_personnelles);
		
		JLabel lblNewLabel_1 = new JLabel("Catégorie :");
		lblNewLabel_1.setBounds(73, 469, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btn_valider = new JButton("Valider");
		btn_valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Récupèrer les informations saisies
				String nom = text_nom.getText();
				String prenom = text_prenom.getText();
				String dateNaiss = text_date_naiss.getText();
				String paysVilleNaiss = text_pays_ville_naiss.getText();
				String nationalite = text_nationalite.getText();
				String adresse = text_adresse.getText();
				String codePostal = text_code_postal.getText();
				String ville = text_ville.getText();
				String tel1 = text_tel_1.getText();
				String tel2 = text_tel_2.getText();
				String courriel = text_courriel.getText();
				String nomPrenomResponsable = text_nom_prenom_responsable.getText();
				
				
				String pratique = "";
				if(loisir.isSelected()) {
					pratique = "loisir";
				}else if(competition.isSelected()){
					pratique = "compétition";
				}
				
				String lateralite = "";
				if(droitier.isSelected()) {
					lateralite = "droitier";
				}else if(gaucher.isSelected()) {
					lateralite = "gaucher";
				}
				
				String genre = "";
				if(chckbx_masculin.isSelected()) {
					genre = "masculin";
				}else if(chckbx_feminin.isSelected()){
					genre = "feminin";
				}
				
				// ajoute les valeurs dans une arrayList
				valeurs.add(nom+" "+prenom+" "+dateNaiss+" "+ paysVilleNaiss+" " +nationalite+" " + adresse+" " + codePostal+ " " + ville+" " + tel1+" "+ tel2 +" "+ courriel +" "+  nomPrenomResponsable +" "+ pratique +" "+ lateralite+" "+ genre );
		        
		     // Parcourir la liste et afficher chaque élément
				for (String valeur : valeurs) {
				    System.out.println(valeur);
				}
				
				
				
				
				sauvegarderAdherents();
			}
		});
		btn_valider.setBounds(300, 536, 89, 23);
		contentPane.add(btn_valider);
		
		 JButton btnVoirAdherents = new JButton("Voir Adhérents");
	        btnVoirAdherents.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                afficherAdherents();
	            }
	        });
	        btnVoirAdherents.setBounds(500, 536, 140, 23);
	        contentPane.add(btnVoirAdherents);
	        adherentsComboBox = new JComboBox<>();
	        adherentsComboBox.setBounds(73, 570, 400, 25);
	        contentPane.add(adherentsComboBox);

	        JButton btnActualiser = new JButton("Actualiser la liste");
	        btnActualiser.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                actualiserListeAdherents(); // Appel pour actualiser la liste
	            }
	        });
	        btnActualiser.setBounds(479, 570, 140, 25);
	        contentPane.add(btnActualiser);
	        
	        // Appeler la méthode pour remplir la liste déroulante des adhérents
	        actualiserListeAdherents();
	        JButton btnSupprimerAdherent = new JButton("Supprimer Adhérent");
	        btnSupprimerAdherent.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                supprimerAdherent();
	            }
	        });
	        btnSupprimerAdherent.setBounds(600, 570, 150, 25);
	        contentPane.add(btnSupprimerAdherent);
		
	}
}