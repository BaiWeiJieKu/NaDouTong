package com.ndt.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ndt.service.DataStatisticsService;
import com.ndt.util.JsonData;
import com.ndt.util.PageResult;

@Controller
public class DataStatisticsController2 {

	@Autowired
	private DataStatisticsService data;

	@RequestMapping("/statis.json")
	@ResponseBody
	public JsonData LoginCheck(String numberplate, String realname, String time,
			@RequestParam(value = "page", defaultValue = "1", required = false) Integer page) throws ParseException {
		List<Map<String, Object>> dataStatis = data.getDataStatis(realname, numberplate, time, page);
		int dataStatisCount = data.getDataStatisCount( realname, numberplate,time);
		PageResult<Map<String, Object>> pageResult = new PageResult<>(dataStatis, dataStatisCount);
		return JsonData.success(pageResult);
	}
}
