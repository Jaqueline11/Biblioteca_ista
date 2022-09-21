package com.example.prueba_base.services;

import com.example.prueba_base.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
	
    public List<Persona> findAll();

    public Persona  save(Persona c);
    
    public Persona findById(Integer id);   
    
    public void delete(Integer id);

    
    Optional<Persona> findByUsuario(String usuario);

    Optional <Persona> findByUsuarioAndClave(String usuario, String clave);
    

    boolean validacionLogin(String usu, String password);
    
    int rolpersona(String usuario);

    boolean validacionActivo(String usu, String password);
}
