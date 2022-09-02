package com.example.prueba_base.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "bibliotecarios")
public class Bibliotecarios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bibliotecario", nullable = false)
    private Integer idBibliotecario;

    @Column(name = "id_persona")
    private Integer idPersona;

    @Column(name = "rol")
    private Integer rol;

    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    private Date fechaFin;

    @Column(name = "activo_bibliotecario")
    private Integer activoBibliotecario;

	public Integer getIdBibliotecario() {
		return idBibliotecario;
	}

	public void setIdBibliotecario(Integer idBibliotecario) {
		this.idBibliotecario = idBibliotecario;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public Integer getRol() {
		return rol;
	}

	public void setRol(Integer rol) {
		this.rol = rol;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Integer getActivoBibliotecario() {
		return activoBibliotecario;
	}

	public void setActivoBibliotecario(Integer activoBibliotecario) {
		this.activoBibliotecario = activoBibliotecario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}
