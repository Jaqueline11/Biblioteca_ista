package com.example.prueba_base.services;

import com.example.prueba_base.model.Bibliotecarios;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IBibliotecarioService {

    public List<Bibliotecarios> findAll();

    public Bibliotecarios  save(Bibliotecarios c);
    public Bibliotecarios findById(Integer id);

    public void delete(Integer id);
}
