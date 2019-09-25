package com.ndt.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.ndt.entity.Carinfo;
import com.ndt.service.CarService;
import com.ndt.util.DateFormat;
import com.ndt.util.JsonData;
import com.ndt.util.PageResult;
import com.ndt.util.UpLoadUtil;

@Controller
public class CarController {

	@Autowired
	private CarService carService;

	/**
	 * 插入车源信息
	 * 
	 * @param car
	 * @return
	 */
	@RequestMapping("/api/insertOptionsInformation.json")
	public @ResponseBody JsonData insertCar(Carinfo car) {
		List<Carinfo> selectCarNum = carService.selectCarNum(car);
		List<Carinfo> selectRoad = carService.selectRoad(car);
		if (selectCarNum.size() > 0) {
			return JsonData.fail("车牌号已存在!");
		}
		if (selectRoad.size() > 0) {
			return JsonData.fail("道路运输证号已存在！");
		}
		if (carService.insertCar(car) > 0) {
			return JsonData.success();
		}
		return JsonData.fail("插入失败!");
	}

	/**
	 * 根据ids删除多个id数据 http://localhost:8080/api/deleteOptionsInformation?ids=6,7
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("/api/deleteOptionsInformation.json")
	public @ResponseBody JsonData delCar(Integer[] ids) {
		if (carService.delCars(ids) > 0) {
			return JsonData.success();
		}
		return JsonData.fail("删除失败!");
	}

	/**
	 * 根据id修改数据
	 * 
	 * @param car
	 * @return
	 */
	@RequestMapping("/api/updeteOptionsInformation.json")
	public @ResponseBody JsonData updateCar(Carinfo car) {
		/*SELECT COUNT(*) from carinfo WHERE id!=130031 AND(numberplate='晋BG8595' OR roadtransportcertificate='14022606620')有数据就不修改，无数据就修改*/
		List<Carinfo> selectCarNum = carService.selectCarNum(car);
		//车牌号修改与已存在的车牌号重复，车牌号未修改
		if(selectCarNum.size()>0)
		{
			//车牌号和id与原数据匹配
			if(selectCarNum.get(0).getId()==car.getId() && selectCarNum.get(0).getNumberplate().equals(car.getNumberplate()))
			{
				//道路运输证号和id与原数据匹配
				if(selectCarNum.get(0).getId()==car.getId() && selectCarNum.get(0).getRoadtransportcertificate().equals(car.getRoadtransportcertificate()))
				{
					if (carService.updateCar(car) > 0) {
						return JsonData.success();
					}
					return JsonData.fail("修改失败!");
				}
				else{
					//道路证号修改后是否与已存在的道路证号重复
					List<Carinfo> selectRoad = carService.selectRoad(car);
					if(selectRoad.size()>0)
					{
						return JsonData.fail("道路运输证号已存在!");
					}
					else
					{
						if (carService.updateCar(car) > 0) {
							return JsonData.success();
						}
						return JsonData.fail("修改失败!");
					}
				}
			}
			else
			{
				return JsonData.fail("车牌号重复!");
			}
		}
		else
		{
			//车牌号可以更新，查看道路运输证号是否可以更新
			List<Carinfo> selectRoad = carService.selectRoad(car);
			if(selectRoad.size()>0)
			{
				return JsonData.fail("道路运输证号已存在");
			}
			else
			{
				if (carService.updateCar(car) > 0) {
					return JsonData.success();
				}
				return JsonData.fail("修改失败!");
			}
		}
		
	}

	/**
	 * 根据条件查询数据
	 * 
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping("/api/optionsInformation.json")
	public @ResponseBody JsonData selectCars(Integer page, Carinfo car, String start, String end)
			throws ParseException {
		List<Carinfo> list = carService.selectCars(page, car, DateFormat.getDateFormat(start),
				DateFormat.getDateFormat(end));
		int count = carService.selectCount(car);
		PageResult<Carinfo> pagedata = new PageResult<>(list, count);
		return JsonData.success(pagedata);
	}

	/**
	 * 上传图片
	 * 
	 * @param file
	 * @param car
	 * @param request
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping("/uploadBusinessLicense")
	@ResponseBody
	public JsonData uploadBusinessLicense(MultipartFile file, Carinfo car, HttpServletRequest request)
			throws IllegalStateException, IOException {
		String filePath = UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		car.setBusinesslicense(filePath);
		// 修改
		int count = carService.updateCar(car);
		return count > 0 ? JsonData.success() : JsonData.fail("修改失败!");
	}

	/**
	 * 上传图片
	 * 
	 * @param file
	 * @param car
	 * @param request
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping("/uploadDrivingLicensePath")
	@ResponseBody
	public JsonData uploadDrivingLicensePath(MultipartFile file, Carinfo car, HttpServletRequest request)
			throws IllegalStateException, IOException {
		// 保存图片到
		String filePath = UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		car.setDrivinglicensepath(filePath);
		// 修改
		int count = carService.updateCar(car);
		return count > 0 ? JsonData.success() : JsonData.fail("修改失败!");
	}

	/**
	 * 上传图片
	 * 
	 * @param file
	 * @param car
	 * @param request
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping("/uploadOperatingLicencePath")
	@ResponseBody
	public JsonData uploadOperatingLicencePath(MultipartFile file, Carinfo car, HttpServletRequest request)
			throws IllegalStateException, IOException {
		// 保存图片到
		String filePath = UpLoadUtil.saveFile(file, request.getSession().getServletContext().getRealPath("/"));
		car.setOperatinglicencepath(filePath);
		// 修改
		int count = carService.updateCar(car);
		return count > 0 ? JsonData.success() : JsonData.fail("修改失败!");
	}
	
	/**
	 * 获取所有车辆
	 * @return
	 */
	@RequestMapping("/api/getAllCars.json")
	@ResponseBody
	public JsonData getAllCars() {
		return JsonData.success(carService.getAllCars());
	}
}
