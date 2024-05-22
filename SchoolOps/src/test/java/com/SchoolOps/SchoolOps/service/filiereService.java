package com.SchoolOps.SchoolOps.service;

import com.SchoolOps.SchoolOps.models.User;
import com.SchoolOps.SchoolOps.models.filiere;
import com.SchoolOps.SchoolOps.repository.filiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class filiereService {

    private final filiereRepository filiereRepository;

    @Autowired
    public filiereService(filiereRepository filiereRepository) {
        this.filiereRepository = filiereRepository;
    }

    public List<filiere> getAllFilieres() {
        return filiereRepository.findAll();
    }

    public Optional<filiere> getFiliereById(Long id) {
        return filiereRepository.findById(id);
    }

    public filiere saveFiliere(filiere filiere) {
        return filiereRepository.save(filiere);
    }

    public void deleteFiliere(Long id) {
        filiereRepository.deleteById(id);
    }


}
