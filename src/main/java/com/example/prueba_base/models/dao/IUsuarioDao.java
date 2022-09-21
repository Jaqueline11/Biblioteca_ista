package com.example.prueba_base.models.dao;

import com.example.prueba_base.model.Persona;
import com.example.prueba_base.model.Usuarios;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuarios,Integer> {
	
    Optional<Usuarios> findByPersona(Persona p);

}
