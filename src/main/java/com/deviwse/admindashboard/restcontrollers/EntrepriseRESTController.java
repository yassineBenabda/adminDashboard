package com.deviwse.admindashboard.restcontrollers;

import com.deviwse.admindashboard.model.Entreprise;
import com.deviwse.admindashboard.repos.EntrepriseRepository;
import com.deviwse.admindashboard.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private EntrepriseService entrepriseService;

    @PostMapping("/{id}/status")
    public Entreprise updateStatus(@PathVariable Long id, @RequestParam Entreprise.Status status) {
        return entrepriseService.setEntrepriseStatus(id, status);
    }

    @GetMapping("/{id}/isActive")
    public boolean isEntrepriseActive(@PathVariable Long id) {
        return entrepriseService.isEntrepriseActive(id);
    }
}
