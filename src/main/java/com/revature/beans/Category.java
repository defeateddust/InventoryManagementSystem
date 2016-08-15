package com.revature.beans;

import java.util.Set;

public class Category {
private int catagoryId;
private String description;
private Set<Product> products;
public int getCatagoryId() {
	return catagoryId;
}
public void setCatagoryId(int catagoryId) {
	this.catagoryId = catagoryId;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Set<Product> getProducts() {
	return products;
}
public void setProducts(Set<Product> products) {
	this.products = products;
}
public Category(int catagoryId, String description, Set<Product> products) {
	super();
	this.catagoryId = catagoryId;
	this.description = description;
	this.products = products;
}
public Category() {
	super();
}


}
