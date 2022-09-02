package com.example.prueba_base.controller;


import com.example.prueba_base.model.AutorLibro;
import com.example.prueba_base.services.IAutorLibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class AutorLibroController {
    @Autowired
    private IAutorLibroService autorlibroService;
    @GetMapping("/listarautorlibro")
    public List<AutorLibro> indext(){
        return autorlibroService.findAll();
    }

    @PostMapping("/crearautorlibro")
    @ResponseStatus(HttpStatus.CREATED)
    public AutorLibro save(@RequestBody AutorLibro autorlibro){
        return autorlibroService.save(autorlibro);
    }

    @GetMapping("/autorlibro/{id}")
    public AutorLibro findById(@PathVariable Integer id){
        return autorlibroService.findById(id);
    }

    @PutMapping("/editarautorlibros/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public AutorLibro editar(@RequestBody AutorLibro autorlibro, @PathVariable Integer id){
        AutorLibro autorlibroactual=autorlibroService.findById(id);
        autorlibroactual.setIdAutor(autorlibro.getIdAutor());
    
        return autorlibroService.save(autorlibroactual);
    }

    @DeleteMapping("/eliminarautorlibro/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void eliminar(@PathVariable int id){
        autorlibroService.delete(id);
    }


}
