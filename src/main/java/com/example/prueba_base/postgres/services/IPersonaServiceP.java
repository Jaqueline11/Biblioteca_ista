package com.example.prueba_base.postgres.services;

import java.util.Map;

import com.example.prueba_base.postgres.models.PersonaP;

public interface IPersonaServiceP {
    
	public Map<String,PersonaP> buscaralumno(String cedula);  
	
	public PersonaP buscaralumno2(String ced);
	
}
