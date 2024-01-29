package modele;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "chat")
public class ChatEntity {

    @Id
    private String id;
    private Long id_user;
    private Long id_vendeur;

    // Getters et setters

    public String getId() {
        return id;
    }
    public Long getId_user() {
        return id_user;
    }
    public Long getId_vendeur() {
        return id_vendeur;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }
    public void setId_vendeur(Long id_vendeur) {
        this.id_vendeur = id_vendeur;
    }

    // Constructeurs
    public ChatEntity(){}

    public ChatEntity(String id, Long id_u, Long id_v){
        this.id = id;
        this.id_user = id_u;
        this.id_vendeur = id_v;
    }
}
