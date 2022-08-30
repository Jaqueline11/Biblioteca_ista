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

}
