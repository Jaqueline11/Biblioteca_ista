package com.example.prueba_base.models.dao;
import com.example.prueba_base.model.Prestamo;
import com.example.prueba_base.model.Usuarios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IPrestamoDao extends CrudRepository<Prestamo,Integer> {
	
	List<Prestamo> findAllByUsuario(Usuarios usuario);
	
	
    @Query(nativeQuery = true,value = "select * from prestamo where estado_prestamo = ?1")
	List<Prestamo> findAllByEstado_prestamo(String estado_prestamo);

}
