package com.spring.SpringProject.repository;


import com.spring.SpringProject.modele.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoProfileRepository extends MongoRepository<PhotoProfile, String> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
    PhotoProfile findById(int id);
}
