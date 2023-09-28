package com.btssio.ozenne;

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
	private JTextField text_dispositif_aide_mobilité;
	private JTextField txt_montant_total;

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
		setBounds(100, 100, 778, 1019);
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
		
		JLabel lbl_date_naiss = new JLabel("Naissance :");
		lbl_date_naiss.setBounds(73, 169, 74, 14);
		contentPane.add(lbl_date_naiss);
		
		text_date_naiss = new JTextField();
		text_date_naiss.setBounds(153, 166, 86, 20);
		contentPane.add(text_date_naiss);
		text_date_naiss.setColumns(10);
		
		JLabel lbl_pays_ville_naiss = new JLabel("Pays et ville de naissance :");
		lbl_pays_ville_naiss.setBounds(253, 169, 163, 14);
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
		
		JLabel lbl_legal = new JLabel("Légal :");
		lbl_legal.setBounds(73, 363, 39, 14);
		contentPane.add(lbl_legal);
		
		JLabel lbl_armes = new JLabel("Armes");
		lbl_armes.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lbl_armes.setBackground(new Color(100, 149, 237));
		lbl_armes.setForeground(new Color(0, 0, 0));
		lbl_armes.setBounds(73, 390, 74, 68);
		contentPane.add(lbl_armes);
		
		JCheckBox fleuret = new JCheckBox("Fleuret");
		fleuret.setBounds(153, 390, 64, 23);
		contentPane.add(fleuret);
		
		JCheckBox epee = new JCheckBox("Epée");
		epee.setBounds(153, 413, 64, 23);
		contentPane.add(epee);
		
		JCheckBox sabre = new JCheckBox("Sabre");
		sabre.setBounds(153, 435, 64, 23);
		contentPane.add(sabre);
		
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
		
		JLabel lbl_info = new JLabel("Merci de noter ces infos lle plus lisiblement possible.");
		lbl_info.setBounds(346, 124, 331, 14);
		contentPane.add(lbl_info);
		
		JLabel info = new JLabel("Toutes les informations demandées doivent impérativement être remplies pour permettre la commande de la licence auprès de la fédération");
		info.setForeground(new Color(255, 0, 0));
		info.setToolTipText("");
		info.setBounds(73, 484, 604, 56);
		contentPane.add(info);
		
		JLabel lblNewLabel = new JLabel("Merci de cocher les cases correspondant à votre situation");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel.setBounds(73, 551, 109, 41);
		contentPane.add(lblNewLabel);
		
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
		
		JLabel lbl_licenceFFE = new JLabel("Licence FFE");
		lbl_licenceFFE.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lbl_licenceFFE.setBounds(73, 627, 64, 19);
		contentPane.add(lbl_licenceFFE);
		
		JCheckBox chckbx_licenceFFE_28 = new JCheckBox("28 €");
		chckbx_licenceFFE_28.setBounds(179, 625, 60, 23);
		contentPane.add(chckbx_licenceFFE_28);
		
		JCheckBox chckbx_licenceFFE_45 = new JCheckBox("45 €");
		chckbx_licenceFFE_45.setBounds(253, 623, 97, 23);
		contentPane.add(chckbx_licenceFFE_45);
		
		JCheckBox chckbx_licenceFFE_55 = new JCheckBox("55 €");
		chckbx_licenceFFE_55.setBounds(381, 623, 97, 23);
		contentPane.add(chckbx_licenceFFE_55);
		
		JLabel lbl_options = new JLabel("OPTIONS");
		lbl_options.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lbl_options.setVerticalAlignment(SwingConstants.TOP);
		lbl_options.setBounds(73, 659, 604, 23);
		contentPane.add(lbl_options);
		
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
		lab_licence_sans_assurances_renforcee.setBounds(73, 718, 188, 23);
		contentPane.add(lab_licence_sans_assurances_renforcee);
		
		JLabel lbl_reduction_famille_2 = new JLabel("Réduction famille 2e adhèrent");
		lbl_reduction_famille_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lbl_reduction_famille_2.setBounds(73, 752, 156, 23);
		contentPane.add(lbl_reduction_famille_2);
		
		JLabel lbl_reduction_famille_3 = new JLabel("Réduction famille 3e adhèrent");
		lbl_reduction_famille_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lbl_reduction_famille_3.setBounds(73, 777, 156, 19);
		contentPane.add(lbl_reduction_famille_3);
		
		JCheckBox chckbx_reduction_famille_2_adherent_24 = new JCheckBox("-24 €");
		chckbx_reduction_famille_2_adherent_24.setBounds(226, 748, 64, 23);
		contentPane.add(chckbx_reduction_famille_2_adherent_24);
		
		JCheckBox chckbx_reduction_famille_2_adherent_28_50 = new JCheckBox("-28,50 €");
		chckbx_reduction_famille_2_adherent_28_50.setBounds(300, 748, 74, 23);
		contentPane.add(chckbx_reduction_famille_2_adherent_28_50);
		
		JCheckBox chckbx_reduction_famille_2_adherent_33_75 = new JCheckBox("-33,75 €");
		chckbx_reduction_famille_2_adherent_33_75.setBounds(381, 748, 97, 23);
		contentPane.add(chckbx_reduction_famille_2_adherent_33_75);
		
		JCheckBox chckbx_reduction_famille_3_adherent_32 = new JCheckBox("-32 €");
		chckbx_reduction_famille_3_adherent_32.setBounds(227, 773, 64, 23);
		contentPane.add(chckbx_reduction_famille_3_adherent_32);
		
		JCheckBox chckbx_reduction_famille_3_adherent_38 = new JCheckBox("-38 €");
		chckbx_reduction_famille_3_adherent_38.setBounds(300, 773, 64, 23);
		contentPane.add(chckbx_reduction_famille_3_adherent_38);
		
		JCheckBox chckbx_reduction_famille_3_adherent_45 = new JCheckBox("-45 €");
		chckbx_reduction_famille_3_adherent_45.setBounds(381, 773, 64, 23);
		contentPane.add(chckbx_reduction_famille_3_adherent_45);
		
		JLabel lbl_autres_formules = new JLabel("AUTRES FORMULES :");
		lbl_autres_formules.setVerticalAlignment(SwingConstants.TOP);
		lbl_autres_formules.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lbl_autres_formules.setBounds(73, 802, 604, 23);
		contentPane.add(lbl_autres_formules);
		
		JLabel inscription_adhesion_carte = new JLabel("Inscription + adhésion carte 10 séances pour tireurs confirmés (licence en sus)");
		inscription_adhesion_carte.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		inscription_adhesion_carte.setBounds(73, 836, 359, 19);
		contentPane.add(inscription_adhesion_carte);
		
		JCheckBox ckb_inscription_adhesion_carte = new JCheckBox("95 €");
		ckb_inscription_adhesion_carte.setBounds(447, 832, 156, 23);
		contentPane.add(ckb_inscription_adhesion_carte);
		
		JLabel lab_dispositif_aide_mobilite = new JLabel("Dispositif d'aide mobilité (précisez lequel) :");
		lab_dispositif_aide_mobilite.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lab_dispositif_aide_mobilite.setBounds(73, 866, 211, 19);
		contentPane.add(lab_dispositif_aide_mobilite);
		
		text_dispositif_aide_mobilité = new JTextField();
		text_dispositif_aide_mobilité.setBounds(300, 865, 377, 20);
		contentPane.add(text_dispositif_aide_mobilité);
		text_dispositif_aide_mobilité.setColumns(10);
		
		JLabel lbl_montant_total = new JLabel("Montant total :");
		lbl_montant_total.setBounds(73, 896, 74, 14);
		contentPane.add(lbl_montant_total);
		
		txt_montant_total = new JTextField();
		txt_montant_total.setBounds(153, 893, 86, 20);
		contentPane.add(txt_montant_total);
		txt_montant_total.setColumns(10);
		
		JCheckBox chckbx_licence_sans_assurance_renforcée_1_49_N1 = new JCheckBox("1,49 €");
		chckbx_licence_sans_assurance_renforcée_1_49_N1.setBounds(274, 715, 97, 23);
		contentPane.add(chckbx_licence_sans_assurance_renforcée_1_49_N1);
		
		JCheckBox chckbx_licence_sans_assurance_renforcée_1_49_N2 = new JCheckBox("1,49 €");
		chckbx_licence_sans_assurance_renforcée_1_49_N2.setBounds(381, 715, 97, 23);
		contentPane.add(chckbx_licence_sans_assurance_renforcée_1_49_N2);
		
		JCheckBox chckbx_licence_sans_assurance_renforcée_1_49_N3 = new JCheckBox("1,49 €");
		chckbx_licence_sans_assurance_renforcée_1_49_N3.setBounds(489, 715, 97, 23);
		contentPane.add(chckbx_licence_sans_assurance_renforcée_1_49_N3);
		
		JButton btn_valider = new JButton("Valider");
		btn_valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_valider.setBounds(308, 944, 89, 23);
		contentPane.add(btn_valider);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentMoved(ComponentEvent e) {
				
			}
		});
		scrollbar.setBounds(720, 0, 17, 980);
		contentPane.add(scrollbar);
		
		JLabel lblNewLabel_1 = new JLabel("Catégorie :");
		lblNewLabel_1.setBounds(73, 469, 64, 14);
		contentPane.add(lblNewLabel_1);
	}
}

