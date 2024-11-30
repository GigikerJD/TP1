package com.tp1.core.controleur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/passagers-with-idcard")
    public List<PassagerEntite> afficherPassagersAvecPieceID() {
        return passagerService.getPassagersAvecPieceID();
    }

    @GetMapping("/passager/{id}")
    public Optional<PassagerEntite> afficherPassager(@PathVariable Integer id){
        return passagerService.getPassagerParId(id);
    }
    
    @PostMapping("/register-passager")
    public void creerNouveauPassager(@RequestBody PassagerEntite p){
        passagerService.createNewPassager(p);
    }

    @DeleteMapping("/delete-passager/{id}")
    public void supprimerPassager(@PathVariable Integer id){
        passagerService.deletePassager(id);
    }

    @PutMapping("/change-passager/{id}")
    public void modifierPassager(@PathVariable Integer id, @RequestBody PassagerEntite p){
        passagerService.modifyPassager(id, p);
    }
}
