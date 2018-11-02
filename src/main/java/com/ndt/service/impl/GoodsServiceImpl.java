package com.ndt.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndt.dao.GoodsinfoMapper;
import com.ndt.entity.Goodsinfo;
import com.ndt.entity.GoodsinfoExample;
import com.ndt.entity.GoodsinfoExample.Criteria;
import com.ndt.service.GoodsService;
import com.ndt.util.JsonData;
import com.ndt.util.PageResult;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsinfoMapper goodsinfoMapper;

	@Override
	public JsonData insertGoods(Goodsinfo goodsinfo) {

		GoodsinfoExample example = new GoodsinfoExample();
		example.createCriteria().andGoodsnameEqualTo(goodsinfo.getGoodsname());

		List<Goodsinfo> selectByExample = goodsinfoMapper.selectByExample(example);
		if (!selectByExample.isEmpty()) {
			return JsonData.fail("货物信息重复");
		} else {
			goodsinfo.setCreattime(new Date());
			int insertSelective = goodsinfoMapper.insertSelective(goodsinfo);
			if (insertSelective > 0) {
				return JsonData.success();
			} else {
				return JsonData.fail("插入货源信息失败");
			}
		}

	}

	@Override
	public JsonData delGoods(Integer ids[]) {
		int deleteByArray = goodsinfoMapper.deleteByArray(ids);
		if (deleteByArray > 0) {
			return JsonData.success();
		} else {
			return JsonData.fail("删除失败");
		}
	}

	@Override
	public JsonData altGoods(Goodsinfo goodsinfo) {
		int updateByPrimaryKeySelective = goodsinfoMapper.updateByPrimaryKeySelective(goodsinfo);
		if (updateByPrimaryKeySelective > 0) {
			return JsonData.success();
		} else {
			return JsonData.fail("更新失败");
		}
	}

	@Override
	public JsonData selectGoods(Goodsinfo goodsinfo, Integer page) {
		if (page == null || page == 0) {
			page = 1;
		}
		GoodsinfoExample example = new GoodsinfoExample((page - 1) * 15, 15);
		example.setOrderByClause("id desc");
		Criteria createCriteria = example.createCriteria();
		if (goodsinfo.getGoodsname() != null && !goodsinfo.getGoodsname().equals("")) {
			createCriteria.andGoodsnameLike("%" + goodsinfo.getGoodsname() + "%");
		}
		List<Goodsinfo> selectByExample = goodsinfoMapper.selectByExample(example);

		// 查询数据条数
		GoodsinfoExample example2 = new GoodsinfoExample();
		Criteria createCriteria2 = example2.createCriteria();
		if (goodsinfo.getGoodsname() != null && !goodsinfo.getGoodsname().equals("")) {
			createCriteria2.andGoodsnameLike("%" + goodsinfo.getGoodsname() + "%");
		}
		long countByExample = goodsinfoMapper.countByExample(example2);// 总条数
		PageResult<Goodsinfo> pageResult = new PageResult<Goodsinfo>(selectByExample, (int) countByExample);

		return JsonData.success(pageResult);
	}

	@Override
	public JsonData source() {
		GoodsinfoExample example = new GoodsinfoExample();
		List<Goodsinfo> selectByExample = goodsinfoMapper.selectByExample(example);
		return JsonData.success(selectByExample);
	}
}
