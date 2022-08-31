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
    @GetMapping("/listalibros")
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
        libroactual.setCodigoDewey(libro.getCodigoDewey());
        libroactual.setTitulo(libro.getTitulo());
        libroactual.setIdTipo(libro.getIdTipo());
        libroactual.setAdquisicion(libro.getAdquisicion());
        libroactual.setAnioPublicacion(libro.getAnioPublicacion());
        libroactual.setEditor(libro.getEditor());
        libroactual.setCiudad(libro.getCiudad());
        libroactual.setNumPaginas(libro.getNumPaginas());
        libroactual.setArea(libro.getArea());
        libroactual.setCodIsbn(libro.getCodIsbn());
        libroactual.setArea(libro.getArea());
        libroactual.setIdioma(libro.getIdioma());
        libroactual.setDescripcion(libro.getDescripcion());
        libroactual.setDimensiones(libro.getDimensiones());
        libroactual.setEstadoLibro(libro.getEstadoLibro());
        libroactual.setActivo(libro.getActivo());
        libroactual.setImagen(libro.getImagen());
        libroactual.setUrlDigital(libro.getUrlDigital());
        libroactual.setIdBibliotecario(libro.getIdBibliotecario());
        libroactual.setFechaCreacion(libro.getFechaCreacion());
        libroactual.setDisponibilidad(libro.getDisponibilidad());
        libroactual.setIndiceUno(libro.getIndiceUno());
        libroactual.setIndiceDos(libro.getIndiceDos());
        libroactual.setIndiceTres(libro.getIndiceTres());
        libroactual.setNombreDonante(libro.getNombreDonante());
        libroactual.setDocumentoDonacion(libro.getDocumentoDonacion());

        return libroService.save(libroactual);
    }




}
