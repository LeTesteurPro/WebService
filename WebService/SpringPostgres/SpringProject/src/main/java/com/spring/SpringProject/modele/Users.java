package com.spring.SpringProject.modele;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int idpersonne;
    String email;
    String mdp;

    public Users() {}

    public Users(int id, int idpersonne, String email, String mdp){
        this.id = id;
        this.idpersonne = idpersonne;
        this.email = email;
        this.mdp = mdp;
    }
    

    public int getId() {
        return id;
    }
    public int getIdpersonne() {
        return idpersonne;
    }
    public String getEmail() {
        return email;
    }
    public String getMdp() {
        return mdp;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setIdpersonne(int idpersonne) {
        this.idpersonne = idpersonne;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }


    
    

}
