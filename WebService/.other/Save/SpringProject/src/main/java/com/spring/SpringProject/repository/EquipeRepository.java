package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
}
