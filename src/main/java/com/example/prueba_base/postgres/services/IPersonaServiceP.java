package com.example.prueba_base.postgres.services;


import com.example.prueba_base.postgres.models.PersonaP;

public interface IPersonaServiceP {
	
	public PersonaP buscaralumno(String ced);
	
	public PersonaP buscardocente(String ced);
}
