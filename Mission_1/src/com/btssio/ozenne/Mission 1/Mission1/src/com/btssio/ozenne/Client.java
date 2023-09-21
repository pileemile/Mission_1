package com.btssio.ozenne;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Component;
import javax.swing.border.EtchedBorder;

public class Client extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel nom;
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
	private JTextField text_dispositif_aide_mobilité;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 1088);
		contentPane = new JPanel();
		contentPane.setVerifyInputWhenFocusTarget(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nom = new JLabel("Nom :");
		nom.setBounds(73, 31, 64, 14);
		nom.setOpaque(true);
		contentPane.add(nom);
		
		JLabel nom_naiss = new JLabel("Nom de naissance :");
		nom_naiss.setBounds(73, 71, 129, 14);
		contentPane.add(nom_naiss);
		
		JLabel prenom = new JLabel("Prénom : ");
		prenom.setBounds(381, 31, 64, 14);
		contentPane.add(prenom);
		
		JLabel genre = new JLabel("Genre :");
		genre.setBounds(381, 71, 60, 14);
		contentPane.add(genre);
		
		JCheckBox masculin = new JCheckBox("Masculin");
		masculin.setBounds(447, 67, 96, 23);
		contentPane.add(masculin);
		
		JCheckBox feminin = new JCheckBox("Féminin");
		feminin.setBounds(545, 67, 74, 23);
		contentPane.add(feminin);
		
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
		
		JLabel date_naiss = new JLabel("Naissance :");
		date_naiss.setBounds(73, 169, 74, 14);
		contentPane.add(date_naiss);
		
		text_date_naiss = new JTextField();
		text_date_naiss.setBounds(153, 166, 86, 20);
		contentPane.add(text_date_naiss);
		text_date_naiss.setColumns(10);
		
		JLabel pays_ville_naiss = new JLabel("Pays et ville de naissance :");
		pays_ville_naiss.setBounds(253, 169, 163, 14);
		contentPane.add(pays_ville_naiss);
		
		text_pays_ville_naiss = new JTextField();
		text_pays_ville_naiss.setBounds(416, 166, 86, 20);
		contentPane.add(text_pays_ville_naiss);
		text_pays_ville_naiss.setColumns(10);
		
		JLabel nationalite = new JLabel("Nationalité :");
		nationalite.setBounds(512, 169, 69, 14);
		contentPane.add(nationalite);
		
		text_nationalite = new JTextField();
		text_nationalite.setBounds(591, 166, 86, 20);
		contentPane.add(text_nationalite);
		text_nationalite.setColumns(10);
		
		JLabel adresse = new JLabel("Adresse : ");
		adresse.setBounds(73, 207, 64, 14);
		contentPane.add(adresse);
		
		text_adresse = new JTextField();
		text_adresse.setBounds(153, 204, 524, 20);
		contentPane.add(text_adresse);
		text_adresse.setColumns(10);
		
		JLabel code_postal = new JLabel("Code postal :");
		code_postal.setBounds(73, 242, 74, 14);
		contentPane.add(code_postal);
		
		text_code_postal = new JTextField();
		text_code_postal.setBounds(153, 239, 138, 20);
		contentPane.add(text_code_postal);
		text_code_postal.setColumns(10);
		
		JLabel ville = new JLabel("Ville :");
		ville.setBounds(300, 242, 46, 14);
		contentPane.add(ville);
		
		text_ville = new JTextField();
		text_ville.setBounds(346, 239, 331, 20);
		contentPane.add(text_ville);
		text_ville.setColumns(10);
		
		JLabel telephone_1 = new JLabel("Téléphone 1 :");
		telephone_1.setBounds(73, 270, 86, 14);
		contentPane.add(telephone_1);
		
		text_tel_1 = new JTextField();
		text_tel_1.setBounds(153, 267, 141, 20);
		contentPane.add(text_tel_1);
		text_tel_1.setColumns(10);
		
		JLabel telephone_2 = new JLabel("Téléphone 2 :");
		telephone_2.setBounds(308, 270, 81, 14);
		contentPane.add(telephone_2);
		
		text_tel_2 = new JTextField();
		text_tel_2.setColumns(10);
		text_tel_2.setBounds(399, 267, 182, 20);
		contentPane.add(text_tel_2);
		
		JLabel courriel = new JLabel("Courriel :");
		courriel.setBounds(73, 304, 64, 14);
		contentPane.add(courriel);
		
		text_courriel = new JTextField();
		text_courriel.setBounds(153, 301, 524, 20);
		contentPane.add(text_courriel);
		text_courriel.setColumns(10);
		
		JLabel nom_prenom_responsable = new JLabel("Nom et prenom du responsable :");
		nom_prenom_responsable.setBounds(73, 338, 200, 14);
		contentPane.add(nom_prenom_responsable);
		
		text_nom_prenom_responsable = new JTextField();
		text_nom_prenom_responsable.setBounds(283, 335, 394, 20);
		contentPane.add(text_nom_prenom_responsable);
		text_nom_prenom_responsable.setColumns(10);
		
		JLabel legal = new JLabel("Légal :");
		legal.setBounds(73, 363, 39, 14);
		contentPane.add(legal);
		
		JLabel lblNewLabel = new JLabel("Armes");
		lblNewLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel.setBackground(new Color(100, 149, 237));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(73, 390, 74, 68);
		contentPane.add(lblNewLabel);
		
		JCheckBox fleuret = new JCheckBox("Fleuret");
		fleuret.setBounds(153, 390, 64, 23);
		contentPane.add(fleuret);
		
		JCheckBox epee = new JCheckBox("Epée");
		epee.setBounds(153, 413, 64, 23);
		contentPane.add(epee);
		
		JCheckBox sabre = new JCheckBox("Sabre");
		sabre.setBounds(153, 435, 64, 23);
		contentPane.add(sabre);
		
		JLabel pratique = new JLabel("Pratique :");
		pratique.setBounds(361, 394, 55, 14);
		contentPane.add(pratique);
		
		JCheckBox loisir = new JCheckBox("loisir");
		loisir.setBounds(423, 390, 64, 23);
		contentPane.add(loisir);
		
		JCheckBox competition = new JCheckBox("compétition");
		competition.setBounds(510, 390, 109, 23);
		contentPane.add(competition);
		
		JLabel lateralite = new JLabel("Latéralité :");
		lateralite.setBounds(361, 417, 80, 14);
		contentPane.add(lateralite);
		
		JCheckBox droitier = new JCheckBox("droitier");
		droitier.setBounds(424, 413, 78, 23);
		contentPane.add(droitier);
		
		JCheckBox gaucher = new JCheckBox("gaucher");
		gaucher.setBounds(512, 413, 74, 23);
		contentPane.add(gaucher);
		
		JLabel informations_personnelles = new JLabel("Informations Personelles");
		informations_personnelles.setBounds(73, 124, 166, 14);
		contentPane.add(informations_personnelles);
		
		JLabel lblNewLabel_1 = new JLabel("Merci de noter ces infos lle plus lisiblement possible.");
		lblNewLabel_1.setBounds(346, 124, 331, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel info = new JLabel("Toutes les informations demandées doivent impérativement être remplies pour permettre la commande de la licence auprès de la fédération");
		info.setForeground(new Color(255, 0, 0));
		info.setToolTipText("");
		info.setBounds(73, 484, 604, 56);
		contentPane.add(info);
		
		JLabel lblNewLabel_3 = new JLabel("Merci de cocher les cases correspondant à votre situation");
		lblNewLabel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setBounds(73, 551, 109, 41);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Inscription + adhésion");
		lblNewLabel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_2.setBounds(73, 602, 109, 19);
		contentPane.add(lblNewLabel_2);
		
		JCheckBox adhesion_190 = new JCheckBox("190 €");
		adhesion_190.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		adhesion_190.setBounds(201, 598, 188, 23);
		contentPane.add(adhesion_190);
		
		JCheckBox adhesion_220 = new JCheckBox("220 €");
		adhesion_220.setBounds(399, 598, 97, 23);
		contentPane.add(adhesion_220);
		
		JCheckBox adhesion_255 = new JCheckBox("255 €");
		adhesion_255.setBounds(545, 598, 97, 23);
		contentPane.add(adhesion_255);
		
		JLabel lblNewLabel_4 = new JLabel("Nés entre 2016 et 2018 (M5-M7)");
		lblNewLabel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setBounds(182, 551, 64, 41);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nés entre 2014 et 2015 (M9)");
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_5.setBounds(248, 551, 64, 41);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Nés en 2012 et 2013 (M11)");
		lblNewLabel_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_6.setBounds(313, 551, 58, 41);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Nés entre 2003 et 2011 (M13-M20) Etudiants, adultes débutants et demandeurs d'emploi");
		lblNewLabel_7.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_7.setBounds(369, 551, 174, 41);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Nés en 2002 et avant (M23 - seniors - vétérans)");
		lblNewLabel_8.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_8.setBounds(545, 551, 112, 41);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Licence FFE");
		lblNewLabel_9.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_9.setBounds(73, 627, 64, 19);
		contentPane.add(lblNewLabel_9);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("28 €");
		chckbxNewCheckBox.setBounds(159, 623, 60, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("45 €");
		chckbxNewCheckBox_1.setBounds(237, 624, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("55 €");
		chckbxNewCheckBox_2.setBounds(381, 623, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_10 = new JLabel("OPTIONS");
		lblNewLabel_10.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_10.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_10.setBounds(73, 659, 604, 23);
		contentPane.add(lblNewLabel_10);
		
		JLabel lab_licence_sans_assurance = new JLabel("Licence sans assurance");
		lab_licence_sans_assurance.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lab_licence_sans_assurance.setBounds(73, 693, 118, 19);
		contentPane.add(lab_licence_sans_assurance);
		
		JCheckBox licence_sans_assurance_prix = new JCheckBox("- 0,21 €");
		licence_sans_assurance_prix.setVerifyInputWhenFocusTarget(false);
		licence_sans_assurance_prix.setBounds(201, 689, 476, 23);
		contentPane.add(licence_sans_assurance_prix);
		
		JLabel lab_licence_sans_assurances_renforcee = new JLabel("Licence sans assurance renforcé (*)");
		lab_licence_sans_assurances_renforcee.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lab_licence_sans_assurances_renforcee.setBounds(73, 718, 109, 23);
		contentPane.add(lab_licence_sans_assurances_renforcee);
		
		JLabel lblNewLabel_12 = new JLabel("1,49 €");
		lblNewLabel_12.setBounds(192, 719, 64, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_12_1 = new JLabel("1,49 €");
		lblNewLabel_12_1.setBounds(266, 718, 46, 14);
		contentPane.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_12_2 = new JLabel("1,49 €");
		lblNewLabel_12_2.setBounds(322, 718, 221, 14);
		contentPane.add(lblNewLabel_12_2);
		
		JLabel lbl_reduction_famille_2 = new JLabel("Réduction famille 2e adhèrent");
		lbl_reduction_famille_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lbl_reduction_famille_2.setBounds(73, 752, 156, 23);
		contentPane.add(lbl_reduction_famille_2);
		
		JLabel lbl_reduction_famille_3 = new JLabel("Réduction famille 3e adhèrent");
		lbl_reduction_famille_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lbl_reduction_famille_3.setBounds(73, 777, 156, 19);
		contentPane.add(lbl_reduction_famille_3);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("-24 €");
		chckbxNewCheckBox_3.setBounds(226, 748, 64, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("-28,50 €");
		chckbxNewCheckBox_4.setBounds(300, 748, 74, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("-33,75 €");
		chckbxNewCheckBox_5.setBounds(381, 748, 97, 23);
		contentPane.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("-32 €");
		chckbxNewCheckBox_3_1.setBounds(227, 773, 64, 23);
		contentPane.add(chckbxNewCheckBox_3_1);
		
		JCheckBox chckbxNewCheckBox_3_2 = new JCheckBox("-38 €");
		chckbxNewCheckBox_3_2.setBounds(300, 773, 64, 23);
		contentPane.add(chckbxNewCheckBox_3_2);
		
		JCheckBox chckbxNewCheckBox_3_3 = new JCheckBox("-45 €");
		chckbxNewCheckBox_3_3.setBounds(381, 773, 64, 23);
		contentPane.add(chckbxNewCheckBox_3_3);
		
		JLabel lblNewLabel_10_1 = new JLabel("AUTRES FORMULES :");
		lblNewLabel_10_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_10_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_10_1.setBounds(73, 802, 604, 23);
		contentPane.add(lblNewLabel_10_1);
		
		JLabel inscription_adhesion_carte = new JLabel("Inscription + adhésion carte 10 séances pour tireurs confirmés (licence en sus)");
		inscription_adhesion_carte.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		inscription_adhesion_carte.setBounds(73, 836, 225, 19);
		contentPane.add(inscription_adhesion_carte);
		
		JCheckBox ckb_inscription_adhesion_carte = new JCheckBox("95 €");
		ckb_inscription_adhesion_carte.setBounds(346, 832, 156, 23);
		contentPane.add(ckb_inscription_adhesion_carte);
		
		JLabel lab_dispositif_aide_mobilite = new JLabel("Dispositif d'aide mobilité (précisez lequel) :");
		lab_dispositif_aide_mobilite.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lab_dispositif_aide_mobilite.setBounds(73, 866, 211, 19);
		contentPane.add(lab_dispositif_aide_mobilite);
		
		text_dispositif_aide_mobilité = new JTextField();
		text_dispositif_aide_mobilité.setBounds(300, 865, 86, 20);
		contentPane.add(text_dispositif_aide_mobilité);
		text_dispositif_aide_mobilité.setColumns(10);
	}
}
