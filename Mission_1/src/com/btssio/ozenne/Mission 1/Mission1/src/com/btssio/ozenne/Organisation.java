package com.btssio.ozenne;

public class Organisation {
	private int id;
	private String Nom;
	private String Adresse;
	private String Contact;
	private String tel;
	private String Mail;
	private String Site;
	
	public Organisation(int id, String nom, String adresse, String contact,String tel, String mail, String site) {
		super();
		this.id = id;
		Nom = nom;
		Adresse = adresse;
		Contact = contact;
		this.tel=tel;
		Mail = mail;
		Site = site;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//création des Club 
		Organisation orga1=new Organisation(1,"C.E LAXOVIEN","2 Grande rue 54210 AZELOT","M. SILBERSCHMIDT Gilles","03.83.46.77.22","contact@escrime-laxou.net","http://www.escrime-laxou.net/");
		Organisation orga2=new Organisation(2,"C.E DE LUNEVILLE","64 rue de Villers 54300 LUNEVILLE","Mme CHARROY Carole","06.99.02.00.96","escrime.luneville@gmail.com","https://www.escrime-luneville.net/");
		Organisation orga3=new Organisation(3,"C.E DE RICHARDMENIL","18 rue Iena 54630 RICHARDMENIL","Mme METRICH Régine","03.83.25.65.94","escrime.richardmenil@laposte.net","");
		Organisation orga4=new Organisation(4,"C.E DE VANDOEUVRE","9 rue Elsa Triolet 54510 TOMBLAINE","M. ISSARTIER Patrice","06.11.72.57.32","escrime.issartier@sfr.fr","http://vandercrime.free.fr");
		Organisation orga5=new Organisation(5,"SALLE D’ARME DE NANCY","56 rue Raymond Poincaré 54000 NANCY","Mme GEHIN Christiane","03.83.90.17.15","Christianegehin@clubinternet.fr","http://salledarmesdenancy.fr");
		Organisation orga6=new Organisation(6,"C.E DE PT A MOUSSON","90 route de Regniéville 54470 MAMEY","M. GROSSE Hervé","06.87.03.33.21","gaecdelahaye.grosse@wanadoo.fr","http://www.pont-a-mousson-escrime.info/");
		Organisation orga7=new Organisation(7,"ESCRIME SEICHAMPS ST-MAX ESSE","16 rue de preny 54420 PULNOY","M. KUJAWA Patrick","06.66.15.60.01","patrick.escrime54@orange.fr","https://www.esseylesnancy.fr/contacts/escrime-seichampssaint-maxessey");
		Organisation orga8=new Organisation(8,"C.E DE TOUL ESCRIME","1 rue Thiebauclos 54570 FOUG","M. BAUDINO Georges","03.83.62.71.01","louescrime@yahoo.fr","http://toulescrime.free.fr/");
		Organisation orga9=new Organisation(9,"C.E DU PAYS HAUT","12 allée des Tulipes 54190 VILLERUPT","M. BUCHERT Jean-Marie","03.82.89.28.51","jmariebucher@hotmail.com","");
		Organisation orga10=new Organisation(10,"OMNISPORTS FROUARD/POMPEY","23 rue du Stade 54670 MILLERY","M. GAILLET Gérard","03.83.24.67.62","gaillet.mangenot@yahoo.fr","https://www.omnisportsfrouardpompey.fr/category/nos-sections/section-escrime/");
				
		
	}

}
