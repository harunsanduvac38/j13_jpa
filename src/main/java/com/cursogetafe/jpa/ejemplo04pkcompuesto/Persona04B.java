package com.cursogetafe.jpa.ejemplo04pkcompuesto;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;


@Entity
@Table(name = "persona_03")
public class Persona04B implements Serializable {
	
	@EmbeddedId
	private DniB dni;
	private String nombre;
	

	public Persona04B() {}
	
	public Persona04B(DniB dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public DniB getDni() {
		return dni;
	}

	public void setDni(DniB dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona04B (dni=" + dni + ", nombre=" + nombre + ")";
	}



	




	
	
	
	
	
	
	

}
