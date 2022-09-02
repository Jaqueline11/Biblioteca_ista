package com.example.prueba_base.controller;


import com.example.prueba_base.model.Autor;
import com.example.prueba_base.services.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class AutorController {
    @Autowired
    private IAutorService autorService;
    @GetMapping("/listarautor")
    public List<Autor> indext(){
        return autorService.findAll();
    }

    @PostMapping("/crearautor")
    @ResponseStatus(HttpStatus.CREATED)
    public Autor save(@RequestBody Autor autor){
        return autorService.save(autor);
    }

    @GetMapping("/autor/{id}")
    public Autor findById(@PathVariable Integer id){
        return autorService.findById(id);
    }

    @PutMapping("/editarautor/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Autor editar(@RequestBody Autor autor, @PathVariable Integer id){
        Autor autoractual=autorService.findById(id);
        autoractual.setNombre(autor.getNombre());
        return autorService.save(autoractual);
    }

    @DeleteMapping("/eliminarautor/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void eliminar(@PathVariable int id){
        autorService.delete(id);
    }


}
