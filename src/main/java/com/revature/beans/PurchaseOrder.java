package com.revature.beans;

import java.sql.Date;

public class PurchaseOrder {

	private int orderNumber;
	private double subtotal;
	private Date purchaseDate;
	private double tax;
	private double total;
	private Client client;
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public PurchaseOrder(int orderNumber, double subtotal, Date purchaseDate, double tax, double total, Client client) {
		super();
		this.orderNumber = orderNumber;
		this.subtotal = subtotal;
		this.purchaseDate = purchaseDate;
		this.tax = tax;
		this.total = total;
		this.client = client;
	}
	public PurchaseOrder() {
		super();
	}
	
	
	
	
}
