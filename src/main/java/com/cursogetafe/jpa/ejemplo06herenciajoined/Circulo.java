package com.cursogetafe.jpa.ejemplo06herenciajoined;

public class Circulo extends Figura{
	
	private double radio;
	
	
	public Circulo(double x, double y, double radio) {
		super(x,y);
		this.radio = radio;
		
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
		return "Circulo (" + radio + ", " + getRadio() + ", " + getDiametro() + ", " + calculaArea() + ", "
				+ calculaPerimetro() + ")";
	}
	
	
	
	



}
