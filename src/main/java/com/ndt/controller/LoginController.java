package com.ndt.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ndt.entity.Logininfo;
import com.ndt.service.LoginService;
import com.ndt.util.JsonData;
import com.ndt.util.PageResult;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	/*
	 * public @ResponseBody List<Logininfo> Login(Logininfo login) {
	 * 
	 * return loginService.Login(login); }
	 */
	@RequestMapping("/api/login.json")
	@ResponseBody
	public JsonData LoginCheck(Logininfo login, String no,HttpServletRequest request) {
		login.setUsername(no);
		if (loginService.isLogin(login).size() > 0)
			return JsonData.fail("您没有登录权限!请联系管理员!");
		List<Logininfo> flag = loginService.Login(login);
		if (flag.size() >= 1) {
			request.getSession().setAttribute("login", flag.get(0));
			return JsonData.success();
		} else
			return JsonData.fail("用户名或密码不正确!");
	}

	@RequestMapping(value = "/api/register.json", method = RequestMethod.POST)
	@ResponseBody
	public JsonData insertLogin(@RequestBody Map<String, Object> params) {
		Logininfo logininfo = new Logininfo();
		logininfo.setUsername(params.get("no").toString());
		logininfo.setPassword(params.get("password").toString());
		JsonData insertLogin = loginService.insertLogin(logininfo);
		return insertLogin;

	}

	@RequestMapping("/api/isReview.json")
	@ResponseBody
	public JsonData isReview(Logininfo logininfo) {

		JsonData review = loginService.isReview(logininfo);
		return review;

	}

	@RequestMapping("/api/reviewInformation.json")
	@ResponseBody
	public JsonData reviewInformation(Logininfo logininfo, Integer page) {
		List<Logininfo> data = loginService.reviewInformation(page);
		int count = loginService.reviewInformationCount();
		PageResult<Logininfo> loginData = new PageResult<>(data, count);
		return JsonData.success(loginData);
	}

	@RequestMapping("/api/check.json")
	@ResponseBody
	public JsonData check(Logininfo login) {
		login.setIsreview("1");
		return loginService.disableLogin(login) > 0 ? JsonData.success() : JsonData.fail("审核失败!");
	}

}
