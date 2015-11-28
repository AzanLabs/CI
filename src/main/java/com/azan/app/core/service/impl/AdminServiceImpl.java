package com.azan.app.core.service.impl;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azan.app.core.service.AdminService;
import com.azan.app.model.ChurchInfoModel;
import com.azan.app.model.PriestInfoModel;
import com.azan.app.persistance.entity.ChurchAdditionalInfo;
import com.azan.app.persistance.entity.ChurchEntity;
import com.azan.app.persistance.entity.ChurchInfo;
import com.azan.app.persistance.entity.PriestAdditionalInfo;
import com.azan.app.persistance.entity.PriestInfo;
import com.azan.app.persistance.entity.User;
import com.azan.app.persistance.repo.ChurchAddInfoJPARepository;
import com.azan.app.persistance.repo.ChurchEntityJPARepository;
import com.azan.app.persistance.repo.ChurchInfoJPARepository;
import com.azan.app.persistance.repo.PriestAddInfoJPARepository;
import com.azan.app.persistance.repo.PriestInfoJPARepository;
import com.azan.app.persistance.repo.UserRepository;

@Service
public class AdminServiceImpl implements AdminService {



	private static final long serialVersionUID = 1L;

	static final Logger logger = Logger.getLogger(AdminServiceImpl.class);

	
	
	@Autowired
	PriestInfoJPARepository priestinforepo;
	
	@Autowired
	ChurchInfoJPARepository churchinforepo;
	
	@Autowired
	PriestAddInfoJPARepository  priestaddinforepo; 
	
	@Autowired
	ChurchAddInfoJPARepository churchaddinforepo;
	
	@Autowired
	UserRepository userrepo;
	
	@Autowired
	ChurchEntityJPARepository churchentinfo;
	
	Date currentDate = new Date();
	
	
	public boolean savePriestinfo(PriestInfoModel priest) {
     boolean save = false;
		
		try
		{
			PriestInfo priestobj= new PriestInfo();
			priestobj.setPriestName(priest.getPriestName());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			priestobj.setPriestDob(sdf.parse(priest.getPriestDob()));
			priestobj.setPriestBirthPlace(priest.getPriestBplace());
			priestobj.setPriestEducation(priest.getPriestEdu());
			priestobj.setPriestSpecialization(priest.getPriestSpec());
			priestobj.setPriestEducatedUniversity(priest.getPriestEducuni());
			priestobj.setPriestDoorNo(priest.getPriestDoorno());
			priestobj.setPriestStreet(priest.getPriestStreet());
			priestobj.setPriestVillage(priest.getPriestVillage());
			priestobj.setPriestTaluk(priest.getPriestTK());
			priestobj.setPriestDistrict(priest.getPriestDist());
			priestobj.setPriestState(priest.getPriestState());
			priestobj.setPriestCountry(priest.getPriestCountry());
			priestobj.setPriestPincode(priest.getPriestPincode());
			priestobj.setPriestTelephoneNo(priest.getPriestPhno());
			priestobj.setPriestMobileNo(priest.getPriestMobno());
			priestobj.setPriestEmailId(priest.getPriestEmail());
			priestobj.setPriestDiocese(priest.getPriestDiocese());
			priestobj.setPriestAdditionalPosition(priest.getPriestAddposition());
			priestobj.setPriestImageName(priest.getPriestImagename());
			User user =userrepo.findOne(priest.getUserid());
			priestobj.setUser(user);
			//priestobj.setCreatedOn();
			//priestobj.setIsActive(0);
			priestinforepo.saveAndFlush(priestobj);
			
			PriestAdditionalInfo priestadobj= new PriestAdditionalInfo();
			priestadobj.setPriestId(priestobj.getPriestId());
			priestadobj.setPriestInfo(priest.getPriestInfo());
			priestaddinforepo.saveAndFlush(priestadobj);
					save = true;
					return save;
		}

		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	

	public boolean saveChurchinfo(ChurchInfoModel church) {
		 boolean save = false;
			try
			{
				
				ChurchEntity churchent = new ChurchEntity();
				churchent.setEntityAddress(church.getChurchDoorno()+church.getChurchStreet()+church.getChurchVillage()+church.getChurchTK() );
				churchent.setEntityName(church.getChurchName());
				churchent.setEntityEmailId(church.getChurchEmail());
				churchent.setEntityContactNo(church.getChurchMobno());
				churchentinfo.saveAndFlush(churchent);
				
				
				
				ChurchInfo churchtobj= new ChurchInfo();
				churchtobj.setChurchId(churchent.getChurchId());
				churchtobj.setChurchName(church.getChurchName());
				churchtobj.setChurchDoorNo(church.getChurchDoorno());
				churchtobj.setChurchStreet(church.getChurchStreet());
				churchtobj.setChurchVillage(church.getChurchVillage());
				churchtobj.setChurchTaluk(church.getChurchTK());
				churchtobj.setChurchDistrict(church.getChurchDist());
				churchtobj.setChurchState(church.getChurchState());
				churchtobj.setChurchCountry(church.getChurchCountry());
				churchtobj.setChurchDiocese(church.getChurchDiocese());
				churchtobj.setChurchTelephoneNo(church.getChurchPhno());
				churchtobj.setChurchMobileNo(church.getChurchMobno());
				churchtobj.setChurchPincode(church.getChurchPincode());
				churchtobj.setChurchEmailId(church.getChurchEmail());
				
				//churchtobj.setCreatedOn(currentDate);
				//priestobj.setIsActive("Y");
				churchinforepo.saveAndFlush(churchtobj);
				
				
				ChurchAdditionalInfo chrinfoobj= new ChurchAdditionalInfo();
				chrinfoobj.setChurchId(churchent.getChurchId());
				chrinfoobj.setChurchIntro(church.getChurchIntro());
				chrinfoobj.setChurchHistory(church.getChurchHistory());
				chrinfoobj.setChurchVision(church.getChurchVision());
				churchaddinforepo.saveAndFlush(chrinfoobj);
				
				
						save = true;
						return save;
			}
			catch (Exception e) {
				e.printStackTrace();
				return false;
			}
	}


	
	@Override
	public ChurchInfoModel getAllChurchDetails(String church) {
		
		
		 try
		 {
		ChurchInfo churchobj = churchinforepo.getChurchDetailsByChurch(church);
		
		ChurchInfoModel churchinfoobj= new ChurchInfoModel();
		
		churchinfoobj.setChurchDoorno(churchobj.getChurchDoorNo());
		churchinfoobj.setChurchVillage(churchobj.getChurchVillage());
		churchinfoobj.setChurchTK(churchobj.getChurchTaluk());
		churchinfoobj.setChurchDist(churchobj.getChurchDistrict());
		churchinfoobj.setChurchStreet(churchobj.getChurchStreet());
		churchinfoobj.setChurchState(churchobj.getChurchState());
		churchinfoobj.setChurchPincode(churchobj.getChurchPincode());
		churchinfoobj.setChurchName(churchobj.getChurchName());
		churchinfoobj.setChurchEmail(churchobj.getChurchEmailId());
		churchinfoobj.setChurchMobno(churchobj.getChurchMobileNo());
		churchinfoobj.setChurchPhno(churchobj.getChurchTelephoneNo());
		churchinfoobj.setChurchHistory(churchobj.getChurchAdditionalInfo().getChurchHistory());
		
		return  churchinfoobj;
		 }
		 
		 catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			
	}

	
}
