package com.example.prueba_base.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import com.example.prueba_base.model.Bibliotecarios;
import com.example.prueba_base.model.Usuarios;
import com.example.prueba_base.model.Libro;

@Data
@Entity
@Table(name = "prestamo")
public class Prestamo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_prestamo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPrestamo;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario",referencedColumnName = "id_usuario")
    private Usuarios usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_libro",referencedColumnName = "id_libro")
    private Libro libro;

    @Column(name = "estado_libro")
    private String estadoLibro;

    @Column(name = "estado_prestamo")
    private String estadoPrestamo;

    @Column(name = "fecha_entrega")
    private Date fechaEntrega;

    @ManyToOne
    @JoinColumn(name = "id_bibliotecario_entrega",referencedColumnName = "id_bibliotecario")
    private Bibliotecarios bibliotecario_entrega;

    @Column(name = "documento_habilitante")
    private String documentoHabilitante;

    @Column(name = "fecha_recibido")
    private Date fechaRecibido;

    @ManyToOne
    @JoinColumn(name = "id_bibliotecario_recibido",referencedColumnName = "id_bibliotecario")
    private Bibliotecarios bibliotecario_recibido;

    @Column(name = "fecha_maxima")
    private Date fechaMaxima;

    @Column(name = "activo")
    private Boolean activo;

    @Column(name = "escaneo_matriz")
    private byte[] escaneoMatriz;
    
    
    

	public Integer getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(Integer idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}


	public String getEstadoLibro() {
		return estadoLibro;
	}

	public void setEstadoLibro(String estadoLibro) {
		this.estadoLibro = estadoLibro;
	}

	public String getEstadoPrestamo() {
		return estadoPrestamo;
	}

	public void setEstadoPrestamo(String estadoPrestamo) {
		this.estadoPrestamo = estadoPrestamo;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}


	public String getDocumentoHabilitante() {
		return documentoHabilitante;
	}

	public void setDocumentoHabilitante(String documentoHabilitante) {
		this.documentoHabilitante = documentoHabilitante;
	}

	public Date getFechaRecibido() {
		return fechaRecibido;
	}

	public void setFechaRecibido(Date fechaRecibido) {
		this.fechaRecibido = fechaRecibido;
	}


	public Date getFechaMaxima() {
		return fechaMaxima;
	}

	public void setFechaMaxima(Date fechaMaxima) {
		this.fechaMaxima = fechaMaxima;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public byte[] getEscaneoMatriz() {
		return escaneoMatriz;
	}

	public void setEscaneoMatriz(byte[] escaneoMatriz) {
		this.escaneoMatriz = escaneoMatriz;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Bibliotecarios getBibliotecario_entrega() {
		return bibliotecario_entrega;
	}

	public void setBibliotecario_entrega(Bibliotecarios blibliotecario_entrega) {
		this.bibliotecario_entrega = blibliotecario_entrega;
	}

	public Bibliotecarios getBibliotecario_recibido() {
		return bibliotecario_recibido;
	}

	public void setBibliotecario_recibido(Bibliotecarios bibliotecario_recibido) {
		this.bibliotecario_recibido = bibliotecario_recibido;
	}
    
    
    

}
