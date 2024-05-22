package com.SchoolOps.SchoolOps.service;

import com.SchoolOps.SchoolOps.models.filiere;
import com.SchoolOps.SchoolOps.models.matiere;
import com.SchoolOps.SchoolOps.repository.matiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class matiereService {

    private final matiereRepository matiereRepository;

    @Autowired
    public matiereService(matiereRepository matiereRepository ) {
        this.matiereRepository = matiereRepository;
    }

    public List<matiere> getAllMatiere() {
        return matiereRepository.findAll();
    }

    public Optional<matiere> getMatiereId(Long id) {
        return matiereRepository.findById(id);
    }

    public matiere saveMatiere(matiere matiere) {
        return matiereRepository.save(matiere);
    }
}

