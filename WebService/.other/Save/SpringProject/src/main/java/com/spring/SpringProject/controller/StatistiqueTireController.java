package com.spring.SpringProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.SpringProject.modele.Statistiquetire;
import com.spring.SpringProject.repository.StatistiqueTireRepository;

@RestController
@RequestMapping("/statistiquetire")
public class StatistiqueTireController {

    @Autowired
    private StatistiqueTireRepository StatistiquetireService;

    @GetMapping("/list")
    public List<Statistiquetire> obtenirTousLesUtilisateurs() {
        return StatistiquetireService.findAll();
    }
}

