package com.azan.app.util;

import com.azan.app.model.UserModel;
import com.azan.app.persistance.entity.User;

public class ModelConverterUtil {
	
	
	public static User fromUserModelToUser(UserModel userModel){
		
		User user = new User();
		user.setUserEmail(userModel.getUserEmailid());
		user.setUserPassword(userModel.getPassword());
		
		return user;
	}
	
	public static UserModel fromUserToUserModel(User user){
		
		UserModel userModel = new UserModel();
		userModel.setUserEmailid(user.getUserEmail());
		userModel.setPassword(user.getUserPassword());
		
		return userModel;
	}

}
