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
@RequestMapping("/personne")
public class PersonneController {

    @Autowired
    private PersonneRepository service;

    @GetMapping("/list")
    public List<Personne> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Personne getById(@PathVariable int id) {
        return service.findById(id);
    }
    
}

