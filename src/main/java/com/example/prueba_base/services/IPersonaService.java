package com.example.prueba_base.services;

import com.example.prueba_base.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPersonaService {

    public List<Persona> findAll();

    public Persona  save(Persona c);
    public Persona findById(Integer id);

    public void delete(Integer id);
}
