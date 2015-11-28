package com.azan.app.model;

import java.io.Serializable;

public class ResponseObject implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String mCode;
	
	private String code;
	
	private UserModel userModel;
	
	private LocalityModel locality;

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

	public LocalityModel getLocality() {
		return locality;
	}

	public void setLocality(LocalityModel locality) {
		this.locality = locality;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getmCode() {
		return mCode;
	}

	public void setmCode(String mCode) {
		this.mCode = mCode;
	}
	
	

}
