package com.deviwse.admindashboard.service;

import com.deviwse.admindashboard.model.Entreprise;
import com.deviwse.admindashboard.repos.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EntrepriseServiceImpl implements EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    @Override
    public Entreprise setEntrepriseStatus(Long entrepriseId, Entreprise.Status status) {
        Entreprise entreprise = entrepriseRepository.findById(entrepriseId)
                .orElseThrow(() -> new RuntimeException("Entreprise not found"));

        entreprise.setStatus(status); // Set the status directly
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public boolean isEntrepriseActive(Long entrepriseId) {
        Entreprise entreprise = entrepriseRepository.findById(entrepriseId)
                .orElseThrow(() -> new RuntimeException("Entreprise not found"));

        // Check if the enterprise status is ACTIVE
        return entreprise.getStatus() == Entreprise.Status.ACTIVE;
    }

    @Override
    public Map<Long, Long> sumNumberOfUsersByEntreprise() {
        List<Object[]> results = entrepriseRepository.sumNumberOfUsersByEntreprise();
        Map<Long, Long> userSums = new HashMap<>();

        // Process the results and map them to Entreprise ID and user sum
        for (Object[] result : results) {
            Long entrepriseId = (Long) result[0];
            Long sum = (Long) result[1];
            userSums.put(entrepriseId, sum);
        }

        return userSums;
    }
}
