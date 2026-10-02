package com.alpha.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Change_Emp_Dept_15 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Employee emp = em.find(Employee.class, 4);
		Department newDept = em.find(Department.class, 3);

		if (emp != null && newDept != null) {
		    Department oldDept = emp.getDept();

		    if (oldDept != null) {
		        oldDept.getElist().remove(emp);
		    }

		    emp.setDept(newDept);
		    newDept.getElist().add(emp);
		}
		et.commit();
	}
}
