package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.*;

public interface CaracteristiqueVRepository extends JpaRepository<Caracteristiquevoiture, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    Caracteristiquevoiture findById(int id);
}
