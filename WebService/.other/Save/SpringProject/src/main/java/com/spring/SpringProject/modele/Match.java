package com.spring.SpringProject.modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int domicile;
    int visiteur;
    String datematch;
    String heurematch;


    public Match(int id, int domicile, int visiteur, String datematch, String heurematch) {
        this.id = id;
        this.domicile = domicile;
        this.visiteur = visiteur;
        this.datematch = datematch;
        this.heurematch = heurematch;
    }
    public Match() {
    }


    public int getDomicile() {
        return domicile;
    }
    public void setDomicile(int domicile) {
        this.domicile = domicile;
    }
    
    public int getVisiteur() {
        return visiteur;
    }
    public void setVisiteur(int visiteur) {
        this.visiteur = visiteur;
    }
    
    public String getDatematch() {
        return datematch;
    }
    public void setDatematch(String datematch) {
        this.datematch = datematch;
    }

    public String getHeurematch() {
        return heurematch;
    }
    public void setHeurematch(String heurematch) {
        this.heurematch = heurematch;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    

}
