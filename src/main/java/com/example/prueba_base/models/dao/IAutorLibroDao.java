package com.example.prueba_base.models.dao;

import com.example.prueba_base.model.AutorLibro;
import org.springframework.data.repository.CrudRepository;

public interface IAutorLibroDao extends CrudRepository<AutorLibro,Integer> {
}
