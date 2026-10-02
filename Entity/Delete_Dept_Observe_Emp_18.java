package com.alpha.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete_Dept_Observe_Emp_18 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Department dept = em.find(Department.class, 22);

		if (dept != null) {
		    List<Employee> employees =
		        new ArrayList<>(dept.getElist());

		    for (Employee emp : employees) {
		        emp.setDept(null);
		    }

		    dept.getElist().clear();

		    em.remove(dept);
		}
		et.commit();
	}
}
