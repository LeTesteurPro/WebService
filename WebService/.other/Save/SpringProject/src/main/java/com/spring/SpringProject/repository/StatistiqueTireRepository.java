package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.Statistiquetire;

public interface StatistiqueTireRepository extends JpaRepository<Statistiquetire, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
}
