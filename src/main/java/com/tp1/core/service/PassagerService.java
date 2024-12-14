package com.tp1.core.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp1.core.entite.PassagerEntite;
import com.tp1.core.modele.PassagerRepository;

@Service
public class PassagerService {

    @Autowired
    private PassagerRepository passagerRepository;

    public List<PassagerEntite> getPassagers(){
        return passagerRepository.findAll();
    }  

    public Optional<PassagerEntite> getPassagerParId(int id) {
        return passagerRepository.findById(id);
    }
    
    public List<PassagerEntite> getPassagersAvecPasseport(){
        return passagerRepository
            .findAll()
            .stream()
            .filter(p -> p.getPieceIdentite().equals("Passeport"))
            .collect(Collectors.toList());
    }

    public List<PassagerEntite> getPassagersAvecPieceID(){
        return passagerRepository
            .findAll()
            .stream()
            .filter(p -> p.getPieceIdentite().equals("Carte d'identité"))
            .collect(Collectors.toList());
    }

    public void deletePassager(Integer id) {
        PassagerEntite p = passagerRepository.findById(id).get();
        if(p == null) System.err.println("Cet utilisateur n'existait même pas !");
        else{
            passagerRepository.delete(p);
            System.out.println("Bravo, vous avez supprimé un passager !");
        }   
    }


    public void createNewPassager(PassagerEntite p){
        passagerRepository.save(p);
        System.out.println("Bravo, votre passager est enregistré !");
    }

    public void modifyPassager(Integer id, PassagerEntite p) {
        Optional<PassagerEntite> recover = passagerRepository.findById(id);
        if (recover.isPresent()) {
            PassagerEntite p1 = recover.get();
            p1.setNom(p.getNom());
            p1.setPrenom(p.getPrenom());
            p1.setNumeroIdentite(p.getNumeroIdentite());
            p1.setNumeroReservation(p.getNumeroReservation());
            p1.setPieceIdentite(p.getPieceIdentite());
            p1.setCommentaires(p.getCommentaires());
            passagerRepository.save(p1);
            System.out.println("Votre passager a modifié ses infos personnelles");
        } else {
            System.err.println("Passager non trouvé pour l'ID : " + id);
        }
    }

    
}
