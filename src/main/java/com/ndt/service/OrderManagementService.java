package com.ndt.service;

import java.util.List;

import com.ndt.entity.Ordermanagementinfo;
import com.ndt.util.JsonData;

public interface OrderManagementService {

	/**
	 * 添加订单信息
	 * 
	 * @param ordermanagementinfo
	 * @return
	 */
	public JsonData insertOrderManagement(Ordermanagementinfo ordermanagementinfo);

	/**
	 * 拉取所有订单号和货源名称
	 * 
	 * @return
	 */
	public JsonData selectNumberAndGoods();

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
	 * 删除订单
	 * 
	 * @param ids
	 * @return
	 */
	public JsonData deleteOrderManagement(Integer ids[]);

	/**
	 * 获取所有订单号
	 * 
	 * @return
	 */
	public List<Ordermanagementinfo> selectOrderNum();
	/**
	 * 修改信息
	 * @param ordermanagementinfo
	 * @return
	 */
	public int updeteOrderManagement(Ordermanagementinfo ordermanagementinfo);
}
