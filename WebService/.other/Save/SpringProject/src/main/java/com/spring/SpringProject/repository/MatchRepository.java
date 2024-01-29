package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.Match;

public interface MatchRepository extends JpaRepository<Match, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    Match findById(int id);
}
