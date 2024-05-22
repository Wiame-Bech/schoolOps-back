package com.SchoolOps.SchoolOps.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
public class seance implements Serialisable{
    private static final long serialVersionUID = 1L;

    @Id
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_seance;

    @ManyToOne
    @JoinColumn(name = "id_filiere")
    private filiere filiere;

    @ManyToOne
    @JoinColumn(name = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "matiere_id")
    private matiere matiere;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Temporal(TemporalType.TIME)
    private Date debutSeance;

    @Temporal(TemporalType.TIME)
    private Date finSeance;

    // Constructeurs, getters et setters

    public seance() {
    }

    public seance(filiere filiere,User user, matiere matiere, Date date, Date debutSeance, Date finSeance) {
        this.filiere = filiere;
        this.user = user;
        this.matiere = matiere;
        this.date = date;
        this.debutSeance = debutSeance;
        this.finSeance = finSeance;
    }

    public Long getId_seance() {
        return id_seance;
    }

    public void setId_seance(Long id_seance) {
        this.id_seance = id_seance;
    }

    public filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(filiere filiere) {
        this.filiere = filiere;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(matiere matiere) {
        this.matiere = matiere;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDebutSeance() {
        return debutSeance;
    }

    public void setDebutSeance(Date debutSeance) {
        this.debutSeance = debutSeance;
    }

    public Date getFinSeance() {
        return finSeance;
    }

    public void setFinSeance(Date finSeance) {
        this.finSeance = finSeance;
    }


}