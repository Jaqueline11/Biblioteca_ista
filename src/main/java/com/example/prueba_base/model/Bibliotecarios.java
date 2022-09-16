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
    private Integer id_bibliotecario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona",referencedColumnName = "id_persona")
    private Persona persona;

    @Column(name = "fecha_inicio")
    private Date fecha_inicio;

    @Column(name = "fecha_fin")
    private Date fecha_fin;

    @Column(name = "activo_bibliotecario")
    private Boolean activo_bibliotecario;    
    
    
    @OneToMany(mappedBy = "bibliotecario_entrega")
    @JoinColumn(name="id_bibliotecario")
    private List<Prestamo> prestamos_ent;
    
    @OneToMany(mappedBy = "bibliotecario_recibido")
    @JoinColumn(name="id_bibliotecario")
    private List<Prestamo> prestamos_rec;
    
    @OneToMany(mappedBy = "bibliotecario")
    @JoinColumn(name="id_bibliotecario")
    private List<Libro> libros;
    
    @OneToMany(mappedBy = "bibliotecario")
    @JoinColumn(name="id_libro")
    private List<HistorialLibro> historial;

	public Integer getId_bibliotecario() {
		return id_bibliotecario;
	}

	public void setId_bibliotecario(Integer id_bibliotecario) {
		this.id_bibliotecario = id_bibliotecario;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public Boolean getActivo_bibliotecario() {
		return activo_bibliotecario;
	}

	public void setActivo_bibliotecario(Boolean activo_bibliotecario) {
		this.activo_bibliotecario = activo_bibliotecario;
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
