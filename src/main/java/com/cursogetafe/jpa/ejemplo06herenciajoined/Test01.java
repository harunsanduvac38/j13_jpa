package com.cursogetafe.jpa.ejemplo06herenciajoined;

import com.cursogetafe.jpa.config.Config;

import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		Circulo c = em.find(Circulo.class, 67);
		
		System.out.println(c);
	}

}
