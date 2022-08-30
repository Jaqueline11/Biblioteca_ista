package com.example.prueba_base.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "autor_libro")
public class AutorLibro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_libro", nullable = false)
    private Integer idLibro;

    @Id
    @Column(name = "id_autor", nullable = false)
    private Integer idAutor;

}
