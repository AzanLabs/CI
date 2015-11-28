package com.azan.app.model;

import java.io.Serializable;
import java.math.BigInteger;

import com.google.api.client.util.DateTime;

public class PriestInfoModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private BigInteger priestId;
	private String priestName;
	private String priestDob;
	private String priestBplace;
	private String priestEdu;
	private String priestSpec;
	private String priestEducuni;
	private String priestDoorno;
	private String priestStreet;
	private String priestVillage;
	private String priestTK;
	private String priestDist;
	private String priestState;
	private String priestCountry;
	private Integer priestPincode;
	private BigInteger priestPhno;
	private BigInteger priestMobno;
	private String priestEmail;
	private String priestAddposition;
	private String priestImagename;
	private String priestDiocese;
	private DateTime createdOn;
	private String priestInfo;
	private BigInteger userid;
	
	public BigInteger getPriestId() {
		return priestId;
	}
	public void setPriestId(BigInteger priestId) {
		this.priestId = priestId;
	}
	public String getPriestName() {
		return priestName;
	}
	public void setPriestName(String priestName) {
		this.priestName = priestName;
	}
	
	public String getPriestDob() {
		return priestDob;
	}
	public void setPriestDob(String priestDob) {
		this.priestDob = priestDob;
	}
	public String getPriestBplace() {
		return priestBplace;
	}
	public void setPriestBplace(String priestBplace) {
		this.priestBplace = priestBplace;
	}
	public String getPriestEdu() {
		return priestEdu;
	}
	public void setPriestEdu(String priestEdu) {
		this.priestEdu = priestEdu;
	}
	public String getPriestSpec() {
		return priestSpec;
	}
	public void setPriestSpec(String priestSpec) {
		this.priestSpec = priestSpec;
	}
	public String getPriestEducuni() {
		return priestEducuni;
	}
	public void setPriestEducuni(String priestEducuni) {
		this.priestEducuni = priestEducuni;
	}
	public String getPriestDoorno() {
		return priestDoorno;
	}
	public void setPriestDoorno(String priestDoorno) {
		this.priestDoorno = priestDoorno;
	}
	public String getPriestStreet() {
		return priestStreet;
	}
	public void setPriestStreet(String priestStreet) {
		this.priestStreet = priestStreet;
	}
	public String getPriestVillage() {
		return priestVillage;
	}
	public void setPriestVillage(String priestVillage) {
		this.priestVillage = priestVillage;
	}
	public String getPriestTK() {
		return priestTK;
	}
	public void setPriestTK(String priestTK) {
		this.priestTK = priestTK;
	}
	public String getPriestDist() {
		return priestDist;
	}
	public void setPriestDist(String priestDist) {
		this.priestDist = priestDist;
	}
	public String getPriestState() {
		return priestState;
	}
	public void setPriestState(String priestState) {
		this.priestState = priestState;
	}
	public String getPriestCountry() {
		return priestCountry;
	}
	public void setPriestCountry(String priestCountry) {
		this.priestCountry = priestCountry;
	}
	
	
	public Integer getPriestPincode() {
		return priestPincode;
	}
	public void setPriestPincode(Integer priestPincode) {
		this.priestPincode = priestPincode;
	}
	public BigInteger getPriestPhno() {
		return priestPhno;
	}
	public void setPriestPhno(BigInteger priestPhno) {
		this.priestPhno = priestPhno;
	}
	public BigInteger getPriestMobno() {
		return priestMobno;
	}
	public void setPriestMobno(BigInteger priestMobno) {
		this.priestMobno = priestMobno;
	}
	public String getPriestEmail() {
		return priestEmail;
	}
	public void setPriestEmail(String priestEmail) {
		this.priestEmail = priestEmail;
	}
	public String getPriestAddposition() {
		return priestAddposition;
	}
	public void setPriestAddposition(String priestAddposition) {
		this.priestAddposition = priestAddposition;
	}
	public String getPriestImagename() {
		return priestImagename;
	}
	public void setPriestImagename(String priestImagename) {
		this.priestImagename = priestImagename;
	}
	public String getPriestDiocese() {
		return priestDiocese;
	}
	public void setPriestDiocese(String priestDiocese) {
		this.priestDiocese = priestDiocese;
	}
	
	public DateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(DateTime createdOn) {
		this.createdOn = createdOn;
	}
	public String getPriestInfo() {
		return priestInfo;
	}
	public void setPriestInfo(String priestInfo) {
		this.priestInfo = priestInfo;
	}
	public BigInteger getUserid() {
		return userid;
	}
	public void setUserid(BigInteger userid) {
		this.userid = userid;
	}
	
	



}
