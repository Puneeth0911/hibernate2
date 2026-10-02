package com.alpha.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Remove_One_Project_From_Emp_12 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Employee emp = em.find(Employee.class, 8);
		Project project = em.find(Project.class, 28);

		if (emp != null && project != null
		        && emp.getElistp().contains(project)) {
		    emp.getElistp().remove(project);
		    em.remove(project);
		}

		et.commit();
	}
}
