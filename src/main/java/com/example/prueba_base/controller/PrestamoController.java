package com.example.prueba_base.controller;

import java.util.List;

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

import com.example.prueba_base.model.Prestamo;
import com.example.prueba_base.services.IPrestamoService;

@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/api")
public class PrestamoController {
	@Autowired
	private IPrestamoService prestamoservice;
	
	@GetMapping("/listarprestamo")
	public List<Prestamo> indext(){
		return prestamoservice.findAll();
	}
	
	@PostMapping("/crearPrestamo")
	@ResponseStatus(HttpStatus.CREATED)
	public Prestamo save(@RequestBody Prestamo p) {
		return prestamoservice.save(p);
	}
	
	
	@GetMapping("/verprestamo/{id}")
	public Prestamo findById(@PathVariable int id){
		return prestamoservice.findById(id);
	}


	
	@PutMapping("/editarprestamo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Prestamo editar(@RequestBody Prestamo prestamo, @PathVariable int id){
		Prestamo prestamoactual=prestamoservice.findById(id);
		prestamoactual.setIdUsuario(prestamo.getIdUsuario());
		prestamoactual.setIdLibro(prestamo.getIdLibro());
		prestamoactual.setEstadoPrestamo(prestamo.getEstadoPrestamo());
		prestamoactual.setFechaEntrega(prestamo.getFechaEntrega());
		prestamoactual.setIdBibliotecarioEntrega(prestamo.getIdBibliotecarioEntrega());
		prestamoactual.setDocumentoHabilitante(prestamo.getDocumentoHabilitante());
		prestamoactual.setFechaRecibido(prestamo.getFechaRecibido());
		prestamoactual.setIdBibliotecarioRecibido(prestamo.getIdBibliotecarioRecibido());
		prestamoactual.setFechaMaxima(prestamo.getFechaMaxima());
		prestamoactual.setActivo(prestamo.getActivo());
		prestamoactual.setEscaneoMatriz(prestamo.getEscaneoMatriz());
		return prestamoservice.save(prestamoactual);
	}

	
	@DeleteMapping("/eliminarprestamo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void eliminar(@PathVariable int id){
		prestamoservice.delete(id);
	}
}
