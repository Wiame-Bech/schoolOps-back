package com.SchoolOps.SchoolOps.controllers;

import com.SchoolOps.SchoolOps.models.filiere;
import com.SchoolOps.SchoolOps.service.filiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class filiereController {

    @Autowired
    private filiereService filiereService ;


}