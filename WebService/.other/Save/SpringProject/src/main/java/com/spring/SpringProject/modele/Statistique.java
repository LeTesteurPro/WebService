package com.spring.SpringProject.modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Statistique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int idmatch;
    int idjoueur;
    int interception;
    int rebondoff;
    int rebonddef;
    
    

    public Statistique(int id, int idmatch, int idjoueur, int interception, int rebondoff, int rebonddef) {
        this.id = id;
        this.idmatch = idmatch;
        this.idjoueur = idjoueur;
        this.interception = interception;
        this.rebondoff = rebondoff;
        this.rebonddef = rebonddef;
    }

    public Statistique() {
    }

    public int getRebonddef() {
        return rebonddef;
    }

    public void setRebonddef(int rebonddef) {
        this.rebonddef = rebonddef;
    }

    public int getRebondoff() {
        return rebondoff;
    }

    public void setRebondoff(int rebondoff) {
        this.rebondoff = rebondoff;
    }

    public int getInterception() {
        return interception;
    }

    public void setInterception(int interception) {
        this.interception = interception;
    }

    public int getIdjoueur() {
        return idjoueur;
    }

    public void setIdjoueur(int idjoueur) {
        this.idjoueur = idjoueur;
    }

    public int getIdmatch() {
        return idmatch;
    }

    public void setIdmatch(int idmatch) {
        this.idmatch = idmatch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
