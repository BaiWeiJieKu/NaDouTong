package com.ndt.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.ndt.dao.CarinfoMapper;
import com.ndt.dao.DriverinfoMapper;
import com.ndt.dao.GoodsinfoMapper;
import com.ndt.dao.OrdermanagementinfoMapper;
import com.ndt.dao.SendermanagementinfoMapper;
import com.ndt.entity.Carinfo;
import com.ndt.entity.CarinfoExample;
import com.ndt.entity.Driverinfo;
import com.ndt.entity.DriverinfoExample;
import com.ndt.entity.Goodsinfo;
import com.ndt.entity.GoodsinfoExample;
import com.ndt.entity.Ordermanagementinfo;
import com.ndt.entity.OrdermanagementinfoExample;
import com.ndt.entity.Sendermanagementinfo;
import com.ndt.entity.SendermanagementinfoExample;
import com.ndt.service.SendermanagementService;
import com.ndt.util.JsonData;
import com.ndt.util.PageResult;
import com.ndt.util.SingleNumber;

@Service
public class SenderManagementServiceImpl implements SendermanagementService {

	@Autowired
	private SendermanagementinfoMapper senderManagement;
	@Autowired
	private OrdermanagementinfoMapper ordermanagement;
	@Autowired
	private DriverinfoMapper driverinfoMapper;
	@Autowired
	private CarinfoMapper carinfoMapper;
	@Autowired
	private GoodsinfoMapper goodsinfoMapper;

	@Override
	public JsonData selectAll(String ordernumber, String departure, String destination, String page, String goodsname,
			String start, String end) {
		if (page == null || page.equals(""))
			page = "1";
		int pages = Integer.parseInt(page) - 1;
		if(null!=goodsname &&""!=goodsname)
		{
			//根据goosname查到货物id
			GoodsinfoExample example=new GoodsinfoExample();
			example.createCriteria().equals(goodsname);
			List<Goodsinfo> selectByExample = goodsinfoMapper.selectByExample(example);
			goodsname=String.valueOf(selectByExample.get(0).getId());
		}
		
		List<Map<String, Object>> selectAll = senderManagement.selectAll(ordernumber, departure, destination, goodsname,
				start, end, pages);

		int selectCount = senderManagement.selectCount(ordernumber, departure, destination, goodsname, start, end);

		PageResult<Map<String, Object>> pr = new PageResult<Map<String, Object>>(selectAll, selectCount);
		return JsonData.success(pr);
	}

	/**
	 * 派单
	 */
	@Transactional(isolation = Isolation.SERIALIZABLE)
	@Override
	public JsonData updeteDispatchManagement(Sendermanagementinfo sendermanagementinfo,Integer cid) {
		sendermanagementinfo.setOid(cid);
		// 查询大单余量
		OrdermanagementinfoExample order = new OrdermanagementinfoExample();
		order.createCriteria().andOrdernumberEqualTo(sendermanagementinfo.getOrdernumber());
		List<Ordermanagementinfo> selectByExample2 = ordermanagement.selectByExample(order);
		String remain2 = selectByExample2.get(0).getRemain();
		if (Float.parseFloat(remain2) >= Float.parseFloat(sendermanagementinfo.getOncetraffic()))// 如果大单有剩余量且大于这次运输量，允许派单
		{
			List<Sendermanagementinfo> selectByExample = senderManagement
					.selectByExample(new SendermanagementinfoExample());
			// 根据司机id查询车牌号
			CarinfoExample example = new CarinfoExample();
			example.createCriteria().andCidEqualTo(Integer.parseInt(sendermanagementinfo.getNumberplate()));
			sendermanagementinfo.setOrderdriver(carinfoMapper.selectByExample(example).get(0).getNumberplate());// 车牌号
			sendermanagementinfo.setWaybillstate("接单中");
			if (!selectByExample.isEmpty()) {
				Sendermanagementinfo selectByMaxId = senderManagement.selectByMaxId();
				String substring = selectByMaxId.getSinglenumber()
						.substring(selectByMaxId.getSinglenumber().length() - 8);
				sendermanagementinfo.setSinglenumber(SingleNumber.ToString(substring));// 添加派单号
			} else {
				sendermanagementinfo.setSinglenumber(SingleNumber.ToString("00000000"));// 添加派单号
			}
			int insertSelective = senderManagement.insertSelective(sendermanagementinfo);
			if (insertSelective > 0) {
				Driverinfo record = new Driverinfo();
				record.setId(Integer.parseInt(sendermanagementinfo.getNumberplate()));// 修改司机接单状态
				record.setState("0");
				int updateByPrimaryKey = driverinfoMapper.updateByPrimaryKeySelective(record);
				String oncetraffic = sendermanagementinfo.getOncetraffic();// 小单一次运量
				Double result = (Double.parseDouble(remain2)) - (Double.parseDouble(oncetraffic));// 剩余总量=大单余量减去一次运量
				// 新建大单对象，修改总量
				Ordermanagementinfo ordermanagementinfo = new Ordermanagementinfo();
				ordermanagementinfo.setId(selectByExample2.get(0).getId());
				ordermanagementinfo.setRemain(result.toString());
				int updateByPrimaryKeySelective = ordermanagement.updateByPrimaryKeySelective(ordermanagementinfo);
				if (updateByPrimaryKeySelective > 0 && updateByPrimaryKey > 0) {
					return JsonData.success();
				} else {
					return JsonData.fail("修改大单余量错误");
				}
			} else {
				return JsonData.fail("派单失败");
			}
		} else {
			return JsonData.fail("订单余量不足");
		}
	}


