package com.example.prueba_base.services;



import com.example.prueba_base.model.HistorialLibro;

import java.util.List;


public interface IHistorialLibroService {

    public List<HistorialLibro> findAll();

    public HistorialLibro  save(HistorialLibro h);
    public HistorialLibro findById(Integer id);

    public void delete(Integer id);
}
