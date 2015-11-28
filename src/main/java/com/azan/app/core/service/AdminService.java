package com.azan.app.core.service;

import java.util.List;

import com.azan.app.model.ChurchInfoModel;
import com.azan.app.model.PriestInfoModel;



public interface AdminService {
	
	public boolean savePriestinfo(PriestInfoModel priest);

	public boolean saveChurchinfo(ChurchInfoModel church);

	public ChurchInfoModel getAllChurchDetails(String church);
}
