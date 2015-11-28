package com.azan.app.core.service;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.azan.app.exception.DataTransationException;
import com.azan.app.model.UserModel;
import com.azan.app.persistance.entity.User;

public interface SignupService {
	
	@Transactional
	public User authenticateUser(UserModel userModel) throws DataTransationException;
	
	public ArrayList<String> getAllCountry() throws DataTransationException;
	
	public ArrayList<String> getAllStateByCountry(String country) throws DataTransationException;
	
	public ArrayList<String> getAllDistrictByState(String state) throws DataTransationException;

	public ArrayList<String> getAllCityByDistrict(String district) throws DataTransationException;

	public ArrayList<String> getAllChurchByCity(String city) throws DataTransationException;
	

}
