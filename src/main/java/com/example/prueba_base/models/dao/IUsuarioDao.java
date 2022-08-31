package com.example.prueba_base.models.dao;

import com.example.prueba_base.model.Usuarios;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuarios,Integer> {
}
