package com.example.prueba_base.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba_base.model.Persona;
import com.example.prueba_base.model.Prestamo;
import com.example.prueba_base.model.Usuarios;
import com.example.prueba_base.services.IPrestamoService;
import com.example.prueba_base.services.IUsuarioService;
import com.example.prueba_base.services.IPersonaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PrestamoController {
	@Autowired
	private IPrestamoService prestamoservice;
	@Autowired
	private IPersonaService personaservice;
	@Autowired
	private IUsuarioService usuarioservice;
	
	@GetMapping("/listarprestamo")
	public List<Prestamo> indext(){
		return prestamoservice.findAll();
	}
	
	@PostMapping("/crearPrestamo")
	@ResponseStatus(HttpStatus.CREATED)
	public Prestamo save(@RequestBody Prestamo p) {
		return prestamoservice.save(p);
	}
	
	
	@GetMapping("/prestamo/{id}")
	public Prestamo findById(@PathVariable int id){
		return prestamoservice.findById(id);
	}


	
	@PutMapping("/editarprestamo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Prestamo editar(@RequestBody Prestamo prestamo, @PathVariable int id){
		Prestamo prestamoactual=prestamoservice.findById(id);
		prestamoactual.setUsuario(prestamo.getUsuario());
		prestamoactual.setLibro(prestamo.getLibro());
		prestamoactual.setEstado_prestamo(prestamo.getEstado_prestamo());
		prestamoactual.setFecha_entrega(prestamo.getFecha_entrega());
		prestamoactual.setBibliotecario_entrega(prestamo.getBibliotecario_entrega());
		prestamoactual.setDocumento_habilitante(prestamo.getDocumento_habilitante());
		prestamoactual.setFecha_recibido(prestamo.getFecha_recibido());
		prestamoactual.setBibliotecario_recibido(prestamo.getBibliotecario_recibido());
		prestamoactual.setFecha_maxima(prestamo.getFecha_maxima());
		prestamoactual.setActivo(prestamo.getActivo());
		prestamoactual.setEscaneo_matriz(prestamo.getEscaneo_matriz());
		return prestamoservice.save(prestamoactual);
	}

	
	@DeleteMapping("/eliminarprestamo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void eliminar(@PathVariable int id){
		prestamoservice.delete(id);
	}
	
	@GetMapping("/listarprestamoxcedula/{cedula}")
	public List<Prestamo> indice(@PathVariable String cedula){
		Optional<Persona> p=personaservice.findByCedula(cedula);
		Optional<Usuarios> u = usuarioservice.findbyid_person(p.orElse(null));
		return prestamoservice.findAllByUsuario(u);
	}
	
	@GetMapping("/listarprestamoxestado/{estado_prestamo}")
	public List<Prestamo> prestamoxestado(@PathVariable String estado_prestamo){
		return prestamoservice.findAllByEstado_prestamo(estado_prestamo);
	}
	
}
