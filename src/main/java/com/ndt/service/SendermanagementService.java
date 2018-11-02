package com.ndt.service;

import java.util.List;
import java.util.Map;

import com.ndt.entity.Sendermanagementinfo;
import com.ndt.util.JsonData;

public interface SendermanagementService {

	/**
	 * 多条件查询，SQL拼接
	 * 
	 * @param ordermanagementinfo
	 * @param page
	 * @param goodsname
	 * @param start
	 * @param end
	 * @return
	 */
	public JsonData selectAll(String ordernumber, String departure, String destination, String page, String goodsname,
			String start, String end);

	/**
	 * 派单
	 * 
	 * @param ordernumber
	 * @param realname
	 * @param numberplate
	 * @param oncetraffic
	 * @param operating
	 * @param mark
	 * @param oid
	 * @return
	 */
	public JsonData updeteDispatchManagement(Sendermanagementinfo sendermanagementinfo,Integer cid);


	/**
	 * 完成派单
	 * @param sendermanagementinfo
	 * @return
	 */
	public JsonData finishDispatchManagement(Sendermanagementinfo sendermanagementinfo);

	/**
	 * 拉取所有司机姓名
	 * 
	 * @param sendermanagementinfo
	 * @return
	 */
	public JsonData getDriver();

	/**
	 * 拉取司机对应的车牌号
	 * 
	 * @param id
	 * @return
	 */
	public JsonData getNumberPlate(String id);

	/**
	 * 查询运输管理数据
	 * 
	 * @param page
	 * @param ordernumber
	 * @param singlenumber
	 * @param start
	 * @param end
	 * @param departure
	 * @param destination
	 * @param realname
	 * @param numberplate
	 * @param fleetname
	 * @param timetype
	 * @return
	 */
	public List<Map<String, Object>> selectTransportManagement(Integer page, String ordernumber, String singlenumber,
			String start, String end, String departure, String destination, String realname, String numberplate,
			String fleetname, String timetype);

	/**
	 * 查询符合条件的数据条数
	 * 
	 * @param ordernumber
	 * @param singlenumber
	 * @param start
	 * @param end
	 * @param departure
	 * @param destination
	 * @param realname
	 * @param numberplate
	 * @param fleetname
	 * @param timetype
	 * @return
	 */
	public int selectTransportManagementCount(String ordernumber, String singlenumber, String start, String end,
			String departure, String destination, String realname, String numberplate, String fleetname,
			String timetype);

	/**
	 * 查询运单号
	 * 
	 * @return
	 */
	public List<Sendermanagementinfo> selectSendNum();

	/**
	 * 回单管理查询
	 * 
	 * @param page
	 * @param ordernumber
	 * @param singlenumber
	 * @param start
	 * @param end
	 * @param departure
	 * @param destination
	 * @param realname
	 * @param numberplate
	 * @param fleetname
	 * @param timetype
	 * @return
	 */
	public List<Map<String, Object>> selectReceipt(Integer page, String ordernumber, String singlenumber, String start,
			String end, String departure, String destination, String realname, String numberplate, String fleetname,
			String timetype);

	/**
	 * 回单管理查询数据条数
	 * 
	 * @param ordernumber
	 * @param singlenumber
	 * @param start
	 * @param end
	 * @param departure
	 * @param destination
	 * @param realname
	 * @param numberplate
	 * @param fleetname
	 * @param timetype
	 * @return
	 */
	public int selectReceiptCount(String ordernumber, String singlenumber, String start, String end, String departure,
			String destination, String realname, String numberplate, String fleetname, String timetype);

	public int delSends(Integer[] ids);

	public int updateImg(Sendermanagementinfo send);

}
