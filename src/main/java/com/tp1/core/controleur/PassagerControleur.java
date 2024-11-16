package com.tp1.core.controleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp1.core.entite.PassagerEntite;
import com.tp1.core.service.PassagerService;

@RestController
public class PassagerControleur {

    @Autowired
    private PassagerService passagerService;

    @GetMapping("/passagers")
    public List<PassagerEntite> afficherInfosPassagers(){
        //Passager p1 = new Passager(1, "FERROL", "Nelgie", "doc1");
        //Passager p2 = new Passager(2, "ARENAS", "Gilbert", "doc2");
        //return passagerRepository.findAll();
        return passagerService.getPassagers();
    }

    @GetMapping("/passagers-with-passport")
    public List<PassagerEntite> afficherPassagerAvecPasseport(){
        return passagerService.getPassagersAvecPasseport();
    }
}