	@Override
	public JsonData getDriver() {
		List<Driverinfo> selectByExample = driverinfoMapper.selectByExample(new DriverinfoExample());
		return JsonData.success(selectByExample);
	}

	@Override
	public JsonData getNumberPlate(String id) {
		CarinfoExample carinfoExample = new CarinfoExample();
		carinfoExample.createCriteria().andCidEqualTo(Integer.parseInt(id));
		List<Carinfo> selectByExample = carinfoMapper.selectByExample(carinfoExample);
		return JsonData.success(selectByExample);
	}

	@Override
	public List<Map<String, Object>> selectTransportManagement(Integer page, String ordernumber, String singlenumber,
			String start, String end, String departure, String destination, String realname, String numberplate,
			String fleetname, String timetype) {
		// TODO Auto-generated method stub
		if (page == null || page == 0) {
			page = 1;
		}
		return senderManagement.selectSends("1", ordernumber, singlenumber, departure, destination, realname,
				numberplate, fleetname, timetype, start, end, (page - 1) * 15);
	}

	@Override
	public List<Sendermanagementinfo> selectSendNum() {
		// TODO Auto-generated method stub
		return senderManagement.selectByExample(new SendermanagementinfoExample());
	}

	@Override
	public int selectTransportManagementCount(String ordernumber, String singlenumber, String start, String end,
			String departure, String destination, String realname, String numberplate, String fleetname,
			String timetype) {
		// TODO Auto-generated method stub
		return senderManagement.selectSendsCount("1", ordernumber, singlenumber, departure, destination, realname,
				numberplate, fleetname, timetype, start, end);
	}

	@Override
	public List<Map<String, Object>> selectReceipt(Integer page, String ordernumber, String singlenumber, String start,
			String end, String departure, String destination, String realname, String numberplate, String fleetname,
			String timetype) {
		// TODO Auto-generated method stub
		return senderManagement.selectSends("2", ordernumber, singlenumber, departure, destination, realname,
				numberplate, fleetname, timetype, start, end, (page - 1) * 15);
	}

	@Override
	public int selectReceiptCount(String ordernumber, String singlenumber, String start, String end, String departure,
			String destination, String realname, String numberplate, String fleetname, String timetype) {
		// TODO Auto-generated method stub
		return senderManagement.selectSendsCount("2", ordernumber, singlenumber, departure, destination, realname,
				numberplate, fleetname, timetype, start, end);
	}

	@Transactional(isolation = Isolation.SERIALIZABLE)
	@Override
	public int delSends(Integer[] ids) {
		// TODO Auto-generated method stub

		int deleteByIds = senderManagement.delSends(ids[0]);
		SendermanagementinfoExample example = new SendermanagementinfoExample();
		ArrayList<String> values = new ArrayList<>();
		values.add("接单中");
		values.add("已完成");
		example.createCriteria().andIdEqualTo(ids[0]).andWaybillstateIn(values);
		int deleteByPrimaryKey = 0;
		if (senderManagement.countByExample(example)>0) {
			deleteByPrimaryKey = senderManagement.deleteByExample(example);
		}
		if (deleteByIds > 0 && deleteByPrimaryKey > 0) {
			return 1;
		}
		return 0;
	}

	@Override
	public int updateImg(Sendermanagementinfo send) {
		// TODO Auto-generated method stub
		return senderManagement.updateByPrimaryKeySelective(send);
	}
	
	@Transactional(isolation = Isolation.SERIALIZABLE)
	@Override
	public JsonData finishDispatchManagement(Sendermanagementinfo sendermanagementinfo) {
		sendermanagementinfo.setWaybillstate("已完成");//如果有开始时间和完成时间，修改订单状态为已完成
		int updateByPrimaryKeySelective = senderManagement.updateByPrimaryKeySelective(sendermanagementinfo);
		if(updateByPrimaryKeySelective>0)
		{
			Sendermanagementinfo selectByPrimaryKey = senderManagement.selectByPrimaryKey(sendermanagementinfo.getId());//获取当前订单
			Driverinfo driverinfo=new Driverinfo();
			driverinfo.setId(Integer.parseInt(selectByPrimaryKey.getNumberplate()));
			driverinfo.setState("1");
			int updateByPrimaryKeySelective2 = driverinfoMapper.updateByPrimaryKeySelective(driverinfo);//司机运输完成后根据id修改接单状态
			if(updateByPrimaryKeySelective2>0)
			{
				return JsonData.success();
			}
			else
			{
				return JsonData.fail("修改开始时间和结束时间失败");
			}
		}
		
		return JsonData.fail("修改开始时间和结束时间失败");
	}


}
