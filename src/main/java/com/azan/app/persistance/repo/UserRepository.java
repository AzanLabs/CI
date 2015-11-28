package com.azan.app.persistance.repo;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.azan.app.persistance.entity.User;

public interface UserRepository extends JpaRepository<User, BigInteger> {

	//public User findByUserEmail(String userEmail);
	
	@Query("select u from User u where u.userEmail = :loginName and u.userPassword = :password ")
	public User getloginUser(@Param("loginName")String loginName,@Param("password")String password);

}
