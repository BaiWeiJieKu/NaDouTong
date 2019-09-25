package com.ndt.service;

import java.util.Date;

import com.ndt.entity.Goodsinfo;
import com.ndt.util.JsonData;

public interface GoodsService {

	/**
	 * 添加货源信息
	 * 
	 * @param goodsinfo
	 * @return
	 */
	public JsonData insertGoods(Goodsinfo goodsinfo);

	/**
	 * 批量删除
	 * 
	 * @param ids
	 * @return
	 */
	public JsonData delGoods(Integer ids[]);

	/**
	 * 修改货源信息
	 * 
	 * @param goodsinfo
	 * @return
	 */
	public JsonData altGoods(Goodsinfo goodsinfo);

	/**
	 * 通过货物名称查询数据
	 * 
	 * @param goodsinfo
	 * @return
	 */
	public JsonData selectGoods(Goodsinfo goodsinfo, Integer page,Date startDate,Date endDate);

	public JsonData source();

}
