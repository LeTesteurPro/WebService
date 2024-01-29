package com.spring.SpringProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import com.spring.SpringProject.modele.*;
import com.spring.SpringProject.repository.*;

@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    private MatchRepository service;

    @GetMapping("/list")
    public List<Match> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Match getById(@PathVariable int id) {
        return service.findById(id);
    }

    @GetMapping("/ajouter")
    public String afficherFormulaireAjoutObjet(Model object) {
        object.addAttribute("nouvelleObjet", new Match());
        return "ajouterObjet";
    }

    @PostMapping("/ajouter")
    public String ajouterObjet(@ModelAttribute("nouvelleObjet") Match newObject) {
        service.save(newObject);
        return "redirect:/Objets/liste";
    }
    
}

