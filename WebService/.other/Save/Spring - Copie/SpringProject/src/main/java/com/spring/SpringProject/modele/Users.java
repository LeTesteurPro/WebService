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
    int idPersonne;
    String email;
    String mdp;

    public Users() {}

    public Users(int id, int idPersonne, String email, String mdp){
        this.id = id;
        this.idPersonne = idPersonne;
        this.email = email;
        this.mdp = mdp;
    }
    

    public int getId() {
        return id;
    }
    public int getIdPersonne() {
        return idPersonne;
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
    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }


    
    

}
