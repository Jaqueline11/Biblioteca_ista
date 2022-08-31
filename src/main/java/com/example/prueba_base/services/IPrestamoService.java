package com.example.prueba_base.services;

import com.example.prueba_base.model.Libro;
import com.example.prueba_base.model.Prestamo;

import java.util.List;

import org.springframework.stereotype.Service;


public interface IPrestamoService {

    public List<Prestamo> findAll();

    public Prestamo  save(Prestamo p);
    public Prestamo findById(Integer id);

    public void delete(Integer id);
}
