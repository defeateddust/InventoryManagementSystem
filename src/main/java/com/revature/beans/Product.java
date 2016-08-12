package com.revature.beans;

import java.sql.Blob;
import java.util.Set;

public class Product {

	private int upc;
	private String productName;
	private String description;
	private String shortName;
	private double cost;
	private String size;
	private int reorder;
	private double price;
	private double weight;
	private Blob image;//ugh
	private Set<Category> catagories;
	public int getUpc() {
		return upc;
	}
	public void setUpc(int upc) {
		this.upc = upc;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getReorder() {
		return reorder;
	}
	public void setReorder(int reorder) {
		this.reorder = reorder;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	public Set<Category> getCatagories() {
		return catagories;
	}
	public void setCatagories(Set<Category> catagories) {
		this.catagories = catagories;
	}
	public Product(int upc, String productName, String description, String shortName, double cost, String size,
			int reorder, double price, double weight, Blob image, Set<Category> catagories) {
		super();
		this.upc = upc;
		this.productName = productName;
		this.description = description;
		this.shortName = shortName;
		this.cost = cost;
		this.size = size;
		this.reorder = reorder;
		this.price = price;
		this.weight = weight;
		this.image = image;
		this.catagories = catagories;
	}
	public Product() {
		super();
	}
	
	
	
	
}
