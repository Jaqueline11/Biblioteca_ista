package com.example.prueba_base.models.dao;
import com.example.prueba_base.model.Prestamo;
import com.example.prueba_base.model.Usuarios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IPrestamoDao extends CrudRepository<Prestamo,Integer> {
	
	List<Prestamo> findAllByUsuario(Usuarios usuario);
}
