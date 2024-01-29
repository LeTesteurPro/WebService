package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.*;

public interface MarqueRepository extends JpaRepository<Marque, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    Marque findById(int id);
}
