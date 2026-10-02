package com.alpha.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find_Emp_Display_Projects_10 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Employee emp = em.find(Employee.class, 8);

		if (emp != null) {
		    System.out.println("Employee: " + emp.getName());

		    for (Project p : emp.getElistp()) {
		        System.out.println("Project ID: " + p.getId());
		        System.out.println("Project: " + p.getProjectname());
		        System.out.println("Technology: " + p.getTechnology());
		    }
		}
		et.commit();
	}
}
