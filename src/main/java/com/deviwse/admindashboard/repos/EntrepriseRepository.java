package com.deviwse.admindashboard.repos;

import com.deviwse.admindashboard.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "entreprise")
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

}
