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

import com.example.prueba_base.model.HistorialLibro;
import com.example.prueba_base.model.Prestamo;
import com.example.prueba_base.model.Tipo;
import com.example.prueba_base.services.IHistorialLibroService;
import com.example.prueba_base.services.IPrestamoService;
import com.example.prueba_base.services.ITipoService;

@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/api")
public class HistorialLibroController {
	@Autowired
	private IHistorialLibroService historialservice;
	
	@GetMapping("/listarhistorial")
	public List<HistorialLibro> indext(){
		return historialservice.findAll();
	}
	
	@PostMapping("/crearhistorial")
	@ResponseStatus(HttpStatus.CREATED)
	public HistorialLibro save(@RequestBody HistorialLibro t) {
		return historialservice.save(t);
	}
	
	
	@GetMapping("/HistorialLibro/{id}")
	public HistorialLibro findById(@PathVariable int id){
		return historialservice.findById(id);
	}


	
	@PutMapping("/editarhistorial/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public HistorialLibro editar(@RequestBody HistorialLibro historiallibro, @PathVariable int id){
		HistorialLibro historiaactual=historialservice.findById(id);
		historiaactual.setBibliotecario(historiallibro.getBibliotecario());
		historiaactual.setId_historial_libro(historiallibro.getId_historial_libro());
		historiaactual.setLibro(historiallibro.getLibro());
		return historialservice.save(historiaactual);
	}

	
	@DeleteMapping("/eliminarhistorial/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void eliminar(@PathVariable int id){
		historialservice.delete(id);
	}
}
