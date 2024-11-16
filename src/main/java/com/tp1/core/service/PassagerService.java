package com.tp1.core.service;

import java.util.List;
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

    public PassagerEntite getPassagerParId(int id) {
        return passagerRepository.findById(id).orElse(null);
    }
    
    public List<PassagerEntite> getPassagersAvecPasseport(){
        return passagerRepository
            .findAll()
            .stream()
            .filter(p -> p.getPieceIdentite().equals("Passeport"))
            .collect(Collectors.toList());
    }
}
