package com.deviwse.admindashboard;

import com.deviwse.admindashboard.model.Entreprise;
import com.deviwse.admindashboard.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class AdminDashboardApplication implements CommandLineRunner {

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(AdminDashboardApplication.class, args);
    }

    @Override
    public void run(String... args)throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Utilisateur.class,Entreprise.class);
    }
}
