package com.example.prueba_base.postgres.models;

import lombok.Data;

import javax.persistence.*;


import java.io.Serializable;


@Entity

@NamedStoredProcedureQuery(name = "buscarpersona2", procedureName = "datos_istateca",resultClasses = PersonaP.class,
		parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "ced", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "id", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "celular", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "correo", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "nombres", type = String.class)
})
public class PersonaP implements Serializable {

    private static final long serialVersionUID = 1L;

    
    @Column(name = "id")
    private Integer id;
    @Id
    @Column(name = "cedula")
    private String cedula;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "correo")
    private String correo;

    @Column(name = "celular")
    private String celular;    

}