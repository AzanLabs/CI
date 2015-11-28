package com.azan.app.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;


@Component
public class SessionModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	public UserModel currentUser;


	public UserModel getCurrentUser() {
		return currentUser;
	}


	public void setCurrentUser(UserModel currentUser) {
		this.currentUser = currentUser;
	}


}
