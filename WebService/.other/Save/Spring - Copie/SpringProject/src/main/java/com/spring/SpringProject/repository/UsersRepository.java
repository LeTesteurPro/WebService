package com.spring.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.modele.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    Users findById(int id);
}
