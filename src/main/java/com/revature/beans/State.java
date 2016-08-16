package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="IMS_STATE_ABBRV")
public class State {
	@Id
	@Column(name="ABBRV_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Autowired
	private int stateId;
	@Column(name="STATE_NAME")
	@Autowired
	private String stateName;
	@Column(name="STATE_ABBRV")
	@Autowired
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
	@Autowired
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
