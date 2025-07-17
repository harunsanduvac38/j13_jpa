package com.cursogetafe.jpa.ejemplo07herenciasingletable;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue(value = "CIRCULO")
public class Circulo02 extends Figura02{
	
	
	@Column(name = "r")
	private double radio;
	
	
	public Circulo02(double x, double y, double radio) {
		super(x,y);
		this.radio = radio;
		
	}
	
	
	public Circulo02() {
	}



	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}

	
	public double getDiametro() {
		return 2 * radio;
	}
	
	@Override
	public double calculaArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	
	@Override
	public double calculaPerimetro() {
		return Math.PI * getDiametro();
	}



	@Override
	public String toString() {
		return "Circulo (" + radio + ", " + ", " + super.getX() + ", " + super.getY() + ", "
				+ calculaPerimetro() + ")";
	}
	
	
	
	



}
