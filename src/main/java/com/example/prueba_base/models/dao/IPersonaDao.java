package com.example.prueba_base.models.dao;

import com.example.prueba_base.model.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IPersonaDao extends CrudRepository<Persona,Integer> {

    Optional<Persona> findByUsuario(String usuario);

    Optional <Persona> findByUsuarioAndClave(String usuario, String clave);
}
