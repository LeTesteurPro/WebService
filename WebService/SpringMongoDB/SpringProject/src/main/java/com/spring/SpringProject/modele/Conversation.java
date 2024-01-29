package com.spring.SpringProject.modele;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "conversation")
public class Conversation {
    
    @Id
    private String id;
    private Long sender;
    private Long receiver;
    private String texte;
    private Date ajout;

    public String getId() {
        return id;
    }
    public Long getSender() {
        return sender;
    }
    public Long getReceiver() {
        return receiver;
    }
    public String getTexte() {
        return texte;
    }
    public Date getAjout() {
        return ajout;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setSender(Long sender) {
        this.sender = sender;
    }
    public void setReceiver(Long receiver) {
        this.receiver = receiver;
    }
    public void setTexte(String texte) {
        this.texte = texte;
    }
    public void setAjout(Date ajout) {
        this.ajout = ajout;
    }

    public Conversation(){}

    public Conversation(String id, Long sender, Long receiver, String texte, Date ajout){
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.texte = texte;
        this.ajout = ajout;
    }



}
