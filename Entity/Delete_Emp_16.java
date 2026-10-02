package com.alpha.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete_Emp_16 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Employee emp = em.find(Employee.class, 5);

		if (emp != null) {
		    Address addr = emp.getA();

		    Department dept = emp.getDept();

		    if (dept != null) {
		        dept.getElist().remove(emp);
		    }

		    emp.setA(null);

		    em.remove(emp);

		    if (addr != null) {
		        em.remove(addr);
		    }
		}
		et.commit();
	}
}
