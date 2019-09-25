package com.ndt.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ndt.entity.Carinfo;

public interface CarService {

	int insertCar(Carinfo car);

	int delCars(Integer[] ids);

	int updateCar(Carinfo car);

	List<Carinfo> selectCars(Integer page, Carinfo car, Date start, Date end);

	int selectCount(Carinfo car);

	List<Carinfo> selectCarNum(Carinfo car);

	List<Carinfo> selectCarNums();

	List<Map<String, Object>> getAllCars();

	List<Carinfo> selectRoad(Carinfo car);

}
