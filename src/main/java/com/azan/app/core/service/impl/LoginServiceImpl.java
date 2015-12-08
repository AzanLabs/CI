package com.azan.app.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azan.app.core.service.LoginService;
import com.azan.app.model.UserModel;
import com.azan.app.persistance.entity.User;
import com.azan.app.persistance.repo.UserRepository;



@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	UserRepository userJPARepo;

	@Override
	public UserModel signUser(UserModel userModel) {

		UserModel userModel1=new UserModel();
		try{
			User user=userJPARepo.getloginUser(userModel.getUserEmailid(), userModel.getPassword());
			if(user!=null)
			{
				userModel1.setUserId(user.getUserId());
				userModel1.setUserEmailid(user.getUserEmail());
				userModel1.setUserType(user.getUserType());
				//userModel1.setUsername(user.);
				
				userModel1.setMessage("SUCCESS");
			}	
			
			
		
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return userModel1;
	
	}

}
