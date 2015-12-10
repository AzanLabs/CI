package com.azan.app.persistance.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigInteger;


/**
 * The persistent class for the facility_grp database table.
 * 
 */
@Entity
@Table(name="facility_grp")
@NamedQuery(name="FacilityGrp.findAll", query="SELECT f FROM FacilityGrp f")
public class FacilityGrp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="facility_id", nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger facilityId;

	@Column(name="facility_name")
	private String facilityName;

	public FacilityGrp() {
	}

	public BigInteger getFacilityId() {
		return this.facilityId;
	}

	public void setFacilityId(BigInteger facilityId) {
		this.facilityId = facilityId;
	}

	public String getFacilityName() {
		return this.facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

}