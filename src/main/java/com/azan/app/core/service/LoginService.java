package com.azan.app.core.service;

import org.springframework.transaction.annotation.Transactional;

import com.azan.app.model.UserModel;

public interface LoginService {

	@Transactional
	public UserModel signUser(UserModel userModel);
	
}
