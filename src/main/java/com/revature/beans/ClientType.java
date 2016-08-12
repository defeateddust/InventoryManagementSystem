package com.revature.beans;

public class ClientType {
private int clientId;
private String type;
public int getClientId() {
	return clientId;
}
public void setClientId(int clientId) {
	this.clientId = clientId;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public ClientType(int clientId, String type) {
	super();
	this.clientId = clientId;
	this.type = type;
}
public ClientType() {
	super();
}


}
