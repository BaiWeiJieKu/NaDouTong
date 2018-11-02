package com.ndt.util;

import java.util.Calendar;

public class SingleNumber {

	private static final int LEN = 8; // 单号位数
	private static int num;

	public SingleNumber(int number) {
		this.num = number;
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		SingleNumber.num = num;
	}

	public static String ToString(String value) {
		int v = Integer.parseInt(value);
		SingleNumber t = new SingleNumber(v);
		String result = String.valueOf((++num));// int转string
		int fix = LEN - result.length();// 添加0的位数
		if (fix > 0) {
			for (int i = 0; i < fix; i++) {
				result = "0" + result;
			}
		}
		Calendar a = Calendar.getInstance();
		return "NDTYD" + a.get(Calendar.YEAR) + "Y" + result;
	}
}
