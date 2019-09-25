package com.ndt.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ndt.dao.CarinfoMapper;
import com.ndt.dao.DriverinfoMapper;
import com.ndt.entity.Carinfo;
import com.ndt.entity.CarinfoExample;
import com.ndt.entity.Driverinfo;
import com.ndt.entity.DriverinfoExample;
import com.ndt.entity.DriverinfoExample.Criteria;
import com.ndt.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	DriverinfoMapper mapper;

	@Autowired
	CarinfoMapper car;

	/**
	 * 下拉框接口
	 */
	@Override
	public List<Driverinfo> GetAllDriver() {
		// TODO Auto-generated method stub
		DriverinfoExample example = new DriverinfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().getAllCriteria();
		return mapper.selectByExample(example);
	}

	/**
	 * 条件查询接口方法
	 */
	@Override
	public List<Map<String, Object>> GetDrivers(Driverinfo driver, String numberplate, Integer page,Date start,Date end) {
		// TODO Auto-generated method stub
		if (page == null || page <= 0) {
			page = 1;
		}
		/*
		 * DriverinfoExample example = new DriverinfoExample((page - 1) * 15, 15);
		 * example.setOrderByClause("id desc"); Criteria createCriteria =
		 * example.createCriteria(); if (driver.getRealname() != null &&
		 * !driver.getRealname().equals("")) { createCriteria.andRealnameLike("%" +
		 * driver.getRealname() + "%"); } if (driver.getTel() != null &&
		 * !driver.getTel().equals("")) { createCriteria.andTelLike("%" +
		 * driver.getTel() + "%"); } if (driver.getIdcard() != null &&
		 * !driver.getIdcard().equals("")) { createCriteria.andIdcardLike("%" +
		 * driver.getIdcard() + "%"); } if (driver.getCid() != null) {
		 * createCriteria.andCidEqualTo(driver.getCid()); }
		 */
		if (driver.getRealname() == null){
			driver.setRealname("");
		}
		if (driver.getTel() == null){
			driver.setTel("");
		}
		if (driver.getIdcard() == null){
			driver.setIdcard("");
		}
		if (numberplate == null){
			numberplate="";
		}
		return mapper.getDriversInDriverInfo(driver.getRealname(), driver.getTel(), driver.getIdcard(), driver.getCid(),
				numberplate, (page - 1) * 15,start,end);
	}

	@Override
	public int GetCount(Driverinfo driver, String numberplate,Date start,Date end) {
		// TODO Auto-generated method stub
		/*
		 * DriverinfoExample example = new DriverinfoExample(); Criteria createCriteria
		 * = example.createCriteria(); if (driver.getRealname() != null &&
		 * driver.getRealname().equals("")) { createCriteria.andRealnameLike("%" +
		 * driver.getRealname() + "%"); } if (driver.getTel() != null &&
		 * driver.getTel().equals("")) { createCriteria.andTelLike("%" + driver.getTel()
		 * + "%"); } if (driver.getIdcard() != null && driver.getIdcard().equals("")) {
		 * createCriteria.andIdcardLike("%" + driver.getIdcard() + "%"); } if
		 * (driver.getCid() != null) { createCriteria.andCidEqualTo(driver.getCid()); }
		 */
		return (int) mapper.getDriversCountInDriverInfo(driver.getRealname(), driver.getTel(), driver.getIdcard(),
				driver.getCid(), numberplate,start,end);
	}

	@Override
	public int InsertDriver(Driverinfo driver) {
		// TODO Auto-generated method stub
		driver.setCreatetime(new Date());
		return mapper.insertSelective(driver);
	}

	@Override
	public int delDriver(Integer[] ids) {
		// TODO Auto-generated method stub
		return mapper.deleteByIds(ids);
	}

	@Override
	public int selectDriverIdCard(Driverinfo driver) {
		// TODO Auto-generated method stub
		DriverinfoExample example = new DriverinfoExample();
		example.createCriteria().andIdcardEqualTo(driver.getIdcard());
		return (int) mapper.countByExample(example);
	}

	@Override
	public int updateDriver(Driverinfo driver) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(driver);
	}

	@Override
	public List<Map<String,Object>> getSendDriver() {
		// TODO Auto-generated method stub
		return mapper.selectDriverStatus();
	}

	@Override
	@Transactional
	public int updateDriverCar(String carid, String id) {
		Carinfo selectByPrimaryKey = car.selectByPrimaryKey(Integer.parseInt(carid));
		if(selectByPrimaryKey.getCid()!=null) {
			Driverinfo selectByPrimaryKey2 = mapper.selectByPrimaryKey(selectByPrimaryKey.getCid());
			mapper.deleteCar(selectByPrimaryKey2.getId());
		}
		
		// TODO Auto-generated method stub
		int count = car.updateDriverCar(Integer.parseInt(id));
		Carinfo carinfo = new Carinfo();
		carinfo.setId(Integer.parseInt(carid));
		carinfo.setCid(Integer.parseInt(id));
		int updateByPrimaryKeySelective = car.updateByPrimaryKeySelective(carinfo);
		if(updateByPrimaryKeySelective>0)
		{
			int updateDriverAndCar = car.updateDriverAndCar();
			return updateDriverAndCar > 0 ? 1 : 0;
		}
		else {
			return 0;
		}
		
		
	}

}
