package com.alpha.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find_Dept_By_id_Display_Emp_7 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Department dept = em.find(Department.class, 4);

		if (dept != null) {
		    System.out.println("Department: " + dept.getName());

		    for (Employee emp : dept.getElist()) {
		        System.out.println(emp.getId() + " " + emp.getName());
		    }
		}
		et.commit();
	}
}
