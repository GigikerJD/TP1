package com.tp1.core.entite;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "PASSAGER")
public class PassagerEntite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID", nullable = false)
    private int idPassager;

    @Column(name= "NOM", length = 50, nullable = false)
    private String nom;

    @Column(name= "PRENOM", length = 50, nullable = false)
    private String prenom;

    @Column(name= "PIECE_IDENTITE", length = 150, nullable = false)
    private String pieceIdentite;

    @Column(name= "NUMERO_IDENTITE", length = 10, nullable = false)
    private String numeroIdentite;

    @Column(name= "NUMERO_RESERVATION", length = 7, nullable = false)
    private String numeroReservation;

    @Column(name= "COMMENTAIRES", length = 250, nullable = false)
    private String commentaires;

    public int getIdPassager() {
        return idPassager;
    }

    public void setIdPassager(int idPassager) {
        this.idPassager = idPassager;
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

    public String getPieceIdentite() {
        return pieceIdentite;
    }

    public void setPieceIdentite(String pieceIdentite) {
        this.pieceIdentite = pieceIdentite;
    }

    public String getNumeroIdentite() {
        return numeroIdentite;
    }

    public void setNumeroIdentite(String numeroIdentite) {
        this.numeroIdentite = numeroIdentite;
    }

    public String getNumeroReservation() {
        return numeroReservation;
    }

    public void setNumeroReservation(String numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    

    
}
