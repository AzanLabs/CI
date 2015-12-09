package com.azan.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.azan.app.core.service.AdminService;
import com.azan.app.model.AddEventModel;
import com.azan.app.model.ChurchInfoModel;
import com.azan.app.model.FacilitiesGrpModel;
import com.azan.app.model.PriestInfoModel;


@Controller
@RequestMapping("/adminpage")
public class AdminController {



	@Autowired
	AdminService adminService;
	
	@RequestMapping("/layout")
    public String getLoginPartialPage() {
        return "adminpage";
    }
	
	@RequestMapping("/addPriestinfo")
	public @ResponseBody
	Boolean addPriestinfo(@RequestBody PriestInfoModel Priest) {
		try {
			boolean updated = adminService.savePriestinfo(Priest);
			return updated;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	
	@RequestMapping("/addChurchinfo")
	public @ResponseBody
	Boolean addChurchinfo(@RequestBody ChurchInfoModel church) {
		try {
			boolean updated = adminService.saveChurchDetails(church);
			return updated;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	
	@RequestMapping("/addEvents")
	public @ResponseBody
	Boolean addEvents(@RequestBody AddEventModel event) {
		try {
			boolean updated = adminService.saveEventinfo(event);
			return updated;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	
	@RequestMapping("/addFacilities")
	public @ResponseBody
	Boolean addFacilities(@RequestBody FacilitiesGrpModel facility) {
		try {
			boolean updated = adminService.saveFacilityGrp(facility);
			return updated;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	
	@RequestMapping("/churchFacility")
	public @ResponseBody List<String> getFacilities(){
		try{
			List<String> list = adminService.getFacilities();
			return list;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

}
