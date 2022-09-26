package com.example.prueba_base.models.dao;

import com.example.prueba_base.model.Libro;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ILibroDao extends CrudRepository<Libro,Integer> {
	
	List<Libro> findAllByTituloContaining(String titulo);
	
}
