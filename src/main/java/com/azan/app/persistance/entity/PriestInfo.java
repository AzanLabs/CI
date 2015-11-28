package com.azan.app.persistance.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the priest_info database table.
 * 
 */
@Entity
@Table(name="priest_info")
public class PriestInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="priest_id", nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger priestId;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="is_active")
	private byte isActive;

	@Column(name="priest_additional_position")
	private String priestAdditionalPosition;

	@Column(name="priest_birth_place")
	private String priestBirthPlace;

	@Column(name="priest_country")
	private String priestCountry;

	@Column(name="priest_diocese")
	private String priestDiocese;

	@Column(name="priest_district")
	private String priestDistrict;

	@Temporal(TemporalType.DATE)
	@Column(name="priest_dob")
	private Date priestDob;

	@Column(name="priest_door_no")
	private String priestDoorNo;

	@Column(name="priest_educated_university")
	private String priestEducatedUniversity;

	@Column(name="priest_education")
	private String priestEducation;

	@Column(name="priest_email_id")
	private String priestEmailId;

	@Column(name="priest_image_name")
	private String priestImageName;

	@Column(name="priest_mobile_no")
	private BigInteger priestMobileNo;

	@Column(name="priest_name")
	private String priestName;

	@Column(name="priest_pincode")
	private int priestPincode;

	@Column(name="priest_specialization")
	private String priestSpecialization;

	@Column(name="priest_state")
	private String priestState;

	@Column(name="priest_street")
	private String priestStreet;

	@Column(name="priest_taluk")
	private String priestTaluk;

	@Column(name="priest_telephone_no")
	private BigInteger priestTelephoneNo;

	@Column(name="priest_village")
	private String priestVillage;

	//bi-directional one-to-one association to PriestAdditionalInfo
	@OneToOne(mappedBy="priestInfoBean")
	private PriestAdditionalInfo priestAdditionalInfo;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public PriestInfo() {
	}

	public BigInteger getPriestId() {
		return this.priestId;
	}

	public void setPriestId(BigInteger priestId) {
		this.priestId = priestId;
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

	public String getPriestAdditionalPosition() {
		return this.priestAdditionalPosition;
	}

	public void setPriestAdditionalPosition(String priestAdditionalPosition) {
		this.priestAdditionalPosition = priestAdditionalPosition;
	}

	public String getPriestBirthPlace() {
		return this.priestBirthPlace;
	}

	public void setPriestBirthPlace(String priestBirthPlace) {
		this.priestBirthPlace = priestBirthPlace;
	}

	public String getPriestCountry() {
		return this.priestCountry;
	}

	public void setPriestCountry(String priestCountry) {
		this.priestCountry = priestCountry;
	}

	public String getPriestDiocese() {
		return this.priestDiocese;
	}

	public void setPriestDiocese(String priestDiocese) {
		this.priestDiocese = priestDiocese;
	}

	public String getPriestDistrict() {
		return this.priestDistrict;
	}

	public void setPriestDistrict(String priestDistrict) {
		this.priestDistrict = priestDistrict;
	}

	public Date getPriestDob() {
		return this.priestDob;
	}

	public void setPriestDob(Date priestDob) {
		this.priestDob = priestDob;
	}

	public String getPriestDoorNo() {
		return this.priestDoorNo;
	}

	public void setPriestDoorNo(String priestDoorNo) {
		this.priestDoorNo = priestDoorNo;
	}

	public String getPriestEducatedUniversity() {
		return this.priestEducatedUniversity;
	}

	public void setPriestEducatedUniversity(String priestEducatedUniversity) {
		this.priestEducatedUniversity = priestEducatedUniversity;
	}

	public String getPriestEducation() {
		return this.priestEducation;
	}

	public void setPriestEducation(String priestEducation) {
		this.priestEducation = priestEducation;
	}

	public String getPriestEmailId() {
		return this.priestEmailId;
	}

	public void setPriestEmailId(String priestEmailId) {
		this.priestEmailId = priestEmailId;
	}

	public String getPriestImageName() {
		return this.priestImageName;
	}

	public void setPriestImageName(String priestImageName) {
		this.priestImageName = priestImageName;
	}

	public BigInteger getPriestMobileNo() {
		return this.priestMobileNo;
	}

	public void setPriestMobileNo(BigInteger priestMobileNo) {
		this.priestMobileNo = priestMobileNo;
	}

	public String getPriestName() {
		return this.priestName;
	}

	public void setPriestName(String priestName) {
		this.priestName = priestName;
	}

	public int getPriestPincode() {
		return this.priestPincode;
	}

	public void setPriestPincode(int priestPincode) {
		this.priestPincode = priestPincode;
	}

	public String getPriestSpecialization() {
		return this.priestSpecialization;
	}

	public void setPriestSpecialization(String priestSpecialization) {
		this.priestSpecialization = priestSpecialization;
	}

	public String getPriestState() {
		return this.priestState;
	}

	public void setPriestState(String priestState) {
		this.priestState = priestState;
	}

	public String getPriestStreet() {
		return this.priestStreet;
	}

	public void setPriestStreet(String priestStreet) {
		this.priestStreet = priestStreet;
	}

	public String getPriestTaluk() {
		return this.priestTaluk;
	}

	public void setPriestTaluk(String priestTaluk) {
		this.priestTaluk = priestTaluk;
	}

	public BigInteger getPriestTelephoneNo() {
		return this.priestTelephoneNo;
	}

	public void setPriestTelephoneNo(BigInteger priestTelephoneNo) {
		this.priestTelephoneNo = priestTelephoneNo;
	}

	public String getPriestVillage() {
		return this.priestVillage;
	}

	public void setPriestVillage(String priestVillage) {
		this.priestVillage = priestVillage;
	}

	public PriestAdditionalInfo getPriestAdditionalInfo() {
		return this.priestAdditionalInfo;
	}

	public void setPriestAdditionalInfo(PriestAdditionalInfo priestAdditionalInfo) {
		this.priestAdditionalInfo = priestAdditionalInfo;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}