package com.example.prueba_base.services;

import com.example.prueba_base.model.Prestamo;
import com.example.prueba_base.model.Usuarios;

import java.util.List;
import java.util.Optional;

public interface IPrestamoService {

    public List<Prestamo> findAll();
    
    public List<Prestamo> findAllByUsuario(Optional<Usuarios> u);
    
    public List<Prestamo> findAllByEstado_prestamo(String estado_prestamo);

    public Prestamo  save(Prestamo p);
    
    public Prestamo findById(Integer id);

    public void delete(Integer id);
}
