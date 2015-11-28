package com.azan.app.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azan.app.core.service.UserDataMapperService;
import com.azan.app.persistance.entity.User;
import com.azan.app.persistance.repo.UserRepository;

@Service
public class UserDataMapperServiceImpl implements UserDataMapperService {

	
	@Autowired
	private UserRepository userRepository;
	
	
	public User authenticateUser(User user) {
		
		User vUser = null;
		try{
			
			//vUser = userRepository.findByUserEmail(user.getUserEmail());
			
		
			return vUser;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	
	

}
