package com.ndt.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ndt.entity.Driverinfo;

public interface DriverService {

	List<Driverinfo> GetAllDriver();

	List<Map<String,Object>> getSendDriver();

	List<Map<String ,Object>> GetDrivers(Driverinfo driver,String numberplate, Integer page,Date start,Date end);

	int GetCount(Driverinfo driver,String numberplate,Date start,Date end);

	int InsertDriver(Driverinfo driver);

	int delDriver(Integer[] ids);

	int selectDriverIdCard(Driverinfo driver);

	int updateDriver(Driverinfo driver);

	int updateDriverCar(String carid, String id);

}
