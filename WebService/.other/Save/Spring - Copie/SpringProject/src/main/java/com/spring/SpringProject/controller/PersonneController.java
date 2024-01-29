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
import com.spring.SpringProject.repository.PersonneRepository;

@RestController
@RequestMapping("/Personne")
public class PersonneController {

    @Autowired
    private PersonneRepository service;

    @GetMapping("/all")
    public List<Personne> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Personne getById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/add")
    public String ajouterObjet(@ModelAttribute("nouvelleObjet") Personne newObject) {
        service.save(newObject);
        return "redirect:/Objets/liste";
    }
    
}

