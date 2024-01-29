package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.Statistique;

public interface StatistiqueRepository extends JpaRepository<Statistique, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
}
