package com.ndt.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ndt.entity.Captaininfo;
import com.ndt.entity.Carinfo;
import com.ndt.entity.Driverinfo;
import com.ndt.entity.Ordermanagementinfo;
import com.ndt.entity.Sendermanagementinfo;
import com.ndt.service.CaptainService;
import com.ndt.service.CarService;
import com.ndt.service.DriverService;
import com.ndt.service.OrderManagementService;
import com.ndt.service.SendermanagementService;
import com.ndt.util.DateFormat;
import com.ndt.util.JsonData;
import com.ndt.util.PageResult;
import com.ndt.util.UpLoadUtil;

@Controller
public class senderManagementController {

	@Autowired
	private SendermanagementService sendermanagement;
	@Autowired
	private OrderManagementService order;
	@Autowired
	private DriverService driver;
	@Autowired
	private CarService car;
	@Autowired
	private CaptainService captain;

	/**
	 * 查询派单
	 * 
	 * @param ordernumber
	 * @param departure
	 * @param destination
	 * @param page
	 * @param goodsname
	 * @param start
	 * @param end
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping(value = { "/api/dispatchManagement.json" })
	@ResponseBody
	public JsonData dispatchManagement(String ordernumbers, String departure, String destination, String page,
			String goodsname, String start, String end) throws ParseException {
		String endTime= DateFormat.getDate(DateFormat.getDateFormat(end));
		//起运地和到达地采用模糊查询
		departure="%"+departure+"%";
		destination="%"+destination+"%";
		String ordernumber=ordernumbers;
		JsonData selectAll = sendermanagement.selectAll(ordernumber, departure, destination, page, goodsname, start,
				endTime);
		return selectAll;
	}

	/**
	 * 派单
	 * 
	 * @param ordernumber
	 * @param departure
	 * @param destination
	 * @param page
	 * @param goodsname
	 * @param start
	 * @param end
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping(value = { "/api/updeteDispatchManagement.json" })
	@ResponseBody
	public JsonData updeteDispatchManagement(@RequestParam("ordermoney") double ordermoney,@RequestParam("numberplate") String numberplate,@RequestParam("oncetraffic") String oncetraffic,@RequestParam("operating") String operating,@RequestParam("ordernumber") String ordernumber,Integer cid,@RequestParam("createtime") String createtime) throws ParseException {
		Date dateFormat = DateFormat.getDateFormat(createtime);
		Sendermanagementinfo sendermanagementinfo=new Sendermanagementinfo();
		sendermanagementinfo.setCreatetime(dateFormat);
		sendermanagementinfo.setOrdermoney(ordermoney);
		sendermanagementinfo.setNumberplate(numberplate);
		sendermanagementinfo.setOperating(operating);
		sendermanagementinfo.setOncetraffic(oncetraffic);
		sendermanagementinfo.setOrdernumber(ordernumber);
		JsonData updeteDispatchManagement = sendermanagement.updeteDispatchManagement(sendermanagementinfo,cid);
		return updeteDispatchManagement;
	}

	/**
	 * 完成派单
	 * @param sendermanagementinfo
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping("/api/finishDispatchManagement.json")
	@ResponseBody
	public JsonData finishDispatchManagement(Sendermanagementinfo sendermanagementinfo, String begintime,String endtime) throws ParseException
	{
		Date startDate = DateFormat.getDateFormat(begintime);
		Date endDate = DateFormat.getDateFormat(endtime);
		sendermanagementinfo.setBtime(startDate);
		sendermanagementinfo.setEtime(endDate);
		JsonData finishDispatchManagement = sendermanagement.finishDispatchManagement(sendermanagementinfo);
		return finishDispatchManagement;
	}


	/**
	 * 拉取所有司机姓名
	 * 
	 * @param sendermanagementinfo
	 * @return
	 */
	@RequestMapping(value = { "/api/getDriver.json" })
	@ResponseBody
	public JsonData getDriver() {
		JsonData driver = sendermanagement.getDriver();
		return driver;
	}

