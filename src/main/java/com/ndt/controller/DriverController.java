package com.ndt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ndt.entity.Driverinfo;
import com.ndt.service.DriverService;
import com.ndt.util.JsonData;
import com.ndt.util.PageResult;
import com.ndt.util.UpLoadUtil;

@Controller
public class DriverController {

	@Autowired
	private DriverService driverService;
	/**
	 * 更换车辆
	 * @param carid 车id
	 * @param id 人id
	 * @return
	 */
	@RequestMapping("/api/updateDriverCar.json")
	@ResponseBody
	public JsonData updateDriverCar(String carid , String id) {
		int i = driverService.updateDriverCar(carid ,id);
		return i>0?JsonData.success() : JsonData.fail("更换失败");
	}
	
	/**
	 * 车源信息表中司机下拉框数据
	 * 
	 * @return
	 */
	@RequestMapping("/api/optionsDriverManagement.json")
	@ResponseBody
	public JsonData getAllDriver() {
		List<Driverinfo> driver = driverService.GetAllDriver();
		return JsonData.success(driver);
	}

	/**
	 * 派单司机列表
	 * 
	 * @return
	 */
	@RequestMapping("/api/optionsDriverManagementStatus.json")
	@ResponseBody
	public JsonData getSendDriver() {
		List<Driverinfo> driver = driverService.getSendDriver();
		return JsonData.success(driver);
	}

	/**
	 * 
	 * @param driver 查询条件
	 * @param page   当前页
	 * @return
	 */
	@RequestMapping("/api/driverManagement.json")
	@ResponseBody
	public JsonData getDrivers(Driverinfo driver,String numberplate, Integer page) {
		List<Map<String,Object>> list = driverService.GetDrivers(driver,numberplate, page);
		int count = driverService.GetCount(driver,numberplate);
		PageResult<Map<String ,Object>> pagedata = new PageResult<>(list, count);
		return JsonData.success(pagedata);
	}

	/**
	 * 添加司机信息
	 * 
	 * @param driver
	 * @return
	 */
	@RequestMapping("/api/insertDriverManagement.json")
	@ResponseBody
	public JsonData insertDriver(Driverinfo driver) {
		if (driverService.selectDriverIdCard(driver) > 0) {
			return JsonData.fail("身份证号已存在!");
		}
		int count = driverService.InsertDriver(driver);
		return count > 0 ? JsonData.success() : JsonData.fail("插入失败!");
	}

	/**
	 * 删除接口
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("/api/deleteDriverManagement.json")
	@ResponseBody
	public JsonData delDriver(Integer[] ids) {
		int count = driverService.delDriver(ids);
		return count > 0 ? JsonData.success() : JsonData.fail("删除失败!");
	}

	/**
	 * 更新接口
	 * 
	 * @param driver
	 * @return
	 */
	@RequestMapping("/api/updeteDriverManagement.json")
	@ResponseBody
	public JsonData updateDriver(Driverinfo driver) {
		int count = driverService.updateDriver(driver);
		return count > 0 ? JsonData.success() : JsonData.fail("更新失败!");
	}

	/**
	 * 上传人车照片
	 * 
	 * @param file
	 * @param driver
	 * @param request
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping("/uploadPcphoto")
	@ResponseBody
	public JsonData uploadPcphoto(MultipartFile file, Driverinfo driver, HttpServletRequest request)
			throws IllegalStateException, IOException {
		String filePath = UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		driver.setPcphoto(filePath);
		// 修改
		int count = driverService.updateDriver(driver);
		return count > 0 ? JsonData.success() : JsonData.fail("修改失败!");
	}

	/**
	 * 上传正面身份证
	 * 
	 * @param file
	 * @param driver
	 * @param request
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping("/uploadIdcardA")
	@ResponseBody
	public JsonData uplaodIdcardA(MultipartFile file, Driverinfo driver, HttpServletRequest request)
			throws IllegalStateException, IOException {
		String filePath = UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		driver.setIdcarda(filePath);
		// 修改
		int count = driverService.updateDriver(driver);
		return count > 0 ? JsonData.success() : JsonData.fail("修改失败!");
	}

	/**
	 * 上传背面身份证
	 * 
	 * @param file
	 * @param driver
	 * @param request
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping("/uploadIdcardB")
	@ResponseBody
	public JsonData uplaodIdcardB(MultipartFile file, Driverinfo driver, HttpServletRequest request)
			throws IllegalStateException, IOException {
		String filePath = UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		driver.setIdcardb(filePath);
		// 修改
		int count = driverService.updateDriver(driver);
		return count > 0 ? JsonData.success() : JsonData.fail("修改失败!");
	}

	@RequestMapping("/uploadDriverCard")
	@ResponseBody
	public JsonData uploadDriverCard(MultipartFile file, Driverinfo driver, HttpServletRequest request)
			throws IllegalStateException, IOException {
		String filePath = UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		driver.setDrivercard(filePath);
		// 修改
		int count = driverService.updateDriver(driver);
		return count > 0 ? JsonData.success() : JsonData.fail("修改失败!");
	}
}
