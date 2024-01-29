package com.spring.SpringProject.modele;

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
    String dtn;
    String sexe;

    public Personne() {
    }
    public Personne(int id, String nom, String dtn, String sexe) {
        this.id = id;
        this.nom = nom;
        this.dtn = dtn;
        this.sexe = sexe;
    }
    public String getDtn() {
        return dtn;
    }
    public void setDtn(String dtn) {
        this.dtn = dtn;
    }
    public String getSexe() {
        return sexe;
    }
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    

    

}
