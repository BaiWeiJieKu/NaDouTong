package com.ndt.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface DataStatisticsService {

	/**
	 * 数据统计
	 * 
	 * @param numberplate
	 * @param orderdriver
	 * @param time
	 * @param page
	 * @return
	 * @throws ParseException
	 */
	List<Map<String, Object>> getDataStatis(String numberplate, String orderdriver, String time, Integer page)
			throws ParseException;

	/**
	 * 数据统计总条数
	 * 
	 * @param numberplate
	 * @param orderdriver
	 * @param time
	 * @return
	 * @throws ParseException
	 */
	int getDataStatisCount(String numberplate, String orderdriver, String time) throws ParseException;

}
