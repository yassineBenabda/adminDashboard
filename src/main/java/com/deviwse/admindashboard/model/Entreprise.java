package com.deviwse.admindashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "entreprise")
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String adresse;
    private String codetva;
    private String email;
    @Column(name = "entreprise_name")
    private String entrepriseName;

    private String gsm1;
    private String gsm2;
    private String raisonSociale;
    private String suffix;
    private String tel;
    private String ville;
    private int numberofuser;

    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status {
        ACTIVE, BLOCKED, TRIAL
    }

    @JsonIgnore
    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;

}




