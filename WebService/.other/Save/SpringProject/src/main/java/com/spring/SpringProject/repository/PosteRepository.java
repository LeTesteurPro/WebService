package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.Poste;

public interface PosteRepository extends JpaRepository<Poste, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
}
