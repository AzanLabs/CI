package com.azan.app.persistance.repo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.azan.app.persistance.entity.ChurchInfo;

public interface ChurchInfoJPARepository extends JpaRepository<ChurchInfo,BigInteger> {
	
	@Query("SELECT cc.churchCountry FROM ChurchInfo cc GROUP BY cc.churchCountry")
	public ArrayList<String> getcountry();
	
	@Query("SELECT cc.churchState FROM ChurchInfo cc WHERE cc.churchCountry=:churchCountry GROUP BY cc.churchState")
	public ArrayList<String> getAllStates(@Param("churchCountry") String churchCountry);
	
	@Query("SELECT cc.churchDistrict FROM ChurchInfo cc WHERE cc.churchState=:churchState GROUP BY cc.churchDistrict")
	public ArrayList<String> getAllDistrict(@Param("churchState") String churchState);
	
	@Query("SELECT cc.churchVillage FROM ChurchInfo cc WHERE cc.churchDistrict=:churchDistrict GROUP BY cc.churchVillage")
	public ArrayList<String> getAllCity(@Param("churchDistrict") String churchDistrict);
	
	@Query("SELECT cc.churchName FROM ChurchInfo cc WHERE cc.churchVillage=:churchCity GROUP BY cc.churchName")
	public ArrayList<String> getAllChurch(@Param("churchCity") String churchCity);
	
	@Query("select i from ChurchInfo i where  i.churchName = :churchName")
	public ChurchInfo getChurchDetailsByChurch(@Param("churchName")String churchName);

}
