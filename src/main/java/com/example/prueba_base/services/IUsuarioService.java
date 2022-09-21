package com.example.prueba_base.services;

import com.example.prueba_base.model.Persona;
import com.example.prueba_base.model.Usuarios;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    public List<Usuarios> findAll();

    public Usuarios  save(Usuarios c);
    
    public Usuarios findById(Integer id);
    
    public Optional<Usuarios> findbyid_person (Persona pp);

    public void delete(Integer id);
}
