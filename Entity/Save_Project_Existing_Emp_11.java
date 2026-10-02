package com.alpha.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Project_Existing_Emp_11 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Employee emp = em.find(Employee.class, 9);

		if (emp != null) {
		    Project p = new Project("New Project", "Hibernate",
		        "2026-05-01", "2026-06-01", emp);

		    emp.getElistp().add(p);
		    em.persist(p);
		}
		et.commit();
	}
}
