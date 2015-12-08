package com.azan.app.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.google.api.client.util.DateTime;

public class ChurchInfoModel implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private BigInteger churchId;
	private String churchName;
	private String churchDoorno;
	private String churchStreet;
	private String churchVillage;
	private String churchTK;
	private String churchDist;
	private String churchState;
	private String churchCountry;
	private Integer churchPincode;
	private BigInteger churchPhno;
	private BigDecimal churchMobno;
	private String churchEmail;
	private String churchDiocese;
	private DateTime createdOn;
	private String churchIntro;
	private String churchHistory;
	private String churchVision;
	private String entityAddress;
	
	public String getChurchIntro() {
		return churchIntro;
	}
	public void setChurchIntro(String churchIntro) {
		this.churchIntro = churchIntro;
	}
	public String getChurchHistory() {
		return churchHistory;
	}
	public void setChurchHistory(String churchHistory) {
		this.churchHistory = churchHistory;
	}
	public String getChurchVision() {
		return churchVision;
	}
	public void setChurchVision(String churchVision) {
		this.churchVision = churchVision;
	}
	public BigInteger getChurchId() {
		return churchId;
	}
	public void setChurchId(BigInteger churchId) {
		this.churchId = churchId;
	}
	public String getChurchName() {
		return churchName;
	}
	public void setChurchName(String churchName) {
		this.churchName = churchName;
	}
	public String getChurchDoorno() {
		return churchDoorno;
	}
	public void setChurchDoorno(String churchDoorno) {
		this.churchDoorno = churchDoorno;
	}
	public String getChurchStreet() {
		return churchStreet;
	}
	public void setChurchStreet(String churchStreet) {
		this.churchStreet = churchStreet;
	}
	public String getChurchVillage() {
		return churchVillage;
	}
	public void setChurchVillage(String churchVillage) {
		this.churchVillage = churchVillage;
	}
	public String getChurchTK() {
		return churchTK;
	}
	public void setChurchTK(String churchTK) {
		this.churchTK = churchTK;
	}
	public String getChurchDist() {
		return churchDist;
	}
	public void setChurchDist(String churchDist) {
		this.churchDist = churchDist;
	}
	public String getChurchState() {
		return churchState;
	}
	public void setChurchState(String churchState) {
		this.churchState = churchState;
	}
	public String getChurchCountry() {
		return churchCountry;
	}
	public void setChurchCountry(String churchCountry) {
		this.churchCountry = churchCountry;
	}
	
	public Integer getChurchPincode() {
		return churchPincode;
	}
	public void setChurchPincode(Integer churchPincode) {
		this.churchPincode = churchPincode;
	}
	public BigInteger getChurchPhno() {
		return churchPhno;
	}
	public void setChurchPhno(BigInteger churchPhno) {
		this.churchPhno = churchPhno;
	}
	
	public BigDecimal getChurchMobno() {
		return churchMobno;
	}
	public void setChurchMobno(BigDecimal churchMobno) {
		this.churchMobno = churchMobno;
	}
	public String getChurchEmail() {
		return churchEmail;
	}
	public void setChurchEmail(String churchEmail) {
		this.churchEmail = churchEmail;
	}
	public String getChurchDiocese() {
		return churchDiocese;
	}
	public void setChurchDiocese(String churchDiocese) {
		this.churchDiocese = churchDiocese;
	}
	public DateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(DateTime createdOn) {
		this.createdOn = createdOn;
	}
	public String getEntityAddress() {
		return entityAddress;
	}
	public void setEntityAddress(String entityAddress) {
		this.entityAddress = entityAddress;
	}
	
   
	
	


}
