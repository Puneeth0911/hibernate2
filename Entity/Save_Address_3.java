package com.alpha.Entity;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Address_3 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();

			et.begin();
			Department dept = em.find(Department.class, 4);

			Employee emp = new Employee("Puneeth2", 987654321L,
			    "puneeth2@gmail.com", "Developer", 40000, dept, new ArrayList<>(), null);

			Address addr = new Address("Room 101", "Hyderabad", "Telangana", emp);

			emp.setA(addr);
			addr.setEa(emp);
			dept.getElist().add(emp);
			em.persist(addr);
			em.persist(emp);
			et.commit();

	}
}
