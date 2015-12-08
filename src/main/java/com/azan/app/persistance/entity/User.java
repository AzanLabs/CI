package com.azan.app.persistance.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name="user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id", nullable=false, unique=true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger userId;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="is_active")
	private String isActive;

	@Column(name="is_default_pwd")
	private String isDefaultPwd;

	@Column(name="is_profile_set")
	private String isProfileSet;

	@Column(name="user_email")
	private String userEmail;
	
	@Column(name="user_identifier")
	private String userIdentifier;

	@Column(name="user_password")
	private String userPassword;

	@Column(name="user_type")
	private String userType;

	//bi-directional many-to-one association to PriestInfo
	@OneToMany(mappedBy="user")
	private List<PriestInfo> priestInfos;

	//bi-directional many-to-one association to ChurchEntity
	@ManyToOne
	@JoinColumn(name="church_id", nullable=false, unique=false)
	private ChurchEntity churchEntity;

	public User() {
	}

	

	public BigInteger getUserId() {
		return userId;
	}



	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}



	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsDefaultPwd() {
		return isDefaultPwd;
	}

	public void setIsDefaultPwd(String isDefaultPwd) {
		this.isDefaultPwd = isDefaultPwd;
	}

	public String getIsProfileSet() {
		return isProfileSet;
	}

	public void setIsProfileSet(String isProfileSet) {
		this.isProfileSet = isProfileSet;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public List<PriestInfo> getPriestInfos() {
		return priestInfos;
	}

	public void setPriestInfos(List<PriestInfo> priestInfos) {
		this.priestInfos = priestInfos;
	}

	public ChurchEntity getChurchEntity() {
		return churchEntity;
	}

	public void setChurchEntity(ChurchEntity churchEntity) {
		this.churchEntity = churchEntity;
	}

	public String getUserIdentifier() {
		return userIdentifier;
	}

	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}

}