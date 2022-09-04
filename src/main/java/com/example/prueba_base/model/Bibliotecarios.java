package com.example.prueba_base.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "bibliotecarios")
public class Bibliotecarios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bibliotecario", nullable = false)
    private Integer idBibliotecario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona",referencedColumnName = "id_persona")
    private Persona persona;

    @Column(name = "rol")
    private Integer rol;

    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    private Date fechaFin;

    @Column(name = "activo_bibliotecario")
    private Boolean activoBibliotecario;    
    
    
    @OneToMany(mappedBy = "bibliotecario_entrega")
    private List<Prestamo> prestamos_ent;
    
    @OneToMany(mappedBy = "bibliotecario_recibido")
    private List<Prestamo> prestamos_rec;
    
    @OneToMany(mappedBy = "bibliotecario")
    private List<Libro> libros;
    

	public Integer getIdBibliotecario() {
		return idBibliotecario;
	}

	public void setIdBibliotecario(Integer idBibliotecario) {
		this.idBibliotecario = idBibliotecario;
	}

	public Persona get_persona() {
		return persona;
	}

	public void set_persona(Persona b_persona) {
		this.persona = b_persona;
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

	public Boolean getActivoBibliotecario() {
		return activoBibliotecario;
	}

	public void setActivoBibliotecario(Boolean activoBibliotecario) {
		this.activoBibliotecario = activoBibliotecario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public List<Prestamo> getPrestamos_ent() {
		return prestamos_ent;
	}

	public void setPrestamos_ent(List<Prestamo> prestamos_ent) {
		this.prestamos_ent = prestamos_ent;
	}

	public List<Prestamo> getPrestamos_rec() {
		return prestamos_rec;
	}

	public void setPrestamos_rec(List<Prestamo> prestamos_rec) {
		this.prestamos_rec = prestamos_rec;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
	

    
}
