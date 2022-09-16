package com.example.prueba_base.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "historial_libro")
public class HistorialLibro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historial_libro")
    private Integer id_historial_libro;

    @ManyToOne
    @JoinColumn(name = "id_libro",referencedColumnName = "id_libro")
    private Libro libro;
    
    @ManyToOne
    @JoinColumn(name = "id_bibliotecario",referencedColumnName = "id_bibliotecario")
    private Bibliotecarios bibliotecario;
    

   

	public Integer getId_historial_libro() {
		return id_historial_libro;
	}

	public void setId_historial_libro(Integer id_historial_libro) {
		this.id_historial_libro = id_historial_libro;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Bibliotecarios getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(Bibliotecarios bibliotecario) {
		this.bibliotecario = bibliotecario;
	}
	

	
	
	
    
   

}
