package com.example.prueba_base.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "autorlibro")
@IdClass(value = AutorLibroPK.class)
public class AutorLibro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_libro",referencedColumnName = "id_libro")
    private Libro libro;
    @Id
    @ManyToOne
    @JoinColumn(name = "id_autor",referencedColumnName = "id_autor")
    private Autor autor; 
    
    

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    

}
