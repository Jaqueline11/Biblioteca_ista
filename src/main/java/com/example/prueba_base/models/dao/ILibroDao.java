package com.example.prueba_base.models.dao;

import com.example.prueba_base.model.Libro;
import org.springframework.data.repository.CrudRepository;

public interface ILibroDao extends CrudRepository<Libro,Integer> {
}
