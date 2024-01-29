package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.Joueur;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    Joueur findById(int id);
}
