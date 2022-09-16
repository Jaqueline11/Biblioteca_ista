package com.example.prueba_base.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "autor")
public class Autor implements Serializable {
    //Myrian
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_autor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_autor;

    @Column(name = "nombre")
    private String nombre;
    
    @OneToMany
    @JoinColumn(name="id_autor")
    private List<AutorLibro> libros;

	

	public Integer getId_autor() {
		return id_autor;
	}

	public void setId_autor(Integer id_autor) {
		this.id_autor = id_autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<AutorLibro> getLibros() {
		return libros;
	}

	public void setLibros(List<AutorLibro> libros) {
		this.libros = libros;
	}
    
    
}