	/**
	 * 拉取对应司机的车牌号
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = { "/api/getNumberPlate.json" })
	@ResponseBody
	public JsonData getNumberPlate(String id) {
		JsonData numberPlate = sendermanagement.getNumberPlate(id);
		return numberPlate;

	}

	/**
	 * 运输管理(小单)
	 * 
	 * @return
	 */
	@RequestMapping(value = { "/api/transportManagement.json" })
	@ResponseBody
	public JsonData transportManagement(Integer page, String ordernumber, String singlenumber, String start, String end,
			String departure, String destination, String realname, String numberplate, String fleetname,
			String timetype) {
		List<Map<String, Object>> list = sendermanagement.selectTransportManagement(page, ordernumber, singlenumber,
				start, end, departure, destination,numberplate, realname, fleetname, timetype);
		List<Map<String, Object>> newLis = new ArrayList<Map<String,Object>>();
		for (Map<String, Object> map : list) {
			if(!map.containsKey("etime")) {
				map.put("etime", "");
			}
			if(!map.containsKey("btime")){
				map.put("btime", "");
			}
			newLis.add(map);
		}
		int count = sendermanagement.selectTransportManagementCount(ordernumber, singlenumber, start, end, departure,
				destination, numberplate, realname, fleetname, timetype);
		PageResult<Map<String, Object>> pageResult = new PageResult<>(newLis, count);
		return JsonData.success(pageResult);
	}


	/**
	 * 运输管理接口
	 * 
	 * @param page
	 * @param send
	 * @return
	 */
	@RequestMapping(value = { "/api/transportReceipt.json" })
	@ResponseBody
	public JsonData transportReceipt() {
		Map<String, Object> map = new HashMap<>();
		// 获取所有订单号
		List<Ordermanagementinfo> selectOrderNums = order.selectOrderNum();
		List<String> selectOrderNum = new ArrayList<>();
		for (Ordermanagementinfo ordermanagementinfo : selectOrderNums) {
			selectOrderNum.add(ordermanagementinfo.getOrdernumber());
		}
		map.put("ordernumbers", selectOrderNum);
		// 获取所有的运单号
		List<Sendermanagementinfo> singlenumbers = sendermanagement.selectSendNum();
		List<String> singlenumber = new ArrayList<>();
		for (Sendermanagementinfo i : singlenumbers) {
			singlenumber.add(i.getSinglenumber());
		}
		map.put("singlenumbers", singlenumber);
		// 获取司机自动填充
		List<Driverinfo> realname = driver.GetAllDriver();
		map.put("realnames", realname);
		// 获取车牌号列表 numberplate
		List<Carinfo> numberplates = car.selectCarNums();
		List<String> numberplate = new ArrayList<>();
		for (Carinfo i : numberplates) {
			numberplate.add(i.getNumberplate());
		}
		map.put("numberplates", numberplate);
		// 所属车队
		List<Captaininfo> fleetname = captain.selectDriversTeam();
		map.put("fleetnames", fleetname);
		return JsonData.success(map);
	}

	/**
	 * 回单数据列表
	 * 
	 * @param page
	 * @param ordernumber
	 * @param singlenumber
	 * @param start
	 * @param end
	 * @param departure
	 * @param destination
	 * @param realname
	 * @param numberplate
	 * @param fleetname
	 * @param timetype
	 * @return
	 */
	@RequestMapping("/api/receipt.json")
	@ResponseBody
	public JsonData receipt(Integer page, String ordernumber, String singlenumber, String start, String end,
			String departure, String destination, String realname, String numberplate, String fleetname,
			String timetype) {
		List<Map<String, Object>> list = sendermanagement.selectReceipt(page, ordernumber, singlenumber, start, end,
				departure, destination, numberplate, realname, fleetname, timetype);
		int count = sendermanagement.selectReceiptCount(ordernumber, singlenumber, start, end, departure, destination,
				numberplate,realname, fleetname, timetype);
		PageResult<Map<String, Object>> pageResult = new PageResult<>(list, count);
		return JsonData.success(pageResult);
	}


	/**
	 * 删除小单号
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(value= {"/api/deleteTransportManagement.json","/api/deleteReceipt.json"})
	@ResponseBody
	public JsonData delSends(Integer[] ids) {
		return sendermanagement.delSends(ids) > 0 ? JsonData.success() : JsonData.fail("删除失败");
	}
	
	@RequestMapping("/uploadTransport")
	@ResponseBody
	public JsonData uploadOperatingLicencePath(MultipartFile file, Sendermanagementinfo send, HttpServletRequest request)
			throws IllegalStateException, IOException {
		// 保存图片到
		String filePath = UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		send.setTransport(filePath);
		// 修改
		int count = sendermanagement.updateImg(send);
		return count > 0 ? JsonData.success() : JsonData.fail("修改失败!");
	}
}
