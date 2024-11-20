package com.deviwse.admindashboard.service;

import com.deviwse.admindashboard.enums.Status;
import com.deviwse.admindashboard.model.Entreprise;

public interface EntrepriseService {
    Entreprise setEntrepriseStatus(Long entrepriseId, Entreprise.Status status);
    boolean isEntrepriseActive(Long entrepriseId);
}


