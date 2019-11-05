package com.totvs.entity;

public class Venda {

	private String saleId;
	private Integer itemId;
	private Integer itemQuantity;
	private double itemPrice;
	private String salesMan;

	public Venda(String saleId, Integer itemId, Integer itemQuantity, double itemPrice, String salesMan) {
		super();
		this.saleId = saleId;
		this.itemId = itemId;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.salesMan = salesMan;
	}

	public String getSaleId() {
		return saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(Integer itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getSalesMan() {
		return salesMan;
	}

	public void setSalesMan(String salesMan) {
		this.salesMan = salesMan;
	}

}
