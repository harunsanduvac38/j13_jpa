package com.cursogetafe.jpa.ejemplo07herenciasingletable;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("RECTANGULAR")
public class Rectangulo02 extends Figura02 {
	
	@Column(name = "l1")
	private double lado1;
	@Column(name = "l2")
	private double lado2;
	
	public Rectangulo02(double x, double y, double lado1, double lado2) {
		super(x,y);
		this.lado1=lado1;
		this.lado2=lado2;
	}
	
	public Rectangulo02() {}
	
	
	public void setLado1 (double lado1) {
		this.lado1 = lado1;
	}
	public double getLado1 () {
		return lado1;
	}
	
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado2() {
		return lado2;
	}
	
	@Override
	public double calculaArea() {
		return lado1*lado2;
	}
	
	@Override
	public double calculaPerimetro () {
		return 2*(lado1 + lado2);
	}
	
	@Override
	public boolean equals (Object otro) {
		if(!super.equals(otro)) return false;
		Rectangulo02 r = (Rectangulo02) otro;
		return this.lado1==r.lado1 && this.lado2 ==r.lado2;
		
	}
	
	
	@Override
	public  String toString() {
		return "Rectangulo (lado1=" + lado1 + ", lado2= " + lado2 + ", getX()=" + getX() + ", getY()=" + getY() + ")";
	}
	
	
}
