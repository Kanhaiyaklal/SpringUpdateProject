package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="devtab")
public class Developer {
    @Id
    @GeneratedValue
	private Integer id;
	private String code;
	private String  name;
	private String project;
	private double salary;
	
	
	public Developer(Integer id) {
		super();
		this.id = id;
	}

	public Developer(Integer id, String code, String name, String project, double salary) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.project = project;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



	
	@ManyToOne
	@JoinColumn(name="pidfk")
	private Project project1;
	public Developer() {
		super();
	}

	public Developer(Integer id, String code, String name, String project, double salary, Project project1) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.project = project;
		this.salary = salary;
		this.project1 = project1;
	}

	public Project getProject1() {
		return project1;
	}

	public void setProject1(Project project1) {
		this.project1 = project1;
	}

	@Override
	public String toString() {
		return "Developer [id=" + id + ", code=" + code + ", name=" + name + ", project=" + project + ", salary="
				+ salary + ", project1=" + project1 + "]";
	}
	
	
}
