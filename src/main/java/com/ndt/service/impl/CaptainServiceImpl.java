package com.ndt.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndt.dao.CaptaininfoMapper;
import com.ndt.entity.Captaininfo;
import com.ndt.entity.CaptaininfoExample;
import com.ndt.entity.CaptaininfoExample.Criteria;
import com.ndt.service.CaptainService;
import com.ndt.util.JsonData;
import com.ndt.util.PageResult;

@Service
public class CaptainServiceImpl implements CaptainService {

	@Autowired
	private CaptaininfoMapper captainindoMapper;

	@Override
	public JsonData insertCaptain(Captaininfo captaininfo) {

		CaptaininfoExample example = new CaptaininfoExample(0, 15);
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCaptainnameEqualTo(captaininfo.getCaptainname());
		createCriteria.andFleetnameEqualTo(captaininfo.getFleetname());
		List<Captaininfo> selectByExample = captainindoMapper.selectByExample(example);

		if (!selectByExample.isEmpty()) {
			return JsonData.fail("车队信息记录重复");
		} else {
			captaininfo.setCreatetime(new Date());
			int insertSelective = captainindoMapper.insertSelective(captaininfo);
			if (insertSelective > 0) {
				return JsonData.success();

			} else {
				return JsonData.fail("插入车队信息失败");
			}
		}
	}

	@Override
	public JsonData deleteCaptain(Integer[] ids) {

		int deleteByArray = captainindoMapper.deleteByArray(ids);
		if (deleteByArray > 0) {
			return JsonData.success();
		} else {
			return JsonData.fail("删除车队信息失败");
		}
	}

	@Override
	public JsonData altCaptain(Captaininfo captaininfo) {

		int updateByPrimaryKeySelective = captainindoMapper.updateByPrimaryKeySelective(captaininfo);
		if (updateByPrimaryKeySelective > 0) {
			return JsonData.success();
		} else {
			return JsonData.fail("更新车队信息失败");
		}
	}

	@Override
	public JsonData selectCaptain(Captaininfo captaininfo, Integer page) {
		if (page == null || page == 0) {
			page = 1;
		}
		CaptaininfoExample example = new CaptaininfoExample((page - 1) * 15, 15);
		example.setOrderByClause("id desc");
		Criteria createCriteria = example.createCriteria();
		if (captaininfo.getCaptainname() != null && !captaininfo.getCaptainname().equals("")) {
			createCriteria.andCaptainnameEqualTo(captaininfo.getCaptainname());
		}
		if (captaininfo.getFleetname() != null && !captaininfo.getFleetname().equals("")) {
			createCriteria.andFleetnameEqualTo(captaininfo.getFleetname());
		}

		// 查询总条数
		CaptaininfoExample example2 = new CaptaininfoExample();
		Criteria createCriteria2 = example2.createCriteria();
		if (captaininfo.getCaptainname() != null && !captaininfo.getCaptainname().equals("")) {
			createCriteria2.andCaptainnameEqualTo(captaininfo.getCaptainname());
		}
		if (captaininfo.getFleetname() != null && !captaininfo.getFleetname().equals("")) {
			createCriteria2.andFleetnameEqualTo(captaininfo.getFleetname());
		}
		long countByExample = captainindoMapper.countByExample(example2);

		List<Captaininfo> selectByExample = captainindoMapper.selectByExample(example);

		PageResult<Captaininfo> pageResult = new PageResult<Captaininfo>(selectByExample, (int) countByExample);

		return JsonData.success(pageResult);
	}

	@Override
	public List<Captaininfo> selectDriversTeam() {
		// TODO Auto-generated method stub
		CaptaininfoExample example = new CaptaininfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().getAllCriteria();
		return captainindoMapper.selectByExample(example);
	}

}
