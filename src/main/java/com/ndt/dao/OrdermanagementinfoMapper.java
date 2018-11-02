package com.ndt.dao;

import com.ndt.entity.Ordermanagementinfo;
import com.ndt.entity.OrdermanagementinfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface OrdermanagementinfoMapper {
	long countByExample(OrdermanagementinfoExample example);

	int deleteByExample(OrdermanagementinfoExample example);

	int deleteByPrimaryKey(Integer id);

	int deleteByArray(Integer ids[]);

	int insert(Ordermanagementinfo record);

	int insertSelective(Ordermanagementinfo record);

	List<Ordermanagementinfo> selectByExample(OrdermanagementinfoExample example);

	Ordermanagementinfo selectByPrimaryKey(Integer id);

	Ordermanagementinfo selectByMaxId();

	List<Map<String, Object>> selectAll(@Param("ordernumber") String ordernumber, @Param("departure") String departure,
			@Param("destination") String destination, @Param("goodsname") String goodsname,
			@Param("start") String start, @Param("end") String end, @Param("pages") int pages);

	int selectCount(@Param("ordernumber") String ordernumber, @Param("departure") String departure,
			@Param("destination") String destination, @Param("goodsname") String goodsname,
			@Param("start") String start, @Param("end") String end);

	int updateByExampleSelective(@Param("record") Ordermanagementinfo record,
			@Param("example") OrdermanagementinfoExample example);

	int updateByExample(@Param("record") Ordermanagementinfo record,
			@Param("example") OrdermanagementinfoExample example);

	int updateByPrimaryKeySelective(Ordermanagementinfo record);

	int updateByPrimaryKey(Ordermanagementinfo record);
}