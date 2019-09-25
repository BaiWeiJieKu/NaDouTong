package com.ndt.service;

import com.ndt.entity.Driverinfo;
import com.ndt.entity.Mobileregistry;
import com.ndt.entity.Sendermanagementinfo;
import com.ndt.util.JsonData;

public interface Mobileregistryservice {
	
	
	/*
	 * 插入小程序表司机
	 *@param mobileregistry
	 *@return json 0不存在插入1存在
	 **/
	public JsonData insertLogin(Mobileregistry mobileregistry);
	/*
	 * 查询司机是否被派单
	 *@param sendermanagementinfo
	 *@return json 0否1是
	 **/
	public JsonData selectState(Mobileregistry mobileregistry);
	
	/*
	 * 插入运单定位点
	 *@param sendermanagementinfo
	 *@return 
	 **/
	public JsonData insertPoints(Sendermanagementinfo sendermanagementinfo);
//	
//	/*
//	 * 修改运单状态
//	 *@param sendermanagementinfo
//	 *@return 
//	 **/
//	public JsonData updateTrans(Sendermanagementinfo sendermanagementinfo);
//	
	/*
	 * 修改司机状态
	 *@param driverInfo
	 *@return 
	 **/
	public JsonData updateDiver(Driverinfo driver);
	
	/*
	 *查询最新订单
	 *@param orderManagementInfo
	 *@return 
	 **/
	public JsonData selectDing();
	/*
	 *查询司机最新订单
	 *@param orderManagementInfo
	 *@return 
	 **/
	public JsonData selectYun(Mobileregistry mobileregistry);
	
	/*
	 *插入照片
	 *@param orderManagementInfo
	 *@return 
	 **/
	public JsonData updatePCphoto(Mobileregistry mobileregistry);
	

	public JsonData selectRen(Mobileregistry mobileregistry);
	public JsonData updateDriverCard(Mobileregistry mobileregistry);
	public JsonData updateIdcardA(Mobileregistry mobileregistry);
	public JsonData updateIdcardB(Mobileregistry mobileregistry);
	public JsonData updateDriving(Mobileregistry mobileregistry);
	public JsonData updateOperating(Mobileregistry mobileregistry);
	public JsonData updateMo(Integer page);
	public JsonData selectid(Mobileregistry mobileregistry);
	public JsonData selectDirid(Mobileregistry mobileregistry);
	
	//插入定位点(根据运单号)
	//存储数据库图片路径
	//传输司机信息表状态  ，可接单和不可接单
	//查询（根据realname和name匹配司机信息表车牌号，根据车牌号查询运单表里是否有符合运输状态为等待接单的运单，查询所有信息并返回）
	//如果没有  返回最新的订单数据
	//登陆一个
	//上传照片到服务器 并传输给pc端消息，当传输完最后一张照片的时候才发送消息  ，图片根据电话和姓名插入小程序表中
	//条件多表查询
	//看统计
	
}