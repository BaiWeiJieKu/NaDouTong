package com.ndt.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ndt.entity.Captaininfo;
import com.ndt.service.CaptainService;
import com.ndt.util.DateFormat;
import com.ndt.util.JsonData;

@Controller
public class CaptainController {

	@Autowired
	private CaptainService captainService;

	@RequestMapping("/api/driverTeam.json")
	@ResponseBody
	public JsonData DriverTeam() {
		List<Captaininfo> cap = captainService.selectDriversTeam();
		return JsonData.success(cap);
	}

	@RequestMapping("/api/insertMyTeam.json")
	@ResponseBody
	public JsonData insertCaptain(Captaininfo captaininfo) {
		JsonData insertCaptain = captainService.insertCaptain(captaininfo);
		return insertCaptain;
	}

	@RequestMapping("/api/deleteMyTeam.json")
	@ResponseBody
	public JsonData deleteCaptain(Integer[] ids) {

		JsonData deleteCaptain = captainService.deleteCaptain(ids);
		return deleteCaptain;
	}

	@RequestMapping("/api/updeteMyTeam.json")
	@ResponseBody
	public JsonData altCaptain(Captaininfo captaininfo) {

		JsonData altCaptain = captainService.altCaptain(captaininfo);
		return altCaptain;
	}

	@RequestMapping("/api/myTeam.json")
	@ResponseBody
	public JsonData selectCaptain(Captaininfo captaininfo, Integer page,String start,String end) {
		try {
			Date startDate = DateFormat.getDateFormat(start);
			Date endDate = DateFormat.getDateFormat(end);
			JsonData selectCaptain = captainService.selectCaptain(captaininfo, page,startDate,endDate);
			return selectCaptain;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
}
