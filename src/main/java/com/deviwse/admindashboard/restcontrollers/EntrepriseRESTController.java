package com.deviwse.admindashboard.restcontrollers;

import com.deviwse.admindashboard.model.Entreprise;
import com.deviwse.admindashboard.repos.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/entreprise")
@CrossOrigin("*")
public class EntrepriseRESTController {

    @Autowired
    EntrepriseRepository entrepriseRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Entreprise> getAllEntreprise() {
        return entrepriseRepository.findAll();
    }
}
