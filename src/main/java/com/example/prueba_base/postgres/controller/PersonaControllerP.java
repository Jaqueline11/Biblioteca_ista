package com.example.prueba_base.postgres.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba_base.postgres.services.IPersonaServiceP;
import com.example.prueba_base.postgres.models.PersonaP;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PersonaControllerP {
	@Autowired
    private IPersonaServiceP personaservice;
	
	/*
	 @GetMapping("/fenix")
	 public Map<String,PersonaP> xcedula(@RequestParam String cedula) {
		 return personaservice.buscaralumno(cedula);
	 }*/
	@GetMapping("/fenix")
	public PersonaP personacedula(@RequestParam String ced) {
		return personaservice.buscaralumno(ced);
	}
	
}
