package com.revature.beans;

public class State {
	private int stateId;
	private String stateName;
	private String abbreviation;
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public State(int stateId, String stateName, String abbreviation) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.abbreviation = abbreviation;
	}
	public State() {
		super();
	}
	
	
	
	
}
