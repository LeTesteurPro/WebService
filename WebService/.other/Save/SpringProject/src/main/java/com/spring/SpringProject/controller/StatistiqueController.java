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
@RequestMapping("/statistique")
public class StatistiqueController {

    @Autowired
    private StatistiqueRepository service;

    @GetMapping("/list")
    public List<Statistique> obtenirTousLesUtilisateurs() {
        return service.findAll();
    }

    @GetMapping("/ajouter")
    public String afficherFormulaireAjoutObjet(Model object) {
        object.addAttribute("newObject", new Match());
        return "StatistiqueForm";
    }

    @PostMapping("/ajouter")
    public String ajouterObjet(@ModelAttribute("newObject") Match newObject) {
        service.save(newObject);
        return "redirect:/statistique/list";
    }
}

