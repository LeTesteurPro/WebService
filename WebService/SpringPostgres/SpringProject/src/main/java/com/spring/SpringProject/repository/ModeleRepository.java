package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.*;

public interface ModeleRepository extends JpaRepository<Modele, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    Modele findById(int id);
}
