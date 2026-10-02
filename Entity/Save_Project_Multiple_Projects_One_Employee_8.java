package com.alpha.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Project_Multiple_Projects_One_Employee_8 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Employee emp = em.find(Employee.class, 8);

		Project p1 = new Project("Vaccination System", "React",
		    "2026-01-01", "2026-03-01", emp);

		Project p2 = new Project("Portfolio", "Java",
		    "2026-02-01", "2026-04-01", emp);

		emp.getElistp().add(p1);
		emp.getElistp().add(p2);

		em.persist(p1);
		em.persist(p2);
		et.commit();
	}
}
