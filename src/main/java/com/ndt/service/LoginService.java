package com.ndt.service;

import java.util.List;

import com.ndt.entity.Logininfo;
import com.ndt.util.JsonData;

public interface LoginService {
	/**
	 * 用户注册
	 * 
	 * @param logininfo
	 */
	public JsonData insertLogin(Logininfo logininfo);

	/**
	 * 是否可以登录
	 * 
	 * @param logininfo
	 * @return
	 */
	public int disableLogin(Logininfo logininfo);

	/**
	 * 审核状态
	 * 
	 * @param logininfo
	 * @return
	 */
	public JsonData isReview(Logininfo logininfo);

	/**
	 * 登陆
	 * 
	 * @param login
	 * @return
	 */
	public List<Logininfo> Login(Logininfo login);

	List<Logininfo> isLogin(Logininfo login);

	List<Logininfo> reviewInformation(Integer page);

	public int reviewInformationCount();

}
