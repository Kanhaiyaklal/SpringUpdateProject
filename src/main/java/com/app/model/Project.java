package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="protab")
public class Project {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String code;
	private String name;
	private String dept;
	private  String note;
	
	
	
	public Project() {
		super();
	}
	public Project(Integer id) {
		super();
		this.id = id;
	}
	public Project(Integer id, String code, String name, String dept, String note) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.dept = dept;
		this.note = note;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", code=" + code + ", name=" + name + ", dept=" + dept + ", note=" + note + "]";
	}
	
	
	
	
	
}
