package com.ndt.service;

import java.util.List;
import java.util.Map;

import com.ndt.entity.Driverinfo;

public interface DriverService {

	List<Driverinfo> GetAllDriver();

	List<Driverinfo> getSendDriver();

	List<Map<String ,Object>> GetDrivers(Driverinfo driver,String numberplate, Integer page);

	int GetCount(Driverinfo driver,String numberplate);

	int InsertDriver(Driverinfo driver);

	int delDriver(Integer[] ids);

	int selectDriverIdCard(Driverinfo driver);

	int updateDriver(Driverinfo driver);

	int updateDriverCar(String carid, String id);

}
