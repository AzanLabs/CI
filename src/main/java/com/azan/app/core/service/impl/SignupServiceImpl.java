package com.azan.app.core.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azan.app.core.service.SignupService;
import com.azan.app.core.service.UserDataMapperService;
import com.azan.app.exception.DataTransationException;
import com.azan.app.model.LocalityModel;
import com.azan.app.model.UserModel;
import com.azan.app.persistance.entity.User;
import com.azan.app.persistance.repo.ChurchInfoJPARepository;
import com.azan.app.persistance.repo.CountryJPARepository;
import com.azan.app.util.ModelConverterUtil;

@Service
public class SignupServiceImpl implements SignupService {
	
	@Autowired
	private UserDataMapperService userDataMapperService;
	
	@Autowired
	CountryJPARepository  countryrepo;
	
	@Autowired
	ChurchInfoJPARepository churchinforepo;

	public User authenticateUser(UserModel userModel) throws DataTransationException {
		
		User user = null;
	try{
			
			user = ModelConverterUtil.fromUserModelToUser(userModel);
			return userDataMapperService.authenticateUser(user);
			
		}catch(Exception e){
			throw new DataTransationException(e.getCause().getMessage(), e);
		}
	}

	
	@Override
	public ArrayList<String> getAllStateByCountry(String country) throws DataTransationException {
		
		ArrayList<String> stateList=null;
		try
		{
			stateList=churchinforepo.getAllStates(country);
			
		return stateList;
		}
		catch (Exception e) {
			throw new DataTransationException(e.getCause().getMessage(), e);
		}
		
	}

	@Override
	public ArrayList<String> getAllDistrictByState(String state) throws DataTransationException {
		
		ArrayList<String> districtList=null;
		try
		{
			districtList=churchinforepo.getAllDistrict(state);
		return districtList;
		}
		catch (Exception e) {
			throw new DataTransationException(e.getCause().getMessage(), e);
		}
		
	}


	@Override
	public ArrayList<String> getAllCountry() throws DataTransationException {
		
		LocalityModel contactInfo = new LocalityModel();
		ArrayList<String> countryList= null;
		try
		{
			countryList=churchinforepo.getcountry();
			
			contactInfo.setCountryList(countryList);
		return countryList;
		}
		catch (Exception e) {
			throw new DataTransationException(e.getCause().getMessage(), e);
		}
		
	
	}


	@Override
	public ArrayList<String> getAllCityByDistrict(String district)
			throws DataTransationException {
		
		ArrayList<String> cityList=null;
		try
		{
			cityList=churchinforepo.getAllCity(district);
		return cityList;
		}
		catch (Exception e) {
			throw new DataTransationException(e.getCause().getMessage(), e);
		}
	}


	@Override
	public ArrayList<String> getAllChurchByCity(String city)
			throws DataTransationException {
		ArrayList<String> churchList=null;
		try
		{
			churchList=churchinforepo.getAllChurch(city);
		return churchList;
		}
		catch (Exception e) {
			throw new DataTransationException(e.getCause().getMessage(), e);
		}
	}

	

}
