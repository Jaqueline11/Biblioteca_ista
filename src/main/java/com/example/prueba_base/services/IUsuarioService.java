package com.example.prueba_base.services;

import com.example.prueba_base.model.Usuarios;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUsuarioService {

    public List<Usuarios> findAll();

    public Usuarios  save(Usuarios c);
    public Usuarios findById(Integer id);

    public void delete(Integer id);
}
