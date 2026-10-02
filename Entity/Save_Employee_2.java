package com.alpha.Entity;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Employee_2 {
	public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();

			et.begin();
			Department d1 = em.find(Department.class, 4);
			Department d2 = em.find(Department.class, 5);
			Department d3 = em.find(Department.class, 6);

			Employee e1 = new Employee("Puneeth", 9876543210L,
			    "puneeth@gmail.com", "Developer", 40000, d1, new ArrayList<>(), null);
			Employee e2 = new Employee("Rahul", 9876543211L,
			    "rahul@gmail.com", "Tester", 35000, d2, new ArrayList<>(), null);
			Employee e3 = new Employee("Kiran", 9876543212L,
			    "kiran@gmail.com", "Analyst", 38000, d3, new ArrayList<>(), null);

			d1.getElist().add(e1);
			d2.getElist().add(e2);
			d3.getElist().add(e3);
			em.persist(e1);
			em.persist(e2);
			em.persist(e3);

			et.commit();
	}
}
