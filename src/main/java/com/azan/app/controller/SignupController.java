package com.azan.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.azan.app.core.service.AdminService;
import com.azan.app.core.service.LoginService;
import com.azan.app.core.service.SignupService;
import com.azan.app.model.ChurchInfoModel;
import com.azan.app.model.ResponseObject;
import com.azan.app.model.SessionModel;
import com.azan.app.model.UserModel;

@Controller
@RequestMapping("/signin")
public class SignupController {
	
	@Autowired
	private SignupService signupService;
	
	@RequestMapping("/layout")
	public String getSigninPartialPage(){
		return "signin";
	}
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	SessionModel model;
	
    public UserModel currentUser=new UserModel();

    
    
    @RequestMapping("/userdetails")
	public @ResponseBody UserModel getLogin(@RequestBody UserModel userModel, HttpServletRequest request){
		
		
		//request.getSession().setAttribute("userId", "urowuerewoir");
		//request.getSession().setAttribute("shopId", "jksdhfkjsdfh");
		try{
			UserModel userModel1=new UserModel();
			if(!StringUtils.isEmpty(userModel.getUserEmailid()) && !StringUtils.isEmpty(userModel.getPassword())){
				
				userModel1 = loginService.signUser(userModel);
				//request.getSession().setAttribute("userId", userModel1.getUserId());
				//request.getSession().setAttribute("shopId", userModel1.getShopId());
				currentUser=userModel1;
				
				
		return userModel1;
			}else{
				return null;
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
    
    
	@RequestMapping(value = "/country", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<String> getAllCountry(){
		
		ArrayList<String> response=null;
		try{
			
			 response =signupService.getAllCountry();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}
	
	@RequestMapping(value = "/state/{country}", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<String> getAllState(@PathVariable("country") String country){
		
		ArrayList<String> response=null;
		
		try{
			
			 response =signupService.getAllStateByCountry(country);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}
	
	@RequestMapping(value = "/district/{state}", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<String> getAllDistrict(@PathVariable("state") String state){
		
		ArrayList<String> response=null;
		try{
			
			 response =signupService.getAllDistrictByState(state);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}
	
	
	@RequestMapping(value = "/city/{district}", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<String> getAllCity(@PathVariable("district") String district){
		
		ArrayList<String> response=null;
		try{
			
			 response =signupService.getAllCityByDistrict(district);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}

	@RequestMapping(value = "/church/{city}", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<String> getAllChurch(@PathVariable("city") String city){
		
		ArrayList<String> response=null;
		try{
			
			 response =signupService.getAllChurchByCity(city);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}
	
	@RequestMapping(value = "/churchInfo/{church}", method = RequestMethod.GET)
	@ResponseBody
	public ChurchInfoModel getChurchDetails(@PathVariable("church") String church){

		ChurchInfoModel list = adminService.getAllChurchDetails(church);
			return list;
		
	}
	
	
}
