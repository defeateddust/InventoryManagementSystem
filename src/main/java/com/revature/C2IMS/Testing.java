package com.revature.C2IMS;

import com.revature.beans.State;
import com.revature.database.DataLayer;

public class Testing {
public static void main(String[] args) {
	String[] stateArr = new String[] {"Alabama", "Arkansas", "Arizona", "Alaska", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" };
	String[] abbreviations = new String[]{"AL","AR","AZ","AK","CA","CO","CT","DE","FL","GA","HI","IA","ID", "IL","IN","KS","KY","LA","MA","MD","ME","MH","MI","MN","MO","MS","MT","NC","ND","NE","NH","NJ","NM","NV","NY", "OH","OK","OR","PA","PR","PW","RI","SC","SD","TN","TX","UT","VA","VI","VT","WA","WV","WI","WY"};
	State obj = new State(0, "Alabama", "AL");
	for(int i=0;i<50;i++){
		System.out.print(stateArr[i] + " ");
		System.out.println(abbreviations[i]);
	}
	DataLayer dl = new DataLayer();
	dl.createRow(obj);
}
}
