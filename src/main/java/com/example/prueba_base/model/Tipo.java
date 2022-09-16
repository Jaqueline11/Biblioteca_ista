package com.example.prueba_base.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "tipo")
public class Tipo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_tipo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tipo;

    @Column(name = "nombre")
    private String nombre;
    
    @OneToMany
    @JoinColumn(name="id_tipo")
    private List<Libro> libros;
    
    

	
	public Integer getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(Integer id_tipo) {
		this.id_tipo = id_tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    

}
