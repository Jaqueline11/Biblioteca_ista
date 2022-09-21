package com.example.prueba_base.services;

import com.example.prueba_base.model.Bibliotecarios;
import com.example.prueba_base.model.Persona;

import java.util.List;
import java.util.Optional;

public interface IBibliotecarioService {

    public List<Bibliotecarios> findAll();

    Optional<Bibliotecarios> buscarporcedula(String cedula);

    public Bibliotecarios  save(Bibliotecarios c);
    
    public Bibliotecarios findById(Integer id);

    public void delete(Integer id);
    
    public Optional<Bibliotecarios> findbyid_person (Persona pp);
}
