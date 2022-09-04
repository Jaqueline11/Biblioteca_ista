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
    private Integer idAutor;

    @Column(name = "nombre")
    private String nombre;
    
    @OneToMany(mappedBy = "autor")
    private List<AutorLibro> libros;

	public Integer getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
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
