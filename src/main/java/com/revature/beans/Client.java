package com.revature.beans;

public class Client {
private int clientId;
private String name;
private String email;
private String contactName;
private String phone;
private String fax;
private Address address;
private ClientType type;

public int getClientId() {
	return clientId;
}
public void setClientId(int clientId) {
	this.clientId = clientId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContactName() {
	return contactName;
}
public void setContactName(String contactName) {
	this.contactName = contactName;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getFax() {
	return fax;
}
public void setFax(String fax) {
	this.fax = fax;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public ClientType getType() {
	return type;
}
public void setType(ClientType type) {
	this.type = type;
}
public Client(int clientId, String name, String email, String contactName, String phone, String fax, Address address,
		ClientType type) {
	super();
	this.clientId = clientId;
	this.name = name;
	this.email = email;
	this.contactName = contactName;
	this.phone = phone;
	this.fax = fax;
	this.address = address;
	this.type = type;
}
public Client() {
	super();
}


}
