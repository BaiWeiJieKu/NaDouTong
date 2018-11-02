package com.ndt.dao;

import com.ndt.entity.Carinfo;
import com.ndt.entity.CarinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarinfoMapper {
	long countByExample(CarinfoExample example);

	int deleteByExample(CarinfoExample example);

	int deleteByPrimaryKey(Integer id);

	int deleteByIds(Integer[] ids);

	int insert(Carinfo record);

	int insertSelective(Carinfo record);

	List<Carinfo> selectByExample(CarinfoExample example);

	Carinfo selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Carinfo record, @Param("example") CarinfoExample example);

	int updateByExample(@Param("record") Carinfo record, @Param("example") CarinfoExample example);

	int updateByPrimaryKeySelective(Carinfo record);

	int updateByPrimaryKey(Carinfo record);
	
	int updateDriverCar(@Param("id")Integer id);
}