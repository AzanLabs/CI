package com.azan.app.model;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * The LocalityModel.
 */
public class LocalityModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private ArrayList<String> countryList;
	
	private ArrayList<String> stateList;
	
	private ArrayList<String> districtList;

	public ArrayList<String> getCountryList() {
		return countryList;
	}

	public void setCountryList(ArrayList<String> countryList) {
		this.countryList = countryList;
	}

	public ArrayList<String> getStateList() {
		return stateList;
	}

	public void setStateList(ArrayList<String> stateList) {
		this.stateList = stateList;
	}

	public ArrayList<String> getDistrictList() {
		return districtList;
	}

	public void setDistrictList(ArrayList<String> districtList) {
		this.districtList = districtList;
	}
	
	
	

}
