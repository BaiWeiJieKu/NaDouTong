package com.ndt.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormat {
	public static Date getDateFormat(String create_time) throws ParseException {
		Date d = null;
		String format = "";
		if (create_time != null && create_time != "NULL" && create_time != "") {
			if (isDate(create_time)) {
				format = create_time;
			} else {
				// 转换日期格式(将Mon Jun 18 2018 00:00:00 GMT+0800 (中国标准时间) 转换成yyyy-MM-dd)
				create_time = create_time.replace("Z", " UTC");
				SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
				d = sdf1.parse(create_time);// Mon Mar 06 00:00:00 CST 2017
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				format = sdf.format(d);// 2017-03-06
			}
		}
		return d;
	}

	 static boolean isDate(String date) {
		/**
		 * 判断日期格式和范围
		 */
		String rexp = "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";
		Pattern pat = Pattern.compile(rexp);
		Matcher mat = pat.matcher(date);
		boolean dateType = mat.matches();
		return dateType;
	}
	public static String getDate(Date date)
	{
		Calendar c = Calendar.getInstance();
		if(date!=null){
	        c.set(Calendar.HOUR_OF_DAY, 23);
	        c.set(Calendar.MINUTE, 59);
	        c.set(Calendar.SECOND, 59);
	        c.set(Calendar.MILLISECOND, 999);
	        c.set(Calendar.YEAR,date.getYear());
	        c.set(Calendar.MONTH,date.getMonth());
	        c.set(Calendar.DAY_OF_MONTH,date.getDay());
	        }
		return c.getTime().toString();
	}
}
