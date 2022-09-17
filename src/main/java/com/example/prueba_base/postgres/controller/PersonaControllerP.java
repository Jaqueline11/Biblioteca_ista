package com.example.prueba_base.postgres.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba_base.postgres.services.IPersonaServiceP;
import com.example.prueba_base.postgres.models.PersonaP;

@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/api")
public class PersonaControllerP {
	@Autowired
    private IPersonaServiceP personaservice;
	

	@GetMapping("/fenix_alumno")
	public PersonaP personacedula(@RequestParam String ced) {
		return personaservice.buscaralumno(ced);
	}
	
}
