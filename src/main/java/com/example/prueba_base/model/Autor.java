package com.example.prueba_base.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "autor")
public class Autor implements Serializable {
    //Myrian
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_autor", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;

    @Column(name = "nombre")
    private String nombre;

}
