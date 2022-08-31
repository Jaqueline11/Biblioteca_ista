package com.example.prueba_base.models.dao;
import com.example.prueba_base.model.Prestamo;

import org.springframework.data.repository.CrudRepository;

public interface IPrestamoDao extends CrudRepository<Prestamo,Integer> {
}
