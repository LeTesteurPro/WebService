package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.*;

public interface CaracteristiqueRepository extends JpaRepository<Caracteristique, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    Caracteristique findById(int id);
}
