package com.example.prueba_base.postgres.services;

import com.example.prueba_base.postgres.models.PersonaP;
import com.example.prueba_base.postgres.dao.IPersonaDaoP;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
public class PersonaServiceImpP implements IPersonaServiceP{
	
    private static final Logger LOGGER = LogManager.getLogger(PersonaServiceImpP.class);

    @Autowired
    private IPersonaDaoP personaDao;

	@Override
	@Transactional(readOnly = true)
	public Map<String, PersonaP> buscaralumno(String cedula) {
		return personaDao.buscaralumno(cedula);
	}

	@Override
	@Transactional(readOnly = true)
	public PersonaP buscaralumno2(String ced) {
        LOGGER.info(ced);
        LOGGER.debug(ced);
        LOGGER.error(ced);
		return personaDao.buscarpersona2(ced);
	}

	

}
