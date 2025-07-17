package com.cursogetafe.jpa.ejemplo05tipoacceso;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.mapping.PrimaryKey;

import com.cursogetafe.jpa.config.Config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Test01 {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Config.getEmf();
		
		EntityManager em = emf.createEntityManager();
		
//		String sql = "selec idpersona, apellidos, nombre, apodo, dni from persona where idpersona = ?";
//		PreparedStatement ps = cx.prepapeStatement(sql);
//		ps.setInt(1, 12);
//		ResultSet rs = ps.executeQuery();
//		if(rs.next()) {
//			Persona p = new Persona();
//			p.setApellidos(sql);
//			...
//		}
		
		
		Persona05 p = em.find(Persona05.class, 12);
		if(p != null) {
			System.out.println(p);
			System.out.println(p.getNombreCompleto());
		}else {
			System.out.println("Persona no existe!");
		}
		
		em.close();
		
	}

}
