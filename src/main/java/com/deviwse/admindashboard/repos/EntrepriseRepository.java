package com.deviwse.admindashboard.repos;

import com.deviwse.admindashboard.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource(path = "entreprise")
@CrossOrigin(origins = "http://localhost:4200/")
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

    @Query("SELECT e.id, SUM(e.numberofuser) FROM Entreprise e GROUP BY e.id")
    List<Object[]> sumNumberOfUsersByEntreprise();
}
