package com.alpha.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String street;
	private String city;
	private String state;
	
	@OneToOne(mappedBy = "a")
	Employee ea;
	public Address(String street, String city, String state, Employee ea) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.ea = ea;
	}

	public Address() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Employee getEa() {
		return ea;
	}

	public void setEa(Employee ea) {
		this.ea = ea;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", ea=" + ea + "]";
	}
	
}
