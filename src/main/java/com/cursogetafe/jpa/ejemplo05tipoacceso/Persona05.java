package com.cursogetafe.jpa.ejemplo05tipoacceso;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona") //no hace falta porque el nombre de la tabla es igual a la esta clase
public class Persona05  implements Serializable{
	
	
	private int idPersona;
	private String apellidos;
	private String apodo;
	private String nombre;
	private String dni;
	
	
	public Persona05(int idPersona, String apellidos, String nombre) {
		super();
		this.idPersona = idPersona;
		this.apellidos = apellidos;
		this.nombre = nombre;
	}
	
	public Persona05() {
		System.out.println("Constructos por defecto");
	}

	//Access properties
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdPersona() {
		return idPersona;
	}


	public void setIdPersona(int idPersona) {
		System.out.println("setIdPersona()");
		this.idPersona = idPersona;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		System.out.println("setApellidos()");
		this.apellidos = apellidos;
	}


	public String getApodo() {
		return apodo;
	}


	public void setApodo(String apodo) {
		System.out.println("setApodo()");
		this.apodo = apodo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		System.out.println("setNombre()");
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		System.out.println("setDni()");
		this.dni = dni;
	}
	
	@jakarta.persistence.Transient
	public String getNombreCompleto() {
		return nombre + " " + apellidos;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idPersona);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona05 other = (Persona05) obj;
		return idPersona == other.idPersona;
	}


	@Override
	public String toString() {
		return "Persona05 (" + idPersona + ", " + apellidos + ", " + apodo + ", " + nombre + ", " + dni+  ")\n";
	}
	
	
	
	
	

}
