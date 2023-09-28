package com.btssio.ozenne;

public class Adhérents {
	
	private String nom;
	private String prenom;
	private String nomNaissance;
	private String genre;
	
	private String paysEtVilleDeNaissance;
	private String nationalite;
	private String adresse;
	private int codePostale;
	private String ville;
	private int telephone;
	private String courriel;
	private String nomEtPrenomResponsableLegal;
	
	private boolean pratique;
	private boolean lateralite;

	public Adhérents(String nom, String prenom, String nomNaissance, String genre, String paysEtVilleDeNaissance,
			String nationalite, String adresse, int codePostale, String ville, int telephone, String courriel,
			String nomEtPrenomResponsableLegal, boolean pratique, boolean lateralite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.nomNaissance = nomNaissance;
		this.genre = genre;
		this.paysEtVilleDeNaissance = paysEtVilleDeNaissance;
		this.nationalite = nationalite;
		this.adresse = adresse;
		this.codePostale = codePostale;
		this.ville = ville;
		this.telephone = telephone;
		this.courriel = courriel;
		this.nomEtPrenomResponsableLegal = nomEtPrenomResponsableLegal;
		this.pratique = pratique;
		this.lateralite = lateralite;
	}



	public String getNom() {
		return nom;
	}





	public void setNom(String nom) {
		this.nom = nom;
	}





	public String getPrenom() {
		return prenom;
	}





	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}





	public String getNomNaissance() {
		return nomNaissance;
	}





	public void setNomNaissance(String nomNaissance) {
		this.nomNaissance = nomNaissance;
	}





	public String getGenre() {
		return genre;
	}





	public void setGenre(String genre) {
		this.genre = genre;
	}





	public String getPaysEtVilleDeNaissance() {
		return paysEtVilleDeNaissance;
	}





	public void setPaysEtVilleDeNaissance(String paysEtVilleDeNaissance) {
		this.paysEtVilleDeNaissance = paysEtVilleDeNaissance;
	}





	public String getNationalite() {
		return nationalite;
	}





	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}





	public String getAdresse() {
		return adresse;
	}





	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}





	public int getCodePostale() {
		return codePostale;
	}





	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}





	public String getVille() {
		return ville;
	}





	public void setVille(String ville) {
		this.ville = ville;
	}





	public int getTelephone() {
		return telephone;
	}





	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}





	public String getCourriel() {
		return courriel;
	}





	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}





	public String getNomEtPrenomResponsableLegal() {
		return nomEtPrenomResponsableLegal;
	}





	public void setNomEtPrenomResponsableLegal(String nomEtPrenomResponsableLegal) {
		this.nomEtPrenomResponsableLegal = nomEtPrenomResponsableLegal;
	}





	public boolean isPratique() {
		return pratique;
	}





	public void setPratique(boolean pratique) {
		this.pratique = pratique;
	}





	public boolean isLateralite() {
		return lateralite;
	}





	public void setLateralite(boolean lateralite) {
		this.lateralite = lateralite;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
