package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="IMS_CLIENT")
public class Client {
@Id
@Column(name="IMS_CLIENT_ID",nullable=false)
@GeneratedValue(strategy=GenerationType.AUTO)
@Autowired
private int clientId;
@Column(name="CLIENT_NAME",nullable=false)
@Autowired
private String name;
@Column(name="CLIENT_EMAIL",nullable=false)
@Autowired
private String email;
@Column(name="POINT_OF_CONTACT_NAME",nullable=false)
@Autowired
private String contactName;
@Column(name="CLIENT_PHONE",nullable=false)
@Autowired
private String phone;
@Column(name="CLIENT_FAX",nullable=false)
@Autowired
private String fax;
@OneToOne
<<<<<<< HEAD
@Column(name="ADDRESS_ID",unique=true,nullable=false)
@Autowired
=======
@JoinColumn(name="ADDRESS_ID",unique=true,nullable=false)
>>>>>>> refs/remotes/origin/master
private Address address;
@ManyToOne
@JoinColumn(name="CLIENT_TYPE_ID",nullable=false)
@Autowired
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
@Autowired
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
