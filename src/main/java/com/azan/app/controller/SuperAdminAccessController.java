package com.azan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.azan.app.core.service.AdminService;
import com.azan.app.model.ChurchInfoModel;
import com.azan.app.model.PriestInfoModel;
import com.azan.app.model.UserChurchInfoModal;


@Controller
@RequestMapping("/superAdminAccess")
public class SuperAdminAccessController {



	@Autowired
	AdminService adminService;
	
	@RequestMapping("/layout")
    public String getLoginPartialPage() {
        return "superAdminAccess";
    }
	
	@RequestMapping(value = "/addUserChurchInfo", method = RequestMethod.POST)
	public @ResponseBody
	Boolean addUserinfo(@RequestBody UserChurchInfoModal Priest) {
		try {
			boolean updated = adminService.saveChurchInfo(Priest);
			return updated;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
}
