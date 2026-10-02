package com.alpha.Entity;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_3_Departments_1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();

			et.begin();

			Department d1 = new Department("HR", "Hyderabad", new ArrayList<>());
			Department d2 = new Department("Testing", "Hyderabad", new ArrayList<>());
			Department d3 = new Department("IT", "Hyderabad", new ArrayList<>());

			em.persist(d1);
			em.persist(d2);
			em.persist(d3); 

			et.commit();
	}
}
