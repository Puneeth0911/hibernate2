package com.alpha.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	@Column(unique=true)
	private long phone;
	@Column(unique=true)
	private String mail;
	private String designation;
	private int salary;
	
	@ManyToOne
	Department dept;
	
//	@OneToOne
//	Department d;
	
	@OneToMany(mappedBy = "ep") 
	List<Project> elistp=new ArrayList<Project>(); 	
	
	@OneToOne
	Address a;
	public Employee(String name, long phone, String mail, String designation, int salary, Department dept,
			List<Project> elistp, Address a) {
		super();
		this.name = name;
		this.phone = phone;
		this.mail = mail;
		this.designation = designation;
		this.salary = salary;
		this.dept = dept;
//		this.d = d;
		this.elistp = elistp;
		this.a = a;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

//	public Department getD() {
//		return d;
//	}
//
//	public void setD(Department d) {
//		this.d = d;
//	}

	public List<Project> getElistp() {
		return elistp;
	}

	public void setElistp(List<Project> elistp) {
		this.elistp = elistp;
	}

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", mail=" + mail + ", designation="
				+ designation + ", salary=" + salary + ", dept=" + dept + ", elistp=" + elistp + ", a=" + a + "]";
	}
	
}
