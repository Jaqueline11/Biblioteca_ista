package com.example.prueba_base.services;

import com.example.prueba_base.model.Libro;

import java.util.List;

public interface ILibroService {

    public List<Libro> findAll();

    public Libro  save(Libro c);
    
    public Libro findById(Integer id);

    public void delete(Integer id);
    
    public List<Libro> findAllByTituloLike(String titulo);
}
