package com.spring.SpringProject.modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nom;
    int ville;

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
    public int getVille() {
        return ville;
    }
    public void setVille(int ville) {
        this.ville = ville;
    }

    public Equipe(){}

    public Equipe(int id, String nom, int ville){
        this.id = id;
        this.nom = nom;
        this.ville = ville;
    }

    

}
