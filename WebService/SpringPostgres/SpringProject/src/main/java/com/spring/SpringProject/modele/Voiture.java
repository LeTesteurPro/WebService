package com.spring.SpringProject.modele;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    int iduser ;
    int idmodele ;
    int idcarburant ;
    double kilometrage ;
    String couleur ;
    double prix;
    int etat;

    public Voiture() {
    }
    public Voiture(int id , int iduser , int idmodele , int idtypecarburant , double kilometrage , String couleur , double prix , int etat) {
        this.id = id;
        this.iduser = iduser;
        this.idmodele = idmodele;
        this.idcarburant = idtypecarburant;
        this.kilometrage = kilometrage;
        this.couleur = couleur;
        this.prix = prix;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }
    public int getIduser() {
        return iduser;
    }
    public int getIdmodele() {
        return idmodele;
    }
    public int getIdcarburant() {
        return idcarburant;
    }
    public String getCouleur() {
        return couleur;
    }
    public double getKilometrage() {
        return kilometrage;
    }
    public double getPrix() {
        return prix;
    }
    public int getEtat() {
        return etat;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setIdmodele(int idmodele) {
        this.idmodele = idmodele;
    }
    public void setIdcarburant(int idcarburant) {
        this.idcarburant = idcarburant;
    }
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void setEtat(int etat) {
        this.etat = etat;
    }
    
    
        
    

    

}
