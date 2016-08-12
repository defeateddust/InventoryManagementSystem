package com.revature.beans;

public class POLine {
private PurchaseOrder order;
private int line;
private double price;
private int quantity;
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
