package com.revature.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="IMS_PRODUCT_CATAGORY")
public class Category {
@Id
@Column(name="CATEGORY_ID",nullable=false)
private int catagoryId;
@Column(name="CATEGORY_DESCRIPTION",nullable=false)
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
