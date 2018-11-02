package com.ndt.util;

import java.util.Calendar;

public class OrderNumber {

	private static final int LEN = 7; // 单号位数
	private static int num;

	public OrderNumber(int number) {
		this.num = number;
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		OrderNumber.num = num;
	}

	public static String ToString(String value) {
		int v = Integer.parseInt(value);
		OrderNumber t = new OrderNumber(v);
		String result = String.valueOf((++num));// int转string
		int fix = LEN - result.length();// 添加0的位数
		if (fix > 0) {
			for (int i = 0; i < fix; i++) {
				result = "0" + result;
			}
		}
		Calendar a = Calendar.getInstance();
		return "NDT" + a.get(Calendar.YEAR) + "D" + result;
	}
}
