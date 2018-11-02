package com.ndt.service.impl;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndt.dao.SendermanagementinfoMapper;
import com.ndt.service.DataStatisticsService;
import com.ndt.util.DateFormat;

@Service
public class DataStatisticsServiceImpl implements DataStatisticsService {

	@Autowired
	private SendermanagementinfoMapper send;

	@Override
	public List<Map<String, Object>> getDataStatis(String numberplate, String orderdriver, String time, Integer page)
			throws ParseException {
		// TODO Auto-generated method stub
		Date btime = null, etime = null;
		if (time != null && !time.equals("")) {
			btime = DateFormat.getDateFormat(time);
			Calendar cal = Calendar.getInstance();
			cal.setTime(btime);
			// 获取本月的最大天数
			int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			// 设置创造新日期，这个日期是本月的最后一天
			cal.set(Calendar.DATE, days);
			// 然后打印出来
			etime = cal.getTime();
		}
		return send.getDataStatis(numberplate, orderdriver, btime, etime, (page-1)*15);
	}

	@Override
	public int getDataStatisCount(String numberplate, String orderdriver, String time) throws ParseException {
		// TODO Auto-generated method stub
		Date btime = null, etime = null;
		if (time != null && !time.equals("")) {
			btime = DateFormat.getDateFormat(time);
			Calendar cal = Calendar.getInstance();
			cal.setTime(btime);
			// 获取本月的最大天数
			int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			// 设置创造新日期，这个日期是本月的最后一天
			cal.set(Calendar.DATE, days);
			// 然后打印出来
			etime = cal.getTime();
		}
		return send.getDataStatisCount(numberplate, orderdriver, btime, etime);
	}

}
