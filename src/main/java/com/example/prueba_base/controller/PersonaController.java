package com.example.prueba_base.controller;

import com.example.prueba_base.model.Persona;
import com.example.prueba_base.model.Usuarios;
import com.example.prueba_base.model.Bibliotecarios;
import com.example.prueba_base.services.IBibliotecarioService;
import com.example.prueba_base.services.IPersonaService;
import com.example.prueba_base.services.IUsuarioService;
import com.example.prueba_base.services.UsuarioServiceImp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PersonaController {
    @Autowired
    private IPersonaService personaService;
    @Autowired
	private IUsuarioService usu;
    @Autowired
	private IBibliotecarioService bib;


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
    
    @GetMapping("/validarPersona")
    public Optional<Persona> validarPersona(@RequestParam("usuario") String usuario, @RequestParam("clave")String clave){
        if (personaService.validacionLogin(usuario,clave)){
            if (personaService.validacionActivo(usuario,clave)==true){
                return personaService.findByUsuario(usuario);
            }else {
                return null;
            }
        }else {
            System.out.println("No inicia");
            return null;
        }

    }
    
    @GetMapping("/tipocliente")
    public Object tipocliente(@RequestParam("id_persona") Integer id_persona, @RequestParam("rol")Integer rol){
    	Persona pp= personaService.findById(id_persona);
        switch (rol) {
		case 2: {
            return usu.findbyid_person(pp); 
		}	
		default:
			return bib.findbyid_person(pp); 
		}

    }
    
    @GetMapping("/tipocliente_usu")
    public Optional<Usuarios> tipoclienteusu(@RequestParam("id_persona") Integer id_persona, @RequestParam("rol")Integer rol){
    	Persona pp= personaService.findById(id_persona);
        return usu.findbyid_person(pp);
    }
    
    @GetMapping("/tipocliente_bib")
    public Optional<Bibliotecarios> tipoclientebib(@RequestParam("id_persona") Integer id_persona, @RequestParam("rol")Integer rol){
    	Persona pp= personaService.findById(id_persona);
        return bib.findbyid_person(pp);
    }
    
    @GetMapping("/num_rol")
    public int verificarrol(@RequestParam("usuario") String usuario) {
    	return personaService.rolpersona(usuario);
    }
}
