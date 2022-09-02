package com.example.prueba_base.services;

import com.example.prueba_base.model.AutorLibro;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IAutorLibroService {

    public List<AutorLibro> findAll();

    public AutorLibro  save(AutorLibro c);
    public AutorLibro findById(Integer id);

    public void delete(Integer id);
}
