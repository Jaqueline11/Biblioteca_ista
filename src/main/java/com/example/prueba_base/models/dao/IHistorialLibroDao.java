package com.example.prueba_base.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.prueba_base.model.HistorialLibro;

public interface IHistorialLibroDao extends CrudRepository<HistorialLibro,Integer> {
}
