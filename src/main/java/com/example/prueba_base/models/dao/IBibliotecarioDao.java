package com.example.prueba_base.models.dao;

import com.example.prueba_base.model.Bibliotecarios;
import org.springframework.data.repository.CrudRepository;

public interface IBibliotecarioDao extends CrudRepository<Bibliotecarios,Integer> {
}
