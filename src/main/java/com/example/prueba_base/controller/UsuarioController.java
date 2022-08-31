package com.example.prueba_base.controller;


import com.example.prueba_base.model.Usuarios;
import com.example.prueba_base.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;
    @GetMapping("/listarusuario")
    public List<Usuarios> indext(){
        return usuarioService.findAll();
    }

    @PostMapping("/crearusuario")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuarios save(@RequestBody Usuarios usuario){
        return usuarioService.save(usuario);
    }

    @GetMapping("/usuario/{id}")
    public Usuarios findById(@PathVariable Integer id){
        return usuarioService.findById(id);
    }

    @PutMapping("/editarusuario/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuarios editar(@RequestBody Usuarios usuario, @PathVariable Integer id){
        Usuarios usuarioactual=usuarioService.findById(id);
        usuarioactual.setIdPersona(usuario.getIdPersona());
        usuarioactual.setCalificacion(usuario.getCalificacion());
        usuarioactual.setObservaciones(usuario.getObservaciones());

        return usuarioService.save(usuarioactual);
    }




}
