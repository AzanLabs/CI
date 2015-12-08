package com.azan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.azan.app.core.service.AdminService;
import com.azan.app.model.ChurchInfoModel;
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
	

}
