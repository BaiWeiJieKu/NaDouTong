package com.ndt.service;

import java.util.List;

import com.ndt.entity.Captaininfo;
import com.ndt.util.JsonData;

public interface CaptainService {

	/**
	 * 添加车队队长信息
	 * 
	 * @param captaininfo
	 * @return
	 */
	public JsonData insertCaptain(Captaininfo captaininfo);

	/**
	 * 批量删除车队信息
	 * 
	 * @param ids
	 * @return
	 */
	public JsonData deleteCaptain(Integer ids[]);

	/**
	 * 修改车队信息
	 * 
	 * @param captaininfo
	 * @return
	 */
	public JsonData altCaptain(Captaininfo captaininfo);

	/**
	 * 根据车队名称和队长姓名进行sql拼接查询
	 * 
	 * @param captaininfo
	 * @return
	 */
	public JsonData selectCaptain(Captaininfo captaininfo, Integer page);

	public List<Captaininfo> selectDriversTeam();

}
