package com.alpha.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update_Emp_Name_Sal_Desig_13 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Employee emp = em.find(Employee.class, 5);

		if (emp != null) {
		    emp.setName("Puneeth Kumar");
		    emp.setSalary(50000);
		    emp.setDesignation("Software Developer");
		}
		et.commit();
	}
}
