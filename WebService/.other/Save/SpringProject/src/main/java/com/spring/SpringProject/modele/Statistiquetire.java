package com.spring.SpringProject.modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Statistiquetire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int idmatch;
    int idjoueur;
    int lance;
    int lancemrq;
    int tire2pts;
    int tire2ptsmrq;
    int tire3pts;
    int tire3ptsmrq;
    
    

    public Statistiquetire(int id, int idmatch, int idjoueur, int lance, int lancemrq, int tire2pts, int tire2ptsmrq,
            int tire3pts, int tire3ptsmrq) {
        this.id = id;
        this.idmatch = idmatch;
        this.idjoueur = idjoueur;
        this.lance = lance;
        this.lancemrq = lancemrq;
        this.tire2pts = tire2pts;
        this.tire2ptsmrq = tire2ptsmrq;
        this.tire3pts = tire3pts;
        this.tire3ptsmrq = tire3ptsmrq;
    }

    public Statistiquetire() {
    }

    public int getTire3ptsmrq() {
        return tire3ptsmrq;
    }

    public void setTire3ptsmrq(int tire3ptsmrq) {
        this.tire3ptsmrq = tire3ptsmrq;
    }

    public int getTire3pts() {
        return tire3pts;
    }

    public void setTire3pts(int tire3pts) {
        this.tire3pts = tire3pts;
    }

    public int getTire2ptsmrq() {
        return tire2ptsmrq;
    }

    public void setTire2ptsmrq(int tire2ptsmrq) {
        this.tire2ptsmrq = tire2ptsmrq;
    }

    public int getTire2pts() {
        return tire2pts;
    }

    public void setTire2pts(int tire2pts) {
        this.tire2pts = tire2pts;
    }

    public int getLancemrq() {
        return lancemrq;
    }

    public void setLancemrq(int lancemrq) {
        this.lancemrq = lancemrq;
    }

    public int getLance() {
        return lance;
    }

    public void setLance(int lance) {
        this.lance = lance;
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
