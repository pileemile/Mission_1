package com.btssio.graphique;

public class Categorie {
    private int id;
    private String nom;
    private String code;
    private int anneeMin;
    private int anneeMax;

    public Categorie(int id, String nom, String code, int anneeMin, int anneeMax) {
        this.id = id;
        this.nom = nom;
        this.code = code;
        this.anneeMin = anneeMin;
        this.anneeMax = anneeMax;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getCode() {
        return code;
    }

    public int getAnneeMin() {
        return anneeMin;
    }

    public int getAnneeMax() {
        return anneeMax;
    }

    @Override
    public String toString() {
        return nom;
    }
}
