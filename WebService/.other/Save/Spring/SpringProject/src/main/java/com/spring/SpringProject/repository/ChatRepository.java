package com.spring.SpringProject.repository;

import com.spring.SpringProject.modele.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatRepository extends MongoRepository<ChatEntity, String> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
    ChatEntity findById(int id);
}

