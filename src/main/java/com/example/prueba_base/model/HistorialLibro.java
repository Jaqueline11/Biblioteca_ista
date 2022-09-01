package com.example.prueba_base.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "historial_libro")
public class HistorialLibro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historial_libro")
    private Integer idHistorialLibro;

    @Column(name = "id_libro")
    private Integer idLibro;

    @Column(name = "id_bibliotecario")
    private Integer idBibliotecario;

	public Integer getIdHistorialLibro() {
		return idHistorialLibro;
	}

	public void setIdHistorialLibro(Integer idHistorialLibro) {
		this.idHistorialLibro = idHistorialLibro;
	}

	public Integer getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}

	public Integer getIdBibliotecario() {
		return idBibliotecario;
	}

	public void setIdBibliotecario(Integer idBibliotecario) {
		this.idBibliotecario = idBibliotecario;
	}
    
   

}
