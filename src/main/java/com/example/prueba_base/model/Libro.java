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
    private Integer id_libro;

    @Column(name = "codigo_dewey")
    private String codigo_dewey;

    @Column(name = "titulo")
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "id_tipo",referencedColumnName = "id_tipo")
    private Tipo tipo;

    @Column(name = "adquisicion")
    private String adquisicion;

    @Column(name = "anio_publicacion")
    private Integer anio_publicacion;

    @Column(name = "editor")
    private String editor;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "num_paginas")
    private String num_paginas;

    @Column(name = "area")
    private String area;

    @Column(name = "cod_ISBN")
    private String cod_ISBN;

    @Column(name = "idioma")
    private String idioma;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "dimensiones")
    private String dimensiones;

    @Column(name = "estado_libro")
    private String estado_libro;

    @Column(name = "activo")
    private Boolean activo;

    @Column(name = "imagen")
    private byte[] imagen;

    @Column(name = "url_digital")
    private String url_digital;
    
    @ManyToOne
    @JoinColumn(name = "id_bibliotecario",referencedColumnName = "id_bibliotecario")
    private Bibliotecarios bibliotecario;

    @Column(name = "fecha_creacion")
    private Date fecha_creacion;

    @Column(name = "disponibilidad")
    private Boolean disponibilidad;

    @Column(name = "indice_uno")
    private String indice_uno;

    @Column(name = "indice_dos")
    private String indice_dos;

    @Column(name = "indice_tres")
    private String indice_tres;

    @Column(name = "nombre_donante")
    private String nombre_donante;

    @Column(name = "documento_donacion")
    private byte[] documento_donacion;
   
    
	public Integer getId_libro() {
		return id_libro;
	}

	public void setId_libro(Integer id_libro) {
		this.id_libro = id_libro;
	}

	public String getCodigo_dewey() {
		return codigo_dewey;
	}

	public void setCodigo_dewey(String codigo_dewey) {
		this.codigo_dewey = codigo_dewey;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getAdquisicion() {
		return adquisicion;
	}

	public void setAdquisicion(String adquisicion) {
		this.adquisicion = adquisicion;
	}

	public Integer getAnio_publicacion() {
		return anio_publicacion;
	}

	public void setAnio_publicacion(Integer anio_publicacion) {
		this.anio_publicacion = anio_publicacion;
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

	public String getNum_paginas() {
		return num_paginas;
	}

	public void setNum_paginas(String num_paginas) {
		this.num_paginas = num_paginas;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCod_ISBN() {
		return cod_ISBN;
	}

	public void setCod_ISBN(String cod_ISBN) {
		this.cod_ISBN = cod_ISBN;
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

	public String getEstado_libro() {
		return estado_libro;
	}

	public void setEstado_libro(String estado_libro) {
		this.estado_libro = estado_libro;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public String getUrl_digital() {
		return url_digital;
	}

	public void setUrl_digital(String url_digital) {
		this.url_digital = url_digital;
	}

	public Bibliotecarios getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(Bibliotecarios bibliotecario) {
		this.bibliotecario = bibliotecario;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getIndice_uno() {
		return indice_uno;
	}

	public void setIndice_uno(String indice_uno) {
		this.indice_uno = indice_uno;
	}

	public String getIndice_dos() {
		return indice_dos;
	}

	public void setIndice_dos(String indice_dos) {
		this.indice_dos = indice_dos;
	}

	public String getIndice_tres() {
		return indice_tres;
	}

	public void setIndice_tres(String indice_tres) {
		this.indice_tres = indice_tres;
	}

	public String getNombre_donante() {
		return nombre_donante;
	}

	public void setNombre_donante(String nombre_donante) {
		this.nombre_donante = nombre_donante;
	}

	public byte[] getDocumento_donacion() {
		return documento_donacion;
	}

	public void setDocumento_donacion(byte[] documento_donacion) {
		this.documento_donacion = documento_donacion;
	}
	
    
}
