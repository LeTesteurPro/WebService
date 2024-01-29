package com.spring.SpringProject.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import com.spring.SpringProject.modele.*;
import com.spring.SpringProject.repository.*;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private ChatRepository service;

    @GetMapping("/list")
    public List<ChatEntity> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ChatEntity getById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/ajouter")
    public String ajouterObjet(@RequestBody ChatEntity newObject) {
        service.save(newObject);
        return "redirect:/ChatEntity/liste";
    }
}


