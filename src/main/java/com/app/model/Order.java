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

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Ordertab1")
public class Order {
	@Id
	@GeneratedValue(generator="gid")
	@GenericGenerator(name="gid",strategy="increment")
	@Column(name = "gid")
	private int id;
	@Column(name = "salemode")
	private String saleMode;
	@Column(name = "ocode")
	private String oCode;
	private String oMethod;
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "coltab", joinColumns = @JoinColumn(name = "id"))
	@OrderColumn(name = "pos")
	@Column(name = "data")
	private List<String> oAccest;
	@Column(name = "odesc")
	private String odesc;

	public Order() {
		super();
	}

	public Order(int id, String saleMode, String oCode, String oMethod, List<String> oAccest, String odesc) {
		super();
		this.id = id;
		this.saleMode = saleMode;
		this.oCode = oCode;
		this.oMethod = oMethod;
		this.oAccest = oAccest;
		this.odesc = odesc;
	}

	public Order(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSaleMode() {
		return saleMode;
	}

	public void setSaleMode(String saleMode) {
		this.saleMode = saleMode;
	}

	public String getoCode() {
		return oCode;
	}

	public void setoCode(String oCode) {
		this.oCode = oCode;
	}

	public String getoMethod() {
		return oMethod;
	}

	public void setoMethod(String oMethod) {
		this.oMethod = oMethod;
	}

	public List<String> getoAccest() {
		return oAccest;
	}

	public void setoAccest(List<String> oAccest) {
		this.oAccest = oAccest;
	}

	public String getOdesc() {
		return odesc;
	}

	public void setOdesc(String odesc) {
		this.odesc = odesc;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", saleMode=" + saleMode + ", oCode=" + oCode + ", oMethod=" + oMethod + ", oAccest="
				+ oAccest + ", odesc=" + odesc + "]";
	}

}
