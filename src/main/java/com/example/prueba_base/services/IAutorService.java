package com.example.prueba_base.services;

import com.example.prueba_base.model.Autor;

import java.util.List;

public interface IAutorService {

    public List<Autor> findAll();

    public Autor  save(Autor c);
    
    public Autor findById(Integer id);

    public void delete(Integer id);
    
    public Autor findByNombre(String nombre);
    
    public List<Autor> findAllByNombreContaining(String nombre);
}
