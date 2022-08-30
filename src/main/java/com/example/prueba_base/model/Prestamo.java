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
    @Column(name = "id_prestamo", nullable = false)
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

}
