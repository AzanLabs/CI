package com.azan.app.persistance.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the church_entity database table.
 * 
 */
@Entity
@Table(name="church_entity")
public class ChurchEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="church_id", nullable=false, unique=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger churchId;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="entity_address")
	private String entityAddress;

	@Column(name="entity_contact_no")
	private BigInteger entityContactNo;

	@Column(name="entity_email_id")
	private String entityEmailId;

	@Column(name="entity_name")
	private String entityName;

	@Column(name="is_active")
	private String isActive;

	@Column(name="is_church_set")
	private String isChurchSet;

	//bi-directional one-to-one association to ChurchInfo
	@OneToOne(mappedBy="churchEntity")
	private ChurchInfo churchInfo;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="churchEntity")
	private List<User> users;

	public ChurchEntity() {
	}

	
	public BigInteger getChurchId() {
		return churchId;
	}



	public void setChurchId(BigInteger churchId) {
		this.churchId = churchId;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getEntityAddress() {
		return this.entityAddress;
	}

	public void setEntityAddress(String entityAddress) {
		this.entityAddress = entityAddress;
	}

	public BigInteger getEntityContactNo() {
		return this.entityContactNo;
	}

	public void setEntityContactNo(BigInteger entityContactNo) {
		this.entityContactNo = entityContactNo;
	}

	public String getEntityEmailId() {
		return this.entityEmailId;
	}

	public void setEntityEmailId(String entityEmailId) {
		this.entityEmailId = entityEmailId;
	}

	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsChurchSet() {
		return this.isChurchSet;
	}

	public void setIsChurchSet(String isChurchSet) {
		this.isChurchSet = isChurchSet;
	}

	public ChurchInfo getChurchInfo() {
		return this.churchInfo;
	}

	public void setChurchInfo(ChurchInfo churchInfo) {
		this.churchInfo = churchInfo;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setChurchEntity(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setChurchEntity(null);

		return user;
	}

}