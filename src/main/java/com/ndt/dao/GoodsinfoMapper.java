package com.ndt.dao;

import com.ndt.entity.Goodsinfo;
import com.ndt.entity.GoodsinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsinfoMapper {
	long countByExample(GoodsinfoExample example);

	int deleteByExample(GoodsinfoExample example);

	int deleteByPrimaryKey(Integer id);

	int deleteByArray(Integer ids[]);

	int insert(Goodsinfo record);

	int insertSelective(Goodsinfo record);

	List<Goodsinfo> selectByExample(GoodsinfoExample example);

	Goodsinfo selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

	int updateByExample(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

	int updateByPrimaryKeySelective(Goodsinfo record);

	int updateByPrimaryKey(Goodsinfo record);
}