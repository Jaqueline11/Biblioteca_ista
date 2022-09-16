package com.example.prueba_base.postgres.models;

import lombok.Data;

import javax.persistence.*;


import java.io.Serializable;


@Entity
@Data
@NamedStoredProcedureQuery(name = "buscaralumno", procedureName = "datos_istateca",	
		parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "ced", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "id", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "cedula", type = String.class),
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}    
    
    

}