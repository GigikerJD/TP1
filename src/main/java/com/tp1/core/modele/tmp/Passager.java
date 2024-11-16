package com.tp1.core.modele.tmp;

public class Passager {
    private Integer idPassager;
    private String nom;
    private String prenom;
    private String idDocumentIdentite;

    public Passager(){};
    public Passager(
        Integer idPassager, String nom, String prenom, String idDocumentIdentite
    ){
        this.idPassager = idPassager;
        this.idDocumentIdentite = idDocumentIdentite;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Passager(String nom, String prenom, String idDocumentIdentite){
        this.nom = nom;
        this.prenom = prenom;
        this.idDocumentIdentite = idDocumentIdentite;
    }

    public void setIdPassager(int idpassager){
        idPassager = idpassager;
    } 
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public void setIdDocumentIdentite(String idDocumentIdentite){
        this.idDocumentIdentite = idDocumentIdentite;
    }

    public Integer getIdPassager(){return idPassager;}
    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}
    public String getIdDocumentIdentite(){return idDocumentIdentite;}

    @Override
    public String toString(){
        return String.format(
            "Passager - id° %d [%s %s] with document n° %d",
        idPassager, nom.toUpperCase(), prenom, idDocumentIdentite);
    }
}
