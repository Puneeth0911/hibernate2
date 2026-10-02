package com.alpha.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String location;
	
	@OneToMany(mappedBy = "dept")
	List<Employee>elist=new ArrayList<Employee>();

//	@OneToOne
//	Employee e;
	public Department(String name, String location, List<Employee> elist) {
		super();
		this.name = name;
		this.location = location;
		this.elist = elist;
	}

	public Department() {
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getElist() {
		return elist;
	}

	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location + ", elist=" + elist + "]";
	}

//	public Employee getE() {
//		return e;
//	}
//
//	public void setE(Employee e) {
//		this.e = e;
//	}

	

}
