package com.example.prueba_base.models.dao;

import com.example.prueba_base.model.Autor;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IAutorDao extends CrudRepository<Autor,Integer> {
	
	Autor findByNombre(String nombre);
	
	List<Autor> findAllByNombreContaining(String nombre);
	
}
