package com.ndt.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ndt.entity.Sendermanagementinfo;
import com.ndt.entity.SendermanagementinfoExample;

public interface SendermanagementinfoMapper {
	long countByExample(SendermanagementinfoExample example);

	int deleteByExample(SendermanagementinfoExample example);

	int deleteByPrimaryKey(Integer id);

	int deleteByIds(Integer ids[]);

	int insert(Sendermanagementinfo record);

	int insertSelective(Sendermanagementinfo record);

	List<Sendermanagementinfo> selectByExample(SendermanagementinfoExample example);

	List<Map<String, Object>> selectAll(@Param("ordernumber") String ordernumber, @Param("departure") String departure,
			@Param("destination") String destination, @Param("goodsname") String goodsname,
			@Param("start") String start, @Param("end") String end, @Param("pages") int pages);

	int selectCount(@Param("ordernumber") String ordernumber, @Param("departure") String departure,
			@Param("destination") String destination, @Param("goodsname") String goodsname,
			@Param("start") String start, @Param("end") String end);

	List<Map<String, Object>> selectSends(@Param("type") String type, @Param("ordernumber") String ordernumber,
			@Param("singlenumber") String singlenumber, @Param("departure") String departure,
			@Param("destination") String destination, @Param("orderdriver") String orderdriver,
			@Param("numberplate") String numberplate, @Param("oid") String oid, @Param("timetype") String timetype,
			@Param("start") String start, @Param("end") String end, @Param("pages") int pages);

	int selectSendsCount(@Param("type") String type, @Param("ordernumber") String ordernumber,
			@Param("singlenumber") String singlenumber, @Param("departure") String departure,
			@Param("destination") String destination, @Param("orderdriver") String orderdriver,
			@Param("numberplate") String numberplate, @Param("oid") String oid, @Param("timetype") String timetype,
			@Param("start") String start, @Param("end") String end);

	List<Map<String, Object>> getDataStatis(@Param("numberplate") String numberplate,
			@Param("orderdriver") String orderdriver, @Param("start") Date start, @Param("end") Date end,
			@Param("pages") int pages);

	int getDataStatisCount(@Param("numberplate") String numberplate, @Param("orderdriver") String orderdriver,
			@Param("start") Date start, @Param("end") Date end);

	Sendermanagementinfo selectByPrimaryKey(Integer id);

	Sendermanagementinfo selectByMaxId();

	int updateByExampleSelective(@Param("record") Sendermanagementinfo record,
			@Param("example") SendermanagementinfoExample example);

	int updateByExample(@Param("record") Sendermanagementinfo record,
			@Param("example") SendermanagementinfoExample example);

	int updateByPrimaryKeySelective(Sendermanagementinfo record);

	int updateByPrimaryKey(Sendermanagementinfo record);

	int delSends(@Param("id") Integer id);
}