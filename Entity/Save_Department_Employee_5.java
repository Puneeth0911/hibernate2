package com.alpha.Entity;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Department_Employee_5 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		Department dept = new Department(
			    "CSE", "Hyderabad", new ArrayList<>());

			em.persist(dept);

			Employee e1 = new Employee("Puneeth", 98765L,
			    "puneeth5@gmail.com", "Developer", 40000, dept,
			    new ArrayList<>(), null);

			Employee e2 = new Employee("Rahul", 987654327L,
			    "rahul5@gmail.com", "Tester", 35000, dept,
			    new ArrayList<>(), null);

			Employee e3 = new Employee("Kiran", 98765439L,
			    "kiran5@gmail.com", "Analyst", 38000, dept,
			    new ArrayList<>(), null);

			Employee e4 = new Employee("Arjun", 987654326L,
			    "arjun5@gmail.com", "Java Developer", 42000, dept,
			    new ArrayList<>(), null);

			Employee e5 = new Employee("Sai", 987654351L,
			    "sai5@gmail.com", "Programmer", 39000, dept,
			    new ArrayList<>(), null);

			dept.getElist().add(e1);
			dept.getElist().add(e2);
			dept.getElist().add(e3);
			dept.getElist().add(e4);
			dept.getElist().add(e5);

			em.persist(e1);
			em.persist(e2);
			em.persist(e3);
			em.persist(e4);
			em.persist(e5);

			et.commit();
	}
}
