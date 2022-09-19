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

import com.example.prueba_base.model.Tipo;
import com.example.prueba_base.services.ITipoService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class TipoController {
	@Autowired
	private ITipoService tiposervice;
	
	@GetMapping("/listartipo")
	public List<Tipo> indext(){
		return tiposervice.findAll();
	}
	
	@PostMapping("/creartipo")
	@ResponseStatus(HttpStatus.CREATED)
	public Tipo save(@RequestBody Tipo t) {
		return tiposervice.save(t);
	}
	
	
	@GetMapping("/tipo/{id}")
	public Tipo findById(@PathVariable int id){
		return tiposervice.findById(id);
	}


	
	@PutMapping("/editartipo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Tipo editar(@RequestBody Tipo tipo, @PathVariable int id){
		Tipo tipoactual=tiposervice.findById(id);
		tipoactual.setNombre(tipo.getNombre());
		return tiposervice.save(tipoactual);
	}

	
	@DeleteMapping("/eliminartipo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void eliminar(@PathVariable int id){
		tiposervice.delete(id);
	}
}
