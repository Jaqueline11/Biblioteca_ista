package com.example.prueba_base.services;

import com.example.prueba_base.model.Libro;
import com.example.prueba_base.model.Prestamo;
import com.example.prueba_base.model.Tipo;

import java.util.List;

import org.springframework.stereotype.Service;


public interface ITipoService {

    public List<Tipo> findAll();

    public Tipo  save(Tipo t);
    public Tipo findById(Integer id);

    public void delete(Integer id);
}
