package com.azan.app.persistance.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the state database table.
 * 
 */
@Entity
@Table(name="state")
public class State implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="state_id")
	private int stateId;

	@Column(name="state_abbr")
	private String stateAbbr;

	@Column(name="state_code")
	private String stateCode;

	@Column(name="state_name")
	private String stateName;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="country_id")
	private Country country;

	public State() {
	}

	public int getStateId() {
		return this.stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateAbbr() {
		return this.stateAbbr;
	}

	public void setStateAbbr(String stateAbbr) {
		this.stateAbbr = stateAbbr;
	}

	public String getStateCode() {
		return this.stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}