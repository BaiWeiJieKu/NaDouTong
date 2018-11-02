package com.ndt.util;

import java.util.List;

public class PageResult<T> {

	private List<T> data;

	private int total = 0;

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public PageResult(List<T> data, int total) {
		super();
		this.data = data;
		this.total = total;
	}

	public PageResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PageResult [data=" + data + ", total=" + total + "]";
	}

}
