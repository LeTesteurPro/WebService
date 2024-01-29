package com.spring.SpringProject.modele;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nom;
    String prenom;
    Date naissance;
    int genre;

    public Personne() {
    }
    public Personne(int id, String nom, String prenom, Date naissance, int genre) {
        this.id = id;
        this.nom = nom;
        this.naissance = naissance;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public Date getNaissance() {
        return naissance;
    }
    public int getGenre() {
        return genre;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }
    public void setGenre(int genre) {
        this.genre = genre;
    }
        
    

    

}
