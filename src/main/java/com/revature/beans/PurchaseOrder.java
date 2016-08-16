package com.revature.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table(name="IMS_PURCHASE_ORDER")
public class PurchaseOrder {
	@Id
	@Column(name="ORDER_NUMBER",nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Autowired
	private int orderNumber;
	@Column(nullable=false)
	@Autowired
	private double subtotal;
	@Column(name="PURCHASE_DATE",nullable=false)
	@Autowired
	private Date purchaseDate;
	@Column(name="TAX_AMOUNT",nullable=false)
	@Autowired
	private double tax;
	@Column(name="PO_TOTAL",nullable=false)
	@Autowired
	private double total;
	@ManyToOne
	@JoinColumn(name="CLIENT_ID",nullable=false)
	@Autowired
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
	@Autowired
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
