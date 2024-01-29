package com.spring.SpringProject.modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Joueur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int idpersonne;
    int idequipe;
    int idPoste;
    int numero;


    public Joueur(int id, int idpersonne, int idequipe, int idPoste, int numero) {
        this.id = id;
        this.idpersonne = idpersonne;
        this.idequipe = idequipe;
        this.idPoste = idPoste;
        this.numero = numero;
    }


    public Joueur() {
    }

    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdPoste() {
        return idPoste;
    }
    public void setIdPoste(int idPoste) {
        this.idPoste = idPoste;
    }
    
    public int getIdequipe() {
        return idequipe;
    }
    public void setIdequipe(int idequipe) {
        this.idequipe = idequipe;
    }

    public int getIdpersonne() {
        return idpersonne;
    }
    public void setIdpersonne(int idpersonne) {
        this.idpersonne = idpersonne;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
    

    

}
