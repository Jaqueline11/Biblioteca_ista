package com.example.prueba_base.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "autorlibro",  uniqueConstraints=
@UniqueConstraint(columnNames={"id_libro", "id_autor"}))
public class AutorLibro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_autorlibro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_autorlibro;

    @ManyToOne
    @JoinColumn(name = "id_libro",referencedColumnName = "id_libro")
    private Libro libro;
 
    @ManyToOne
    @JoinColumn(name = "id_autor",referencedColumnName = "id_autor")
    private Autor autor; 
    
    
	public Integer getId_autorlibro() {
		return id_autorlibro;
	}

	public void setId_autorlibro(Integer id_libro) {
		this.id_autorlibro = id_libro;
	}

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
