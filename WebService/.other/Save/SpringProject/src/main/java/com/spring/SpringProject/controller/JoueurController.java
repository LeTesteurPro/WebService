package com.spring.SpringProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.SpringProject.modele.*;
import com.spring.SpringProject.repository.*;

@RestController
@RequestMapping("/joueur")
public class JoueurController {

    @Autowired
    private JoueurRepository service;

    @GetMapping("/list")
    public List<Joueur> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Joueur getById(@PathVariable int id) {
        return service.findById(id);
    }
    
}

