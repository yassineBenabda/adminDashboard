package com.deviwse.admindashboard.service;

import com.deviwse.admindashboard.model.Entreprise;
import com.deviwse.admindashboard.model.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    List<Utilisateur> getAllUtilisateur();
    boolean isUserActive(Long utilisateurId);
}
