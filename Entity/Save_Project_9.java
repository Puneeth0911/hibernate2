package com.alpha.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Project_9 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Employee emp = em.find(Employee.class, 8);

		if (emp != null) {
		    Project p1 = new Project("Project A", "Java",
		        "2026-01-01", "2026-02-01", emp);

		    Project p2 = new Project("Project B", "React",
		        "2026-02-01", "2026-03-01", emp);

		    Project p3 = new Project("Project C", "SQL",
		        "2026-03-01", "2026-04-01", emp);

		    emp.getElistp().add(p1);
		    emp.getElistp().add(p2);
		    emp.getElistp().add(p3);

		    em.persist(p1);
		    em.persist(p2);
		    em.persist(p3);
		}
		et.commit();
	}
}
