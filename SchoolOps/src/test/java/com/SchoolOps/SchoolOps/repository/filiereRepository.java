package com.SchoolOps.SchoolOps.repository;

import com.SchoolOps.SchoolOps.models.filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface filiereRepository extends JpaRepository<filiere, Long> {
}

