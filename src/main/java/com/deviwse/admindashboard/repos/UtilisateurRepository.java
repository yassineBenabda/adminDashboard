package com.deviwse.admindashboard.repos;

import com.deviwse.admindashboard.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
;

@RepositoryRestResource(path="api")
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}

