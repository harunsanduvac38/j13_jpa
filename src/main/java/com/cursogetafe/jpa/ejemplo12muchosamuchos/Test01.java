package com.cursogetafe.jpa.ejemplo12muchosamuchos;

import com.cursogetafe.jpa.config.Config;

import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {
		
		
		EntityManager em = Config.getEmf().createEntityManager();
		
//		Equipo e = em.find(Equipo.class, 10);
//		
//		System.out.println(e);
		
		
		Jugador j = em.find(Jugador.class, 10);
		
//		System.out.println(j);
		System.out.println(j.getEquipos());
	}

}
