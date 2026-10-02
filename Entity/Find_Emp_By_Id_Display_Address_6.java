package com.alpha.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find_Emp_By_Id_Display_Address_6 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Employee emp = em.find(Employee.class, 8);

		if (emp != null) {
		    System.out.println("Employee: " + emp.getName());

		    Address addr = emp.getA();

		    if (addr != null) {
		        System.out.println("Street: " + addr.getStreet());
		        System.out.println("City: " + addr.getCity());
		        System.out.println("State: " + addr.getState());
		    }
		}

		et.commit();
	}
}
