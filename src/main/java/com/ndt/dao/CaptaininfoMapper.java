package com.ndt.dao;

import com.ndt.entity.Captaininfo;
import com.ndt.entity.CaptaininfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaptaininfoMapper {
	long countByExample(CaptaininfoExample example);

	int deleteByExample(CaptaininfoExample example);

	int deleteByPrimaryKey(Integer id);

	int deleteByArray(Integer ids[]);

	int insert(Captaininfo record);

	int insertSelective(Captaininfo record);

	List<Captaininfo> selectByExample(CaptaininfoExample example);

	Captaininfo selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Captaininfo record, @Param("example") CaptaininfoExample example);

	int updateByExample(@Param("record") Captaininfo record, @Param("example") CaptaininfoExample example);

	int updateByPrimaryKeySelective(Captaininfo record);

	int updateByPrimaryKey(Captaininfo record);
}