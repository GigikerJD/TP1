package com.tp1.core.controleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tp1.core.entite.PassagerEntite;
import com.tp1.core.service.PassagerService;

@Controller
public class PassagerPage {

    @Autowired
    private PassagerService passagerService;

    @RequestMapping("/")
    public String redirectToPassagersPage(){
        return "redirect:/passagers-view";
    }

    @GetMapping("/passagers-view")
    public String getTouslesPassagers(Model model){
        List<PassagerEntite> passagers = passagerService.getPassagers();
        model.addAttribute("lesPassagers", passagers);
        return "tousLesPassagers";
    }
}
