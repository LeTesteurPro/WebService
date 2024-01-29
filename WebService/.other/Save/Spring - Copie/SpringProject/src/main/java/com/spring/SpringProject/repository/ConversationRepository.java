package com.spring.SpringProject.repository;


import com.spring.SpringProject.modele.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConversationRepository extends MongoRepository<Conversation, String> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
    Conversation findById(int id);
}
