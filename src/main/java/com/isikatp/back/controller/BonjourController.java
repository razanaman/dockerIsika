package com.isikatp.back.controller;

import com.isikatp.back.model.Personne;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/")
public class BonjourController {
    @GetMapping("/")
    public String accueil(){
        return "formulaire";
    }

    @PostMapping("/post")
    public String bonjour(@RequestParam("nom") String nom, Model model){
        model.addAttribute("personne", nom);
        return "accueil";
    }

    public String salut(String nom){
        return nom;
    }

    public int somme(int a, int b){
        return a+b;
    }
}
