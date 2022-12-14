package com.example.prueba_base.controller;


import com.example.prueba_base.model.Bibliotecarios;
import com.example.prueba_base.services.IBibliotecarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class BibliotecarioController {
    @Autowired
    private IBibliotecarioService bibliotecarioService;
    @GetMapping("/listarbibliotecario")
    public List<Bibliotecarios> indext(){
        return bibliotecarioService.findAll();
    }

    @PostMapping("/crearbibliotecario")
    @ResponseStatus(HttpStatus.CREATED)
    public Bibliotecarios save(@RequestBody Bibliotecarios bibliotecario){
        return bibliotecarioService.save(bibliotecario);
    }

    @GetMapping("/bibliotecario/{id}")
    public Bibliotecarios findById(@PathVariable Integer id){
        return bibliotecarioService.findById(id);
    }

    @PutMapping("/editarbibliotecario/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Bibliotecarios editar(@RequestBody Bibliotecarios bibliotecario, @PathVariable Integer id){
        Bibliotecarios bibliotecarioactual=bibliotecarioService.findById(id);
        bibliotecarioactual.setPersona(bibliotecario.getPersona());
        bibliotecarioactual.setFecha_inicio(bibliotecario.getFecha_inicio());
        bibliotecarioactual.setFecha_fin(bibliotecario.getFecha_fin());
        bibliotecarioactual.setActivo_bibliotecario(bibliotecario.getActivo_bibliotecario());
        return bibliotecarioService.save(bibliotecarioactual);
    }

    @DeleteMapping("/eliminarbibliotecario/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void eliminar(@PathVariable int id){
        bibliotecarioService.delete(id);
    }
    
    
    @GetMapping("/bibliotecario_x_cedula")
   	public Optional<Bibliotecarios> bibliotecarioscedula(@RequestParam String ced) {
   		return bibliotecarioService.buscarporcedula(ced);
   	}

}
