package com.example.prueba_base.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "prestamo")
public class Prestamo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_prestamo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_prestamo;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario",referencedColumnName = "id_usuario")
    private Usuarios usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_libro",referencedColumnName = "id_libro")
    private Libro libro;

    @Column(name = "estado_libro")
    private String estado_libro;

    @Column(name = "estado_prestamo")
    private String estado_prestamo;

    @Column(name = "fecha_entrega")
    private Date fecha_entrega;

    @ManyToOne
    @JoinColumn(name = "id_bibliotecario_entrega",referencedColumnName = "id_bibliotecario")
    private Bibliotecarios bibliotecario_entrega;

    @Column(name = "documento_habilitante")
    private String documento_habilitante;

    @Column(name = "fecha_recibido")
    private Date fecha_recibido;

    @ManyToOne
    @JoinColumn(name = "id_bibliotecario_recibido",referencedColumnName = "id_bibliotecario")
    private Bibliotecarios bibliotecario_recibido;

    @Column(name = "fecha_maxima")
    private Date fecha_maxima;

    @Column(name = "activo")
    private Boolean activo;

    @Column(name = "escaneo_matriz")
    private byte[] escaneo_matriz;

	public Integer getId_prestamo() {
		return id_prestamo;
	}

	public void setId_prestamo(Integer id_prestamo) {
		this.id_prestamo = id_prestamo;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String getEstado_libro() {
		return estado_libro;
	}

	public void setEstado_libro(String estado_libro) {
		this.estado_libro = estado_libro;
	}

	public String getEstado_prestamo() {
		return estado_prestamo;
	}

	public void setEstado_prestamo(String estado_prestamo) {
		this.estado_prestamo = estado_prestamo;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public Bibliotecarios getBibliotecario_entrega() {
		return bibliotecario_entrega;
	}

	public void setBibliotecario_entrega(Bibliotecarios bibliotecario_entrega) {
		this.bibliotecario_entrega = bibliotecario_entrega;
	}

	public String getDocumento_habilitante() {
		return documento_habilitante;
	}

	public void setDocumento_habilitante(String documento_habilitante) {
		this.documento_habilitante = documento_habilitante;
	}

	public Date getFecha_recibido() {
		return fecha_recibido;
	}

	public void setFecha_recibido(Date fecha_recibido) {
		this.fecha_recibido = fecha_recibido;
	}

	public Bibliotecarios getBibliotecario_recibido() {
		return bibliotecario_recibido;
	}

	public void setBibliotecario_recibido(Bibliotecarios bibliotecario_recibido) {
		this.bibliotecario_recibido = bibliotecario_recibido;
	}

	public Date getFecha_maxima() {
		return fecha_maxima;
	}

	public void setFecha_maxima(Date fecha_maxima) {
		this.fecha_maxima = fecha_maxima;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public byte[] getEscaneo_matriz() {
		return escaneo_matriz;
	}

	public void setEscaneo_matriz(byte[] escaneo_matriz) {
		this.escaneo_matriz = escaneo_matriz;
	}
    
    
    
    
	
    
    
    

}
