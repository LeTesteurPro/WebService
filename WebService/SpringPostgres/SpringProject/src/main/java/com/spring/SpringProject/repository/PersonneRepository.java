package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.*;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    Personne findById(int id);
}
