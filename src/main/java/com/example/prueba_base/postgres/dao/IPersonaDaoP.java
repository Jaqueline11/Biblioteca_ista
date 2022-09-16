package com.example.prueba_base.postgres.dao;

import com.example.prueba_base.postgres.models.PersonaP;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface IPersonaDaoP extends CrudRepository<PersonaP,String> {
	
    public static final Logger LOGGER = LogManager.getLogger(IPersonaDaoP.class);


	@Procedure(value = "datos_istateca")
	public PersonaP buscaralumno(@Param("ced") String ced);	
}
