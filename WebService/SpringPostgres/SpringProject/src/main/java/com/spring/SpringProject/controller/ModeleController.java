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
@RequestMapping("/Modele")
public class ModeleController {

    @Autowired
    private ModeleRepository service;

    @GetMapping("/list")
    public List<Modele> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Modele getById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/add")
    public String ajouterObjet(@ModelAttribute("nouvelleObjet") Modele newObject) {
        service.save(newObject);
        return "redirect:/Objets/liste";
    }
    
}

