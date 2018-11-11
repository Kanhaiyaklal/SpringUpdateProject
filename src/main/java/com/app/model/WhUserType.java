package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="whuser")
public class WhUserType {
	
	 @Id
	   @GeneratedValue
	   private int id;
	   private String utype;
	   private String ucode;
	   private String ufor;
	   private String uEmail;
	   private String uContact;
	   private String uIdtype;
	   private String other;
	   private Integer idNumber;
	public WhUserType() {
		super();
	}
	public WhUserType(int id) {
		super();
		this.id = id;
	}
	public WhUserType(int id, String utype, String ucode, String ufor, String uEmail, String uContact, String uIdtype,
			String other, Integer idNumber) {
		super();
		this.id = id;
		this.utype = utype;
		this.ucode = ucode;
		this.ufor = ufor;
		this.uEmail = uEmail;
		this.uContact = uContact;
		this.uIdtype = uIdtype;
		this.other = other;
		this.idNumber = idNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUtype() {
		return utype;
	}
	public void setUtype(String utype) {
		this.utype = utype;
	}
	public String getUcode() {
		return ucode;
	}
	public void setUcode(String ucode) {
		this.ucode = ucode;
	}
	public String getUfor() {
		return ufor;
	}
	public void setUfor(String ufor) {
		this.ufor = ufor;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuContact() {
		return uContact;
	}
	public void setuContact(String uContact) {
		this.uContact = uContact;
	}
	public String getuIdtype() {
		return uIdtype;
	}
	public void setuIdtype(String uIdtype) {
		this.uIdtype = uIdtype;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public Integer getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(Integer idNumber) {
		this.idNumber = idNumber;
	}
	@Override
	public String toString() {
		return "WhUserType [id=" + id + ", utype=" + utype + ", ucode=" + ucode + ", ufor=" + ufor + ", uEmail="
				+ uEmail + ", uContact=" + uContact + ", uIdtype=" + uIdtype + ", other=" + other + ", idNumber="
				+ idNumber + "]";
	}

	
	

}
