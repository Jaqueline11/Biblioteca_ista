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
    @Column(name = "id_libro", nullable = false)
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

}
