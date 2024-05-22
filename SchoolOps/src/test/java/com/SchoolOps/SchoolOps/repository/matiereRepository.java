package com.SchoolOps.SchoolOps.repository;

import com.SchoolOps.SchoolOps.models.matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface matiereRepository extends JpaRepository<matiere, Long> {
}
