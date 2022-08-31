package com.example.prueba_base.models.dao;

import com.example.prueba_base.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona,Integer> {
}
