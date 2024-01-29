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
@RequestMapping("/Marque")
public class MarqueController {

    @Autowired
    private MarqueRepository service;

    @GetMapping("/list")
    public List<Marque> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Marque getById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/add")
    public String ajouterObjet(@ModelAttribute("nouvelleObjet") Marque newObject) {
        service.save(newObject);
        return "redirect:/Objets/liste";
    }
    
}

