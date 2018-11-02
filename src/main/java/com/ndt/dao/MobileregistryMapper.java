package com.ndt.dao;

import com.ndt.entity.Mobileregistry;
import com.ndt.entity.MobileregistryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobileregistryMapper {
    long countByExample(MobileregistryExample example);

    int deleteByExample(MobileregistryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mobileregistry record);

    int insertSelective(Mobileregistry record);

    List<Mobileregistry> selectByExample(MobileregistryExample example);

    Mobileregistry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mobileregistry record, @Param("example") MobileregistryExample example);

	int updateByExample(@Param("record") Mobileregistry record, @Param("example") MobileregistryExample example);

    int updateByPrimaryKeySelective(Mobileregistry record);

    int updateByPrimaryKey(Mobileregistry record);
}