package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.*;

public interface CarburantRepository extends JpaRepository<Carburant, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    Carburant findById(int id);
}
