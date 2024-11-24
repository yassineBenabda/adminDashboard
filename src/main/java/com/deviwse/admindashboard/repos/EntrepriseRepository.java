package com.deviwse.admindashboard.repos;

import com.deviwse.admindashboard.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "entreprise")
@CrossOrigin(origins = "http://localhost:4200/")
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

}
