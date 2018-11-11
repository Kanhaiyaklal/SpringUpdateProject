package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "itemtab")
public class Item {
	@Id
	@GeneratedValue
	private Integer itemId;
	private String itemCode;
	private double width;
	private double length;
	private double height;
	private double bcast;
	private String baseCurrency;
	private String itemUom;
	private String  uType;
	private String iescription;
    

	public Item(Integer itemId) {
		super();
		this.itemId = itemId;
	}

	public Item(Integer itemId, String itemCode, double width, double length, double height, double bcast,
			String baseCurrency, String itemUom, String uType, String iescription, UOM uom, Order saleType,
			Order purchaseType, List<WhUserType> custUser, List<WhUserType> venUsers) {
		super();
		this.itemId = itemId;
		this.itemCode = itemCode;
		this.width = width;
		this.length = length;
		this.height = height;
		this.bcast = bcast;
		this.baseCurrency = baseCurrency;
		this.itemUom = itemUom;
		this.uType = uType;
		this.iescription = iescription;
		this.uom = uom;
		this.saleType = saleType;
		this.purchaseType = purchaseType;
		this.custUser = custUser;
		this.venUsers = venUsers;
	}

	@ManyToOne
	@JoinColumn(name = "uomfkid")
	private UOM uom;

	@ManyToOne
	@JoinColumn(name = "saleId")
	private Order saleType;

	@ManyToOne
	@JoinColumn(name = "purchaseId")
	private Order purchaseType;

	@ManyToMany()
	@JoinTable(name="Itm_VenUser_Tab",joinColumns=@JoinColumn(name="itmIdfk"),inverseJoinColumns=@JoinColumn(name="venIdFk"))
	//@Fetch(value=FetchMode.SUBSELECT)
	private List<WhUserType> custUser;

	@ManyToMany()
	@JoinTable(name="Itm_custUser_Tab",joinColumns=@JoinColumn(name="itmIdfk"),inverseJoinColumns=@JoinColumn(name="custIdFk"))
	//@Fetch(value=FetchMode.SUBSELECT)
	private List<WhUserType> venUsers;


	public Item() {
		super();
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBcast() {
		return bcast;
	}

	public void setBcast(double bcast) {
		this.bcast = bcast;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getItemUom() {
		return itemUom;
	}

	public void setItemUom(String itemUom) {
		this.itemUom = itemUom;
	}

	public String getuType() {
		return uType;
	}

	public void setuType(String uType) {
		this.uType = uType;
	}

	public String getIescription() {
		return iescription;
	}

	public void setIescription(String iescription) {
		this.iescription = iescription;
	}

	public UOM getUom() {
		return uom;
	}

	public void setUom(UOM uom) {
		this.uom = uom;
	}

	public Order getSaleType() {
		return saleType;
	}

	public void setSaleType(Order saleType) {
		this.saleType = saleType;
	}

	public Order getPurchaseType() {
		return purchaseType;
	}

	public void setPurchaseType(Order purchaseType) {
		this.purchaseType = purchaseType;
	}

	public List<WhUserType> getCustUser() {
		return custUser;
	}

	public void setCustUser(List<WhUserType> custUser) {
		this.custUser = custUser;
	}

	public List<WhUserType> getVenUsers() {
		return venUsers;
	}

	public void setVenUsers(List<WhUserType> venUsers) {
		this.venUsers = venUsers;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemCode=" + itemCode + ", width=" + width + ", length=" + length
				+ ", height=" + height + ", bcast=" + bcast + ", baseCurrency=" + baseCurrency + ", itemUom=" + itemUom
				+ ", uType=" + uType + ", iescription=" + iescription + ", uom=" + uom + ", saleType=" + saleType
				+ ", purchaseType=" + purchaseType + ", custUser=" + custUser + ", venUsers=" + venUsers + "]";
	}


	
}