package com.azan.app.persistance.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigInteger;


/**
 * The persistent class for the church_facilities database table.
 * 
 */
@Entity
@Table(name="church_facilities")
@NamedQuery(name="ChurchFacility.findAll", query="SELECT c FROM ChurchFacility c")
public class ChurchFacility implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="chrurd_id")
	private BigInteger chrurdId;

	@Column(name="facility_id")
	private BigInteger facilityId;

	public ChurchFacility() {
	}

	public BigInteger getChrurdId() {
		return this.chrurdId;
	}

	public void setChrurdId(BigInteger chrurdId) {
		this.chrurdId = chrurdId;
	}

	public BigInteger getFacilityId() {
		return this.facilityId;
	}

	public void setFacilityId(BigInteger facilityId) {
		this.facilityId = facilityId;
	}

}