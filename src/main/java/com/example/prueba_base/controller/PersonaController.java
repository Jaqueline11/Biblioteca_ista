package com.example.prueba_base.controller;

import com.example.prueba_base.services.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PersonaController {
    @Autowired
    private IPersonaService personaService;


    @GetMapping("/validarLogin")
    public boolean validarLogin(@RequestParam("usuario") String usuario, @RequestParam("clave")String clave){
        if (personaService.validacionLogin(usuario,clave)){
            if (personaService.validacionActivo(usuario,clave)==true){
                return true;
            }else {
                return false;
            }
        }else {
            System.out.println("No inicia");
            return false;
        }

    }
    
    @GetMapping("/num_rol")
    public int verificarrol(@RequestParam("usuario") String usuario) {
    	return personaService.rolpersona(usuario);
    }
}
