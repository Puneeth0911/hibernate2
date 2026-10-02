package com.alpha.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String projectname;
	private String technology;
	private String startdate;
	private String enddate;
	
	@ManyToOne
	Employee ep;

	public Project(String projectname, String technology, String startdate, String enddate, Employee ep) {
		super();
		this.projectname = projectname;
		this.technology = technology;
		this.startdate = startdate;
		this.enddate = enddate;
		this.ep = ep;
	}

	public Project() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public Employee getEp() {
		return ep;
	}

	public void setEp(Employee ep) {
		this.ep = ep;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectname=" + projectname + ", technology=" + technology + ", startdate="
				+ startdate + ", enddate=" + enddate + ", ep=" + ep + "]";
	}
	
}
