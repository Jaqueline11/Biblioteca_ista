package com.example.prueba_base.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "libro")
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_libro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLibro;

    @Column(name = "codigo_dewey")
    private String codigoDewey;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "id_tipo")
    private Integer idTipo;

    @Column(name = "adquisicion")
    private String adquisicion;

    @Column(name = "anio_publicacion")
    private Integer anioPublicacion;

    @Column(name = "editor")
    private String editor;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "num_paginas")
    private String numPaginas;

    @Column(name = "area")
    private String area;

    @Column(name = "cod_ISBN")
    private String codIsbn;

    @Column(name = "idioma")
    private String idioma;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "dimensiones")
    private String dimensiones;

    @Column(name = "estado_libro")
    private String estadoLibro;

    @Column(name = "activo")
    private Integer activo;

    @Column(name = "imagen")
    private byte[] imagen;

    @Column(name = "url_digital")
    private String urlDigital;

    @Column(name = "id_bibliotecario")
    private Integer idBibliotecario;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "disponibilidad")
    private Integer disponibilidad;

    @Column(name = "indice_uno")
    private String indiceUno;

    @Column(name = "indice_dos")
    private String indiceDos;

    @Column(name = "indice_tres")
    private String indiceTres;

    @Column(name = "nombre_donante")
    private String nombreDonante;

    @Column(name = "documento_donacion")
    private byte[] documentoDonacion;

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getCodigoDewey() {
        return codigoDewey;
    }

    public void setCodigoDewey(String codigoDewey) {
        this.codigoDewey = codigoDewey;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getAdquisicion() {
        return adquisicion;
    }

    public void setAdquisicion(String adquisicion) {
        this.adquisicion = adquisicion;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCodIsbn() {
        return codIsbn;
    }

    public void setCodIsbn(String codIsbn) {
        this.codIsbn = codIsbn;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(String estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getUrlDigital() {
        return urlDigital;
    }

    public void setUrlDigital(String urlDigital) {
        this.urlDigital = urlDigital;
    }

    public Integer getIdBibliotecario() {
        return idBibliotecario;
    }

    public void setIdBibliotecario(Integer idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Integer disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getIndiceUno() {
        return indiceUno;
    }

    public void setIndiceUno(String indiceUno) {
        this.indiceUno = indiceUno;
    }

    public String getIndiceDos() {
        return indiceDos;
    }

    public void setIndiceDos(String indiceDos) {
        this.indiceDos = indiceDos;
    }

    public String getIndiceTres() {
        return indiceTres;
    }

    public void setIndiceTres(String indiceTres) {
        this.indiceTres = indiceTres;
    }

    public String getNombreDonante() {
        return nombreDonante;
    }

    public void setNombreDonante(String nombreDonante) {
        this.nombreDonante = nombreDonante;
    }

    public byte[] getDocumentoDonacion() {
        return documentoDonacion;
    }

    public void setDocumentoDonacion(byte[] documentoDonacion) {
        this.documentoDonacion = documentoDonacion;
    }
}
