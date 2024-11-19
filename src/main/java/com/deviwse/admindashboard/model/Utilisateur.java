package com.deviwse.admindashboard.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateToken;
    private String fullName;
    private String password;
    private String resetToken;
    private String role;
    private String username;
    private Date dateJoined;

    @ManyToOne
    private Entreprise entreprise;

    public Utilisateur() {
        super();
    }

    public Utilisateur(LocalDateTime dateToken, Long id, String fullName, String password, String resetToken, String role, String username, Date dateJoined, Entreprise entreprise) {
        this.dateToken = dateToken;
        this.id = id;
        this.fullName = fullName;
        this.password = password;
        this.resetToken = resetToken;
        this.role = role;
        this.username = username;
        this.dateJoined = dateJoined;
        this.entreprise = entreprise;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getResetToken() {
        return resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDateTime getDateToken() {
        return dateToken;
    }

    public void setDateToken(LocalDateTime dateToken) {
        this.dateToken = dateToken;
    }
}

