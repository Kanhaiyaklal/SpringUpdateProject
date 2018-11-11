package com.app.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "emptab5")
public class Employee {
	@Id
	@Column
	@GeneratedValue
	private Integer empId;
	@Column(name = "ename")
	private String Empname;
	@Column(name = "empAddress")
	private String empAddress;
	@Column(name = "empGeneder")
	private String empGeneder;
	@Column(name = "empcntry")
	private String empcntry;
	// @ElementCollection
	@ElementCollection(fetch = FetchType.EAGER) // it is use when retrieve data from database to UI by default is(LAZY)
	@CollectionTable(name = "emplangs", joinColumns = @JoinColumn(name = "eid"))
	@OrderColumn(name = "POS")
	@Column(name = "data")
	private List<String> empLangs;

	public Employee() {
		super();
	}

	public Employee(Integer empId) {
		super();
		this.empId = empId;
	}
	public Employee(Integer empId, String empname, String empAddress, String empGeneder, String empcntry,
			List<String> empLangs) {
		super();
		this.empId = empId;
		Empname = empname;
		this.empAddress = empAddress;
		this.empGeneder = empGeneder;
		this.empcntry = empcntry;
		this.empLangs = empLangs;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpGeneder() {
		return empGeneder;
	}
	public void setEmpGeneder(String empGeneder) {
		this.empGeneder = empGeneder;
	}
	public String getEmpcntry() {
		return empcntry;
	}
	public void setEmpcntry(String empcntry) {
		this.empcntry = empcntry;
	}
	public List<String> getEmpLangs() {
		return empLangs;
	}
	public void setEmpLangs(List<String> empLangs) {
		this.empLangs = empLangs;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Empname=" + Empname + ", empAddress=" + empAddress + ", empGeneder="
				+ empGeneder + ", empcntry=" + empcntry + ", empLangs=" + empLangs + "]";
	}

}
