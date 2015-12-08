package com.azan.app.core.service;

import java.util.List;

import com.azan.app.model.ChurchInfoModel;
import com.azan.app.model.PriestInfoModel;
import com.azan.app.model.UserChurchInfoModal;



public interface AdminService {
	
	public boolean savePriestinfo(PriestInfoModel priest);

	public boolean saveChurchInfo(UserChurchInfoModal church);

	public boolean saveChurchDetails(ChurchInfoModel church);
	
	public ChurchInfoModel getAllChurchDetails(String church);
}
