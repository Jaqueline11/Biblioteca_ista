package com.example.prueba_base.postgres.dao;

import com.example.prueba_base.postgres.models.PersonaP;
import com.example.prueba_base.postgres.services.PersonaServiceImpP;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaDaoP extends JpaRepository<PersonaP,String> {
	
    public static final Logger LOGGER = LogManager.getLogger(IPersonaDaoP.class);

	
	@Query(value="{select id,cedula,celular,correo,nombres from datos_istateca(?1)}",nativeQuery = true)
	PersonaP buscarpersona(String cedula);
	
	@Procedure(value = "buscaralumno")
	public Map <String,PersonaP> buscaralumno(@Param("ced")String cedula);	

	@Procedure(value = "datos_istateca")
	public PersonaP buscarpersona2(@Param("ced") String ced);	
}
