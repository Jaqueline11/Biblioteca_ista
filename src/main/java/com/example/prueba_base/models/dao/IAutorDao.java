package com.example.prueba_base.models.dao;

import com.example.prueba_base.model.Autor;
import org.springframework.data.repository.CrudRepository;

public interface IAutorDao extends CrudRepository<Autor,Integer> {
}
