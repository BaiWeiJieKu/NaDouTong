package com.ndt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ndt.util.JsonData;

@Controller
public class Meun {

	@RequestMapping(value = "/api/menu.json")
	@ResponseBody
	public String Menu() {
		return "{" + "\"ret\":true," + "\"msg\":\"\"," + "\"data\":" + "[{" + "\"id\":\"1\"," + "\"title\":\"基本信息\","
				+ "\"children\":[{" + "\"id\":\"2\"," + "\"title\":\"我的车队\"," + "\"href\":\"myTeam\"" + "},{"
				+ "\"id\":\"3\"," + "\"title\":\"司机管理\"," + "\"href\":\"driverManagement\"" + "},{" + "\"id\":\"4\","
				+ "\"title\":\"车源信息\"," + "\"href\":\"optionsInformation\"" + "},{" + "\"id\":\"5\","
				+ "\"title\":\"货源信息\"," + "\"href\":\"sourceInformation\"" + "}]" + "},{" + "\"id\":\"6\","
				+ "\"title\":\"订单管理\"," + "\"href\":\"orderManagement\"" + "},{" + "\"id\":\"7\","
				+ "\"title\":\"派单管理\"," + "\"href\":\"dispatchManagement\"" + "},{" + "\"id\":\"8\","
				+ "\"title\":\"运输管理\"," + "\"href\":\"transportManagement\"" + "},{" + "\"id\":\"9\","
				+ "\"title\":\"回单管理\"," + "\"href\":\"receipt\"" + "},{" + "\"id\":\"10\"," + "\"title\":\"信息统计\","
				+ "\"href\":\"statistics\"" + "},{" + "\"id\":\"11\"," + "\"title\":\"后台消息\"," + "\"children\":[{"
				+ "\"id\":\"12\"," + "\"title\":\"微信消息\"," + "\"href\":\"wechatInfomation\"" + "},{" + "\"id\":\"13\","
				+ "\"title\":\"审核消息\"," + "\"href\":\"reviewInfomation\"" + "}]" + "}]" + "}";
	}
	
	@RequestMapping(value = "/api/test.json")
	@ResponseBody
	public JsonData Menu1() {
		return JsonData.fail("/");
	}
}
