package com.example.prueba_base.controller;


import com.example.prueba_base.model.Libro;
import com.example.prueba_base.services.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class LibroController {
    @Autowired
    private ILibroService libroService;
    @GetMapping("/listarlibros")
    public List<Libro> indext(){
        return libroService.findAll();
    }

    @PostMapping("/crearlibro")
    @ResponseStatus(HttpStatus.CREATED)
    public Libro save(@RequestBody Libro libro){
        return libroService.save(libro);
    }

    @GetMapping("/libro/{id}")
    public Libro findById(@PathVariable Integer id){
        return libroService.findById(id);
    }

    @PutMapping("/editarlibros/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Libro editar(@RequestBody Libro libro, @PathVariable Integer id){
        Libro libroactual=libroService.findById(id);
        libroactual.setCodigo_dewey(libro.getCodigo_dewey());
        libroactual.setTitulo(libro.getTitulo());
        libroactual.setTipo(libro.getTipo());
        libroactual.setAdquisicion(libro.getAdquisicion());
        libroactual.setAnio_publicacion(libro.getAnio_publicacion());
        libroactual.setEditor(libro.getEditor());
        libroactual.setCiudad(libro.getCiudad());
        libroactual.setNum_paginas(libro.getNum_paginas());
        libroactual.setArea(libro.getArea());
        libroactual.setCod_ISBN(libro.getCod_ISBN());
        libroactual.setArea(libro.getArea());
        libroactual.setIdioma(libro.getIdioma());
        libroactual.setDescripcion(libro.getDescripcion());
        libroactual.setDimensiones(libro.getDimensiones());
        libroactual.setEstado_libro(libro.getEstado_libro());
        libroactual.setActivo(libro.getActivo());
        libroactual.setImagen(libro.getImagen());
        libroactual.setUrl_digital(libro.getUrl_digital());
        libroactual.setBibliotecario(libro.getBibliotecario());
        libroactual.setFecha_creacion(libro.getFecha_creacion());
        libroactual.setDisponibilidad(libro.getDisponibilidad());
        libroactual.setIndice_uno(libro.getIndice_uno());
        libroactual.setIndice_dos(libro.getIndice_dos());
        libroactual.setIndice_tres(libro.getIndice_tres());
        libroactual.setNombre_donante(libro.getNombre_donante());
        libroactual.setDocumento_donacion(libro.getDocumento_donacion());

        return libroService.save(libroactual);
    }

    @DeleteMapping("/eliminarlibro/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void eliminar(@PathVariable int id){
        libroService.delete(id);
    }


}
