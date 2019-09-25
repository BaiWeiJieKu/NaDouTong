package com.ndt.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ndt.entity.Ordermanagementinfo;
import com.ndt.service.OrderManagementService;
import com.ndt.util.DateFormat;
import com.ndt.util.JsonData;
import com.ndt.util.UpLoadUtil;

@Controller
public class OrderManagementController {

	@Autowired
	private OrderManagementService orderManagement;

	/**
	 * 插入订单信息
	 * 
	 * @param ordermanagementinfo
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping("/api/insertOrderManagement.json")
	@ResponseBody
	public JsonData insertOrderManagement(Ordermanagementinfo ordermanagementinfo, String time) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-dd-mm hh:mm:ss");
		String format = sdf.format(new Date());
		ordermanagementinfo.setMark(format);
		ordermanagementinfo.setOrdercreatetime(DateFormat.getDateFormat(time));
		JsonData insertOrderManagement = orderManagement.insertOrderManagement(ordermanagementinfo);
		return insertOrderManagement;

	}

	/**
	 * 多条件查询
	 * 
	 * @param ordermanagementinfo
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping(value = { "/api/orderManagement.json" })
	@ResponseBody
	public JsonData orderManagement(String dispatchedparty,String ordernumber, String departure, String destination, String page, String gid,
			String start, String end) throws ParseException {
		String endTime = DateFormat.getDate(DateFormat.getDateFormat(end));
		String goodsname = gid;
		// 起运地和到达地采用模糊查询
		departure = "%" + departure + "%";
		destination = "%" + destination + "%";
		JsonData selectAll = orderManagement.selectAll(dispatchedparty,ordernumber, departure, destination, page, goodsname, start,
				endTime);
		return selectAll;

	}

	/**
	 * 查询所有订单号和货源名称
	 * 
	 * @return
	 */
	@RequestMapping("/api/orderDispatch.json")
	@ResponseBody
	public JsonData orderDispatch() {

		JsonData selectNumberAndGoods = orderManagement.selectNumberAndGoods();
		return selectNumberAndGoods;

	}

	/**
	 * 批量删除订单
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("/api/deleteOrderManagement.json")
	@ResponseBody
	public JsonData deleteOrderManagement(Integer ids[]) {
		JsonData deleteOrderManagement = orderManagement.deleteOrderManagement(ids);
		return deleteOrderManagement;
	}

	/**
	 * 上传图片
	 * 
	 * @param file
	 * @param order
	 * @param request
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping("/uploadOrderManagement")
	@ResponseBody
	public JsonData uploadOperatingLicencePath(MultipartFile file, Ordermanagementinfo order,
			HttpServletRequest request) throws IllegalStateException, IOException {
		// 保存图片到
		String filePath = UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		order.setContractrote(filePath);
		// 修改
		int count = orderManagement.updeteOrderManagement(order);
		return count > 0 ? JsonData.success() : JsonData.fail("修改失败!");
	}

	/**
	 * 修改大订单
	 * 
	 * @param ordermanagementinfo
	 * @return
	 */
	@RequestMapping("/api/updeteOrderManagement.json")
	@ResponseBody
	public JsonData updeteOrderManagement(Ordermanagementinfo ordermanagementinfo) {
		int updeteOrderManagement = orderManagement.updeteOrderManagement(ordermanagementinfo);
		return updeteOrderManagement > 0 ? JsonData.success() : JsonData.fail("更新失败!");
	}
}
