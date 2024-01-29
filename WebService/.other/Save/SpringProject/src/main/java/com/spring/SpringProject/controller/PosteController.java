package com.spring.SpringProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.SpringProject.modele.Poste;
import com.spring.SpringProject.repository.PosteRepository;

@RestController
@RequestMapping("/poste")
public class PosteController {

    @Autowired
    private PosteRepository PosteService;

    @GetMapping("/list")
    public List<Poste> obtenirTousLesUtilisateurs() {
        return PosteService.findAll();
    }
}

