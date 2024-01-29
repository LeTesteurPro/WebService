package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.Ville;

public interface VilleRepository extends JpaRepository<Ville, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
}
