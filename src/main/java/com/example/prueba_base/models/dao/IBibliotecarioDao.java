package com.example.prueba_base.models.dao;

import com.example.prueba_base.model.Bibliotecarios;
import com.example.prueba_base.model.Persona;
import com.example.prueba_base.model.Usuarios;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IBibliotecarioDao extends CrudRepository<Bibliotecarios,Integer> {
	
    Optional<Bibliotecarios> findByPersona(Persona persona);
}
