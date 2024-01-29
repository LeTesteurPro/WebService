package com.spring.SpringProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.SpringProject.modele.Ville;
import com.spring.SpringProject.repository.VilleRepository;

@RestController
@RequestMapping("/ville")
public class VilleController {

    @Autowired
    private VilleRepository VilleService;

    @GetMapping("/list")
    public List<Ville> obtenirTousLesUtilisateurs() {
        return VilleService.findAll();
    }
}

