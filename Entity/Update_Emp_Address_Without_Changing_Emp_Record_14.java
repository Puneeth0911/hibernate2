package com.alpha.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update_Emp_Address_Without_Changing_Emp_Record_14 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();

		Employee emp = em.find(Employee.class, 9);
		if (emp != null && emp.getA() != null) {
			Address addr = emp.getA();

			addr.setStreet("Room 202");
			addr.setCity("Hyderabad");
			addr.setState("Telangana");
		}

		et.commit();
	}
}
