package com.ndt.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ndt.entity.Driverinfo;
import com.ndt.entity.DriverinfoExample;

public interface DriverinfoMapper {
	long countByExample(DriverinfoExample example);

	int deleteByExample(DriverinfoExample example);

	int deleteByPrimaryKey(Integer id);

	int deleteByIds(Integer[] ids);

	int insert(Driverinfo record);

	int insertSelective(Driverinfo record);

	List<Driverinfo> selectByExample(DriverinfoExample example);

	Driverinfo selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Driverinfo record, @Param("example") DriverinfoExample example);

	int updateByExample(@Param("record") Driverinfo record, @Param("example") DriverinfoExample example);

	int updateByPrimaryKeySelective(Driverinfo record);

	int updateByPrimaryKey(Driverinfo record);
	
	List<Map<String ,Object>> getDriversInDriverInfo(@Param("realname")String realname,@Param("tel")String tel,@Param("idcard")String idcard,
			@Param("cid")Integer cid,@Param("numberplate")String numberplate,@Param("page")int page,@Param("start")Date start,@Param("end")Date end);
	
	Integer getDriversCountInDriverInfo(@Param("realname")String realname,@Param("tel")String tel,@Param("idcard")String idcard,
			@Param("cid")Integer cid,@Param("numberplate")String numberplate,@Param("start")Date start,@Param("end")Date end);
	
	List<Map<String,Object>> selectDriverStatus();
	int deleteCar(@Param("id")Integer id);
}