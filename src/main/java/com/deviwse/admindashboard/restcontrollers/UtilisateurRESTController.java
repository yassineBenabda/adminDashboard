package com.deviwse.admindashboard.restcontrollers;


import com.deviwse.admindashboard.model.Utilisateur;
import com.deviwse.admindashboard.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UtilisateurRESTController {

    @Autowired
    UtilisateurService utilisateurService;

    @GetMapping("/all")
    List<Utilisateur> getAllUtilisateur() {
        return utilisateurService.getAllUtilisateur();
    }

    @GetMapping("/{id}/isActive")
    public boolean isUserActive(@PathVariable Long id) {
        return utilisateurService.isUserActive(id);
    }
}
