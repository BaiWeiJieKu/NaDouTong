package com.ndt.dao;

import com.ndt.entity.Logininfo;
import com.ndt.entity.LogininfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogininfoMapper {
	long countByExample(LogininfoExample example);

	int deleteByExample(LogininfoExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Logininfo record);

	int insertSelective(Logininfo record);

	List<Logininfo> selectByExample(LogininfoExample example);

	Logininfo selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Logininfo record, @Param("example") LogininfoExample example);

	int updateByExample(@Param("record") Logininfo record, @Param("example") LogininfoExample example);

	int updateByPrimaryKeySelective(Logininfo record);

	int updateByPrimaryKey(Logininfo record);
}