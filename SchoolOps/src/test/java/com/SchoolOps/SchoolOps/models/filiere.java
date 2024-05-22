package com.SchoolOps.SchoolOps.models;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class filiere  implements Serialisable{
    private static final long serialVersionUID = 1L;

    @Id
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_filiere;
    private String libelle;
    private String description;

    // Constructeurs, getters et setters

    public filiere() {
    }

    public filiere(String libelle, String description) {
        this.libelle = libelle;
        this.description = description;
    }

    public Long getId_filiere() {
        return id_filiere;
    }

    public void setId_filiere(Long id_filiere) {
        this.id_filiere = id_filiere;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
