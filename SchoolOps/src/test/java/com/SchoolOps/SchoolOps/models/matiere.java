package com.SchoolOps.SchoolOps.models;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class matiere implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matiere_id;
    private String nom_matiere;

    // Constructors, getters, and setters

    public matiere() {
    }

    public matiere(String nom_matiere) {
        this.nom_matiere = nom_matiere;
    }

    public Long getMatiere_id() {
        return matiere_id;
    }

    public void setMatiere_id(Long matiere_id) {
        this.matiere_id = matiere_id;
    }

    public String getNom_matiere() {
        return nom_matiere;
    }

    public void setNom_matiere(String nom_matiere) {
        this.nom_matiere = nom_matiere;
    }

}
