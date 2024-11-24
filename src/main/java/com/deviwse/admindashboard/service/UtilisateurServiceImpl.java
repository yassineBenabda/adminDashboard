package com.deviwse.admindashboard.service;

import com.deviwse.admindashboard.model.Entreprise;
import com.deviwse.admindashboard.model.Utilisateur;
import com.deviwse.admindashboard.repos.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    private UtilisateurService utilisateurService;

    @Override
    public List<Utilisateur> getAllUtilisateur() {
        return utilisateurRepository.findAll();    }

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Override
    public boolean isUserActive(Long utilisateurId) {
        Utilisateur utilisateur = utilisateurRepository.findById(utilisateurId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // A user is active only if their entreprise's status is ACTIVE
        return utilisateur.getEntreprise().getStatus() == Entreprise.Status.ACTIVE;
    }
}
