package com.azan.app.model;

import java.io.Serializable;
import java.math.BigInteger;

public class FacilitiesGrpModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private BigInteger faclityId;
	private String facilityName;
	
	
	
	public BigInteger getFaclityId() {
		return faclityId;
	}
	public void setFaclityId(BigInteger faclityId) {
		this.faclityId = faclityId;
	}
	public String getFacilityName() {
		return facilityName;
	}
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}
	

}
