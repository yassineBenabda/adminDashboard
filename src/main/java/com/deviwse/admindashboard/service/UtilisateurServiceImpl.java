package com.deviwse.admindashboard.service;

import com.deviwse.admindashboard.model.Entreprise;
import com.deviwse.admindashboard.model.Utilisateur;
import com.deviwse.admindashboard.repos.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    private UtilisateurService utilisateurService;

    @Override
    public List<Utilisateur> getAllUtilisateur() {
        return utilisateurService.getAllUtilisateur();
    }
}
