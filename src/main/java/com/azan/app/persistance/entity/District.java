package com.azan.app.persistance.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the district database table.
 * 
 */
@Entity
@Table(name="district")
public class District implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="district_id")
	private int districtId;

	@Column(name="country_id")
	private int countryId;

	@Column(name="district_abbr")
	private String districtAbbr;

	@Column(name="district_code")
	private String districtCode;

	@Column(name="district_name")
	private String districtName;

	@Column(name="state_id")
	private int stateId;

	public District() {
	}

	public int getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getDistrictAbbr() {
		return this.districtAbbr;
	}

	public void setDistrictAbbr(String districtAbbr) {
		this.districtAbbr = districtAbbr;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public int getStateId() {
		return this.stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

}