package com.spring.SpringProject.modele;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "photoProfile")
public class PhotoProfile {

    @Id
    private String id;
    private Long idUser;
    private byte[] photo;

    // Getters et setters

    public String getId() {
        return id;
    }
    public Long getIdUser() {
        return idUser;
    }
    public byte[] getPhoto() {
        return photo;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }



    // Constructeurs
    public PhotoProfile(){}

    public PhotoProfile(String id, Long id_u, byte[] id_v){
        this.id = id;
        this.idUser = id_u;
        this.photo = id_v;
    }
}
