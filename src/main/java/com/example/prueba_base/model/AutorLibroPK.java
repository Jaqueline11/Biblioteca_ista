package com.example.prueba_base.model;

import java.io.Serializable;
import java.util.Objects;



public class AutorLibroPK implements Serializable{

	private static final long serialVersionUID = 1L;

	private Libro libro;
	
    private Autor autor; 
	
	@Override
	public int hashCode() {
		 int hash = 7;
	        hash = 59 * hash + Objects.hashCode(this.autor);
	        hash = 59 * hash + Objects.hashCode(this.libro);
	        return hash;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final AutorLibroPK other = (AutorLibroPK) obj;
		 if (!Objects.equals(this.autor, other.autor)) {
	            return false;
	        }
	        if (!Objects.equals(this.libro, other.libro)) {
	            return false;
	        }
	    return true;    
	}
	
	
	
}
