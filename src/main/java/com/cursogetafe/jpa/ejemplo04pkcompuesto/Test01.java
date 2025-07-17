package com.cursogetafe.jpa.ejemplo04pkcompuesto;

import com.cursogetafe.jpa.config.Config;

import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		Persona04 p = em.find(Persona04.class, new Dni(12121212, 'A'));
		
		System.out.println(p);
		
		
		Persona04 p2 = new Persona04(1234, 'D', "Pepito");
		
		em.getTransaction().begin();
		em.persist(p2);
		em.getTransaction().commit();
		
		
		Persona04 p3 = em.find(Persona04.class, new Dni(1234,'X'));
		
		System.out.println(p3);
		
	}

}
