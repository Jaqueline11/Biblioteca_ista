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
    private Integer idPrestamo;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "id_libro")
    private Integer idLibro;

    @Column(name = "estado_libro")
    private String estadoLibro;

    @Column(name = "estado_prestamo")
    private String estadoPrestamo;

    @Column(name = "fecha_entrega")
    private Date fechaEntrega;

    @Column(name = "id_bibliotecario_entrega")
    private Integer idBibliotecarioEntrega;

    @Column(name = "documento_habilitante")
    private String documentoHabilitante;

    @Column(name = "fecha_recibido")
    private Date fechaRecibido;

    @Column(name = "id_bibliotecario_recibido")
    private Integer idBibliotecarioRecibido;

    @Column(name = "fecha_maxima")
    private Date fechaMaxima;

    @Column(name = "activo")
    private Integer activo;

    @Column(name = "escaneo_matriz")
    private byte[] escaneoMatriz;

	public Integer getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(Integer idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
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

	public Integer getIdBibliotecarioEntrega() {
		return idBibliotecarioEntrega;
	}

	public void setIdBibliotecarioEntrega(Integer idBibliotecarioEntrega) {
		this.idBibliotecarioEntrega = idBibliotecarioEntrega;
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

	public Integer getIdBibliotecarioRecibido() {
		return idBibliotecarioRecibido;
	}

	public void setIdBibliotecarioRecibido(Integer idBibliotecarioRecibido) {
		this.idBibliotecarioRecibido = idBibliotecarioRecibido;
	}

	public Date getFechaMaxima() {
		return fechaMaxima;
	}

	public void setFechaMaxima(Date fechaMaxima) {
		this.fechaMaxima = fechaMaxima;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public byte[] getEscaneoMatriz() {
		return escaneoMatriz;
	}

	public void setEscaneoMatriz(byte[] escaneoMatriz) {
		this.escaneoMatriz = escaneoMatriz;
	}
    
    
    

}
