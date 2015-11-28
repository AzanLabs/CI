package com.azan.app.model;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * The UserModel.
 */
public class UserModel implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private BigInteger userId;
	
	private String isActive;
	
	private String username;
	
	private String userEmailid;
	
	private String password;
	
	private String userType;
	
	private String message;

	
	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	
	public String getUserEmailid() {
		return userEmailid;
	}

	public void setUserEmailid(String userEmailid) {
		this.userEmailid = userEmailid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
