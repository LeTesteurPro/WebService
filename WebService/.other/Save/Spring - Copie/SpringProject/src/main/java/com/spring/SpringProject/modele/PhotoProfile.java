package com.spring.SpringProject.modele;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "photoProfile")
public class PhotoProfile {

    @Id
    private String id;
    private Long idUser;
    private byte[] image;

    // Getters et setters

    public String getId() {
        return id;
    }
    public Long getIdUser() {
        return idUser;
    }
    public byte[] getImage() {
        return image;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }

    // Constructeurs
    public PhotoProfile(){}

    public PhotoProfile(String id, Long idUser, byte[] image){
        this.id = id;
        this.idUser = idUser;
        this.image = image;
    }
}
