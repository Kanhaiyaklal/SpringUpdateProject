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

@Entity
public class UOM {
   @Id
   @GeneratedValue
   private int id;
	//@ElementCollection
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="uomtab",joinColumns=@JoinColumn(name="uid"))
	@OrderColumn(name="pos")
	@Column(name="data")
	private List<String> list;
	
	private String umod;
	private String udesc;
	public UOM() {
		super();
	}


	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public String getUmod() {
		return umod;
	}
	public void setUmod(String umod) {
		this.umod = umod;
	}
	public String getUdesc() {
		return udesc;
	}
	public void setUdesc(String udesc) {
		this.udesc = udesc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "UOM [id=" + id + ", list=" + list + ", umod=" + umod + ", udesc=" + udesc + "]";
	}
	
	
	
}
