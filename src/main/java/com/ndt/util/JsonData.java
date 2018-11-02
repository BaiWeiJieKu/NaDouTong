package com.ndt.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回的 Json 进行包装
 * 
 * @author purple
 *
 */
public class JsonData {

	private boolean ret;

	private String msg;

	private Object data;

	public JsonData(boolean ret) {
		this.ret = ret;
	}

	public static JsonData success(Object obj, String msg) {
		JsonData jd = new JsonData(true);
		jd.data = obj;
		jd.msg = msg;
		return jd;
	}

	public static JsonData success(Object obj) {
		JsonData jd = new JsonData(true);
		jd.data = obj;
		return jd;
	}

	public static JsonData success() {
		return new JsonData(true);
	}

	public static JsonData fail(String msg) {
		JsonData jd = new JsonData(false);
		jd.msg = msg;
		return jd;
	}

	public Map<String, Object> toMap() {
		HashMap<String, Object> result = new HashMap<>();
		result.put("ret", ret);
		result.put("msg", msg);
		result.put("data", data);
		return result;
	}

	public boolean isRet() {
		return ret;
	}

	public void setRet(boolean ret) {
		this.ret = ret;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
