package com.cursogetafe.jpa.ejemplo04pkcompuesto;

import com.cursogetafe.jpa.config.Config;

import jakarta.persistence.EntityManager;

public class Test01B {
	public static void main(String[] args) {
		
		EntityManager em = Config.getEmf().createEntityManager();
		
		Persona04B p = em.find(Persona04B.class, new DniB(12121212, 'A'));
		
		System.out.println(p);
		
		
//		Persona04B p3 = new Persona04B(new DniB(123123, 'A'), "Pepito");
//		
//		em.getTransaction().begin();
//		em.persist(p3);
//		em.getTransaction().commit();
		
		
		Persona04B p4 = em.find(Persona04B.class, new DniB(123123,'A'));
		
		System.out.println(p4);
		
	}

}
