package com.spring.SpringProject.modele;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Caracteristiquevoiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int idvoiture;
    int idcaracteristique;

    public Caracteristiquevoiture() {
    }
    public Caracteristiquevoiture(int id, int idVoiture, int idCaracteristique) {
        this.id = id;
        this.idvoiture = idVoiture;
        this.idcaracteristique = idCaracteristique;
    }

    public int getId() {
        return id;
    }
    public int getIdCaracteristique() {
        return idcaracteristique;
    }
    public int getIdVoiture() {
        return idvoiture;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setIdCaracteristique(int idCaracteristique) {
        this.idcaracteristique = idCaracteristique;
    }
    public void setIdVoiture(int idVoiture) {
        this.idvoiture = idVoiture;
    }
        
    

    

}
