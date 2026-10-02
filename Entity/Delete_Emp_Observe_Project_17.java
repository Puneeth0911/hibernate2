package com.alpha.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete_Emp_Observe_Project_17 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin(); 
		Employee emp = em.find(Employee.class, 15);

		if (emp != null) {
			Department dept = emp.getDept();

			if (dept != null) {
				dept.getElist().remove(emp);
			}

			List<Project> projects = new ArrayList<>(emp.getElistp());

			for (Project p : projects) {
				em.remove(p);
			}

			emp.getElistp().clear();

			Address addr = emp.getA();
			emp.setA(null);

			em.remove(emp);

			// Delete the address too, if desired.
			if (addr != null) {
				em.remove(addr);
			}
			et.commit();
		}
	}
}
