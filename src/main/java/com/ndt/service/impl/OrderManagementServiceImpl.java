package com.ndt.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.ndt.dao.GoodsinfoMapper;
import com.ndt.dao.OrdermanagementinfoMapper;
import com.ndt.dao.SendermanagementinfoMapper;
import com.ndt.entity.Goodsinfo;
import com.ndt.entity.GoodsinfoExample;
import com.ndt.entity.Ordermanagementinfo;
import com.ndt.entity.OrdermanagementinfoExample;
import com.ndt.entity.SendermanagementinfoExample;
import com.ndt.service.OrderManagementService;
import com.ndt.util.JsonData;
import com.ndt.util.OrderNumber;
import com.ndt.util.PageResult;

@Service
@Transactional(isolation = Isolation.SERIALIZABLE)
public class OrderManagementServiceImpl implements OrderManagementService {

	@Autowired
	private OrdermanagementinfoMapper ordermanagement;
	@Autowired
	private SendermanagementinfoMapper sendermanagement;

	@Autowired
	private GoodsinfoMapper goodsinfoMapper;

	@Transactional(isolation = Isolation.SERIALIZABLE)
	@Override
	public JsonData insertOrderManagement(Ordermanagementinfo ordermanagementinfo) {
		ordermanagementinfo.setRemain(ordermanagementinfo.getTotaltraffic());// 余量为插入时的总量
		List<Ordermanagementinfo> selectByExample = ordermanagement.selectByExample(new OrdermanagementinfoExample());
		if (!selectByExample.isEmpty()) {
			Ordermanagementinfo selectByMaxId = ordermanagement.selectByMaxId();
			String ordernumber = selectByMaxId.getOrdernumber().substring(selectByMaxId.getOrdernumber().length() - 7);
			ordernumber = OrderNumber.ToString(ordernumber);
			ordermanagementinfo.setOrdernumber(ordernumber);
			//测试
			System.out.println(ordermanagementinfo);
			int insertSelective = ordermanagement.insertSelective(ordermanagementinfo);
			if (insertSelective > 0) {
				return JsonData.success();
			} else {
				return JsonData.fail("添加订单数据失败");
			}
		} else {
			ordermanagementinfo.setOrdernumber(OrderNumber.ToString("0000000"));

			int insertSelective = ordermanagement.insertSelective(ordermanagementinfo);
			if (insertSelective > 0) {
				return JsonData.success();
			} else {
				return JsonData.fail("添加订单数据失败");
			}
		}

	}

	@Override
	public JsonData selectNumberAndGoods() {
		// 查询所有单号
		List<Ordermanagementinfo> selectByExample = ordermanagement.selectByExample(new OrdermanagementinfoExample());
		// 查询所有商品名称
		List<Goodsinfo> selectByExample2 = goodsinfoMapper.selectByExample(new GoodsinfoExample());

		Map<String, Object> map = new HashMap<String, Object>();
//			List<String> number=new ArrayList<String>();//单号集合
//			for(int i=0;i<selectByExample.size();i++)
//			{
//				number.add(selectByExample.get(i).getOrdernumber());
//			}
		map.put("ordernumbers", selectByExample);

//			List<String> goodsNames=new ArrayList<String>();//货源名称集合
//			for(int i=0;i<selectByExample2.size();i++)
//			{
//				goodsNames.add(selectByExample2.get(i).getGoodsname());
//			}
		map.put("goodsnames", selectByExample2);
		return JsonData.success(map);
	}

	@Override
	public JsonData selectAll(String dispatchedparty,String ordernumber, String departure, String destination, String page, String goodsname,
			String start, String end) {
		if (page == null || page.equals(""))
			page = "1";
		int pages = Integer.parseInt(page) - 1;
		List<Map<String, Object>> selectAll = ordermanagement.selectAll(dispatchedparty,ordernumber, departure, destination, goodsname,
				start, end, pages);
		int selectCount = ordermanagement.selectCount(dispatchedparty,ordernumber, departure, destination, goodsname, start, end);
		PageResult<Map<String, Object>> pr = new PageResult<Map<String, Object>>(selectAll, selectCount);
		return JsonData.success(pr);
	}

	@Override
	public JsonData deleteOrderManagement(Integer[] ids) {
		for (int i = 0; i < ids.length; i++)// 删除所有小单
		{
			SendermanagementinfoExample example = new SendermanagementinfoExample();
			example.createCriteria().andOrdernumberEqualTo(ordermanagement.selectByPrimaryKey(ids[i]).getOrdernumber());
			sendermanagement.deleteByExample(example);
		}
		int deleteByArray = ordermanagement.deleteByArray(ids);
		if (deleteByArray > 0) {
			return JsonData.success();
		} else {
			return JsonData.fail("删除订单失败");
		}
	}

	@Override
	public List<Ordermanagementinfo> selectOrderNum() {
		return ordermanagement.selectByExample(new OrdermanagementinfoExample());
	}

	@Override
	public int updeteOrderManagement(Ordermanagementinfo ordermanagementinfo) {

		int updateByPrimaryKeySelective = ordermanagement.updateByPrimaryKeySelective(ordermanagementinfo);
		return updateByPrimaryKeySelective;
	}
}
