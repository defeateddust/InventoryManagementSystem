package com.revature.C2IMS;

import java.util.List;

import com.revature.beans.Client;
import com.revature.database.DataLayer;

public class Testing {
public static void main(String[] args) {
	DataLayer dl = new DataLayer();
	List<Object> clients = dl.selectAllRows(new Client());
	if (clients != null)
		System.out.println(clients.size());
	else
		System.out.println("no list");
}
}
