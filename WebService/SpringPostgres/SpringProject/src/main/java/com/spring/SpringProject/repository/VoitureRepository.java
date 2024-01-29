package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.*;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    Voiture findById(int id);
}
