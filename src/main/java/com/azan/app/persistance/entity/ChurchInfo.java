package com.azan.app.persistance.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * The persistent class for the church_info database table.
 * 
 */
@Entity
@Table(name="church_info")
public class ChurchInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="church_id")
	private BigInteger churchId;

	@Column(name="church_country")
	private String churchCountry;

	@Column(name="church_diocese")
	private String churchDiocese;

	@Column(name="church_district")
	private String churchDistrict;

	@Column(name="church_door_no")
	private String churchDoorNo;

	@Column(name="church_email_id")
	private String churchEmailId;

	@Column(name="church_mobile_no")
	private BigDecimal churchMobileNo;

	@Column(name="church_name")
	private String churchName;

	@Column(name="church_pincode")
	private int churchPincode;

	@Column(name="church_state")
	private String churchState;

	@Column(name="church_street")
	private String churchStreet;

	@Column(name="church_taluk")
	private String churchTaluk;

	@Column(name="church_telephone_no")
	private BigInteger churchTelephoneNo;

	@Column(name="church_village")
	private String churchVillage;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="is_active")
	private byte isActive;

	//bi-directional one-to-one association to ChurchAdditionalInfo
	@OneToOne(mappedBy="churchInfo")
	private ChurchAdditionalInfo churchAdditionalInfo;

	//bi-directional one-to-one association to ChurchEntity
	@OneToOne
	@JoinColumn(name="church_id")
	private ChurchEntity churchEntity;
	
	@Transient
	private ArrayList<String> countryList;
	
	@Transient
	private ArrayList<String> stateList;
	
	@Transient
	private ArrayList<String> districtList;

	public ChurchInfo() {
	}

	

	public BigInteger getChurchId() {
		return churchId;
	}



	public void setChurchId(BigInteger churchId) {
		this.churchId = churchId;
	}



	public String getChurchCountry() {
		return this.churchCountry;
	}

	public void setChurchCountry(String churchCountry) {
		this.churchCountry = churchCountry;
	}

	public String getChurchDiocese() {
		return this.churchDiocese;
	}

	public void setChurchDiocese(String churchDiocese) {
		this.churchDiocese = churchDiocese;
	}

	public String getChurchDistrict() {
		return this.churchDistrict;
	}

	public void setChurchDistrict(String churchDistrict) {
		this.churchDistrict = churchDistrict;
	}

	public String getChurchDoorNo() {
		return this.churchDoorNo;
	}

	public void setChurchDoorNo(String churchDoorNo) {
		this.churchDoorNo = churchDoorNo;
	}

	public String getChurchEmailId() {
		return this.churchEmailId;
	}

	public void setChurchEmailId(String churchEmailId) {
		this.churchEmailId = churchEmailId;
	}

	public BigDecimal getChurchMobileNo() {
		return this.churchMobileNo;
	}

	public void setChurchMobileNo(BigDecimal bigDecimal) {
		this.churchMobileNo = bigDecimal;
	}

	public String getChurchName() {
		return this.churchName;
	}

	public void setChurchName(String churchName) {
		this.churchName = churchName;
	}

	public int getChurchPincode() {
		return this.churchPincode;
	}

	public void setChurchPincode(int churchPincode) {
		this.churchPincode = churchPincode;
	}

	public String getChurchState() {
		return this.churchState;
	}

	public void setChurchState(String churchState) {
		this.churchState = churchState;
	}

	public String getChurchStreet() {
		return this.churchStreet;
	}

	public void setChurchStreet(String churchStreet) {
		this.churchStreet = churchStreet;
	}

	public String getChurchTaluk() {
		return this.churchTaluk;
	}

	public void setChurchTaluk(String churchTaluk) {
		this.churchTaluk = churchTaluk;
	}

	public BigInteger getChurchTelephoneNo() {
		return this.churchTelephoneNo;
	}

	public void setChurchTelephoneNo(BigInteger churchTelephoneNo) {
		this.churchTelephoneNo = churchTelephoneNo;
	}

	public String getChurchVillage() {
		return this.churchVillage;
	}

	public void setChurchVillage(String churchVillage) {
		this.churchVillage = churchVillage;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public ChurchAdditionalInfo getChurchAdditionalInfo() {
		return this.churchAdditionalInfo;
	}

	public void setChurchAdditionalInfo(ChurchAdditionalInfo churchAdditionalInfo) {
		this.churchAdditionalInfo = churchAdditionalInfo;
	}

	public ChurchEntity getChurchEntity() {
		return this.churchEntity;
	}

	public void setChurchEntity(ChurchEntity churchEntity) {
		this.churchEntity = churchEntity;
	}

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