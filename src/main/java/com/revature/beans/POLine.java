package com.revature.beans;

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
@Table(name="IMS_PO_LINE")
public class POLine {
@Id
@Column(name="ORDER_NUMBER",nullable=false)
@GeneratedValue(strategy=GenerationType.AUTO)
@Autowired
private PurchaseOrder order;
@Column(name="LINE_NUMBER",nullable=false)
@Autowired
private int line;
@Column(name="UNIT_PRICE",nullable=false)
@Autowired
private double price;
@Column(name="QUANTITY_ORDERED",nullable=false)
@Autowired
private int quantity;
@ManyToOne
@JoinColumn(name="PRODUCT_UPC",nullable=false)
@Autowired
private Product product;
public PurchaseOrder getOrder() {
	return order;
}
public void setOrder(PurchaseOrder order) {
	this.order = order;
}
public int getLine() {
	return line;
}
public void setLine(int line) {
	this.line = line;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
@Autowired
public POLine(PurchaseOrder order, int line, double price, int quantity, Product product) {
	super();
	this.order = order;
	this.line = line;
	this.price = price;
	this.quantity = quantity;
	this.product = product;
}
public POLine() {
	super();
}




}
