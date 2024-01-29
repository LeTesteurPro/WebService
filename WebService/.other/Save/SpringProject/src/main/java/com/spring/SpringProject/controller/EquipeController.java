package com.spring.SpringProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.SpringProject.modele.Equipe;
import com.spring.SpringProject.repository.EquipeRepository;

@RestController
@RequestMapping("/equipe")
public class EquipeController {

    @Autowired
    private EquipeRepository equipeService;

    @GetMapping("/list")
    public List<Equipe> obtenirTousLesUtilisateurs() {
        return equipeService.findAll();
    }
}

