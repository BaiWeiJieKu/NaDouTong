package com.ndt.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndt.dao.CarinfoMapper;
import com.ndt.dao.DriverinfoMapper;
import com.ndt.dao.GoodsinfoMapper;
import com.ndt.dao.MobileregistryMapper;
import com.ndt.dao.OrdermanagementinfoMapper;
import com.ndt.dao.SendermanagementinfoMapper;
import com.ndt.entity.Captaininfo;
import com.ndt.entity.CaptaininfoExample;
import com.ndt.entity.Carinfo;
import com.ndt.entity.CarinfoExample;
import com.ndt.entity.Driverinfo;
import com.ndt.entity.DriverinfoExample;
import com.ndt.entity.Goodsinfo;
import com.ndt.entity.GoodsinfoExample;
import com.ndt.entity.Mobileregistry;
import com.ndt.entity.MobileregistryExample;
import com.ndt.entity.MobileregistryExample.Criteria;
import com.ndt.entity.Ordermanagementinfo;
import com.ndt.entity.OrdermanagementinfoExample;
import com.ndt.entity.Sendermanagementinfo;
import com.ndt.entity.SendermanagementinfoExample;
import com.ndt.service.Mobileregistryservice;
import com.ndt.util.JsonData;
import com.ndt.util.PageResult;
@Service
public class MobileregistryserviceImpl implements Mobileregistryservice{

	@Autowired
	MobileregistryMapper mobileregistryMapper;
	

	//登陆的,输入用户名和电话如果存在，就成功，不存在就插入一条新的数据 
	@Override
	public JsonData insertLogin(Mobileregistry mobileregistry) {
		// TODO Auto-generated method stub
		MobileregistryExample example =new MobileregistryExample();
		example.createCriteria().andRealnameEqualTo(mobileregistry.getRealname()).andTelEqualTo(mobileregistry.getTel());
		List<Mobileregistry> selectByExample =mobileregistryMapper.selectByExample(example);
		if(!selectByExample.isEmpty())
		{
			if(!selectByExample.get(0).getOperatinglicencepath().equals("")){
				if(!selectByExample.get(0).getPcphoto().equals("")){
					if(!selectByExample.get(0).getIdcarda().equals("")){
						if(!selectByExample.get(0).getDrivercard().equals("")){
							if(!selectByExample.get(0).getIdcardb().equals("")){
								if(!selectByExample.get(0).getDrivinglicensepath().equals("")){
									mobileregistry.setUploadstate("1");
									mobileregistryMapper.updateByExampleSelective(mobileregistry, example);
									return JsonData.success();
								}
								
							}
						}
					}
					
				}
			}
			return JsonData.fail("0");
		}
		else
		{
			MobileregistryExample example2 =new MobileregistryExample();
			example.createCriteria().andTelEqualTo(mobileregistry.getTel());
			List<Mobileregistry> select =mobileregistryMapper.selectByExample(example2);
			if(!select.isEmpty()){
				mobileregistryMapper.insertSelective(mobileregistry);
				return JsonData.fail("1");
			}else{
				return JsonData.fail("0");
			}
		}
		
	}
	
	@Autowired
	SendermanagementinfoMapper sendMapper;
	@Autowired
	CarinfoMapper carmapper;
	@Autowired
	DriverinfoMapper drimapper;

	@Override
	public JsonData selectState(Mobileregistry mobileregistry) {
		// TODO Auto-generated method stub
	
		DriverinfoExample example=new DriverinfoExample();
		example.createCriteria().andTelEqualTo(mobileregistry.getTel());
		List<Driverinfo> dri=drimapper.selectByExample(example);
		if(!dri.isEmpty()){
			int id=dri.get(0).getId();
			CarinfoExample example2=new CarinfoExample();
			example2.createCriteria().andCidEqualTo(id);
			List<Carinfo> car=carmapper.selectByExample(example2);
			if(!car.isEmpty()){
				String numberPlate=car.get(0).getNumberplate();
				SendermanagementinfoExample example3=new SendermanagementinfoExample();
				example3.createCriteria().andOrderdriverEqualTo(numberPlate);
				List<Sendermanagementinfo> send=sendMapper.selectByExample(example3);
				if(!send.isEmpty()){
					return JsonData.success(send.get(0).getId());
				}else{
					return JsonData.fail("no_order");
				}
			}
			else{
				return JsonData.fail("司机信息不完整");
			}
		}else{
			return JsonData.fail("please_connt");
		}
	}

	@Override
	public JsonData insertPoints(Sendermanagementinfo sendermanagementinfo) {
		// TODO Auto-generated method stub
		String ad=sendermanagementinfo.getLocation();
		sendermanagementinfo.setLocation(ad);
		SendermanagementinfoExample example=new SendermanagementinfoExample();
		example.createCriteria().andIdEqualTo(sendermanagementinfo.getId());
		int count=sendMapper.updateByExampleSelective(sendermanagementinfo, example);
		if(count>0)
		{
			return JsonData.success();
		}
		else
		{
			return JsonData.fail("插入失败");
		}
	}
	
//	@Override
//	public JsonData updateTrans(Sendermanagementinfo sendermanagementinfo) {
//		int updateByPrimaryKeySelective = sendMapper.updateByPrimaryKeySelective(sendermanagementinfo);
//		if(updateByPrimaryKeySelective>0)
//		{
//			return JsonData.success();
//		}
//		else
//		{
//			return JsonData.fail("更新失败");
//		}
//	}

	//修改司状态
	@Autowired
	DriverinfoMapper driverMapper;
	@Override
	public JsonData updateDiver(Driverinfo driver) {
		DriverinfoExample example=new DriverinfoExample();
		example.createCriteria().andTelEqualTo(driver.getTel());
		int count=driverMapper.updateByExampleSelective(driver, example);
		if(count>0)
		{
			return JsonData.success();
		}
		else
		{
			return JsonData.fail("更新失败");
		}
	}
	@Autowired
	OrdermanagementinfoMapper orderMapper;
	@Override
	public JsonData selectDing() {
		// TODO Auto-generated method stub
		Ordermanagementinfo ord=orderMapper.selectByMaxId();
		Integer id = ord.getId();
		OrdermanagementinfoExample example=new OrdermanagementinfoExample();
		example.createCriteria().andIdEqualTo(id);
		List<Ordermanagementinfo> order=orderMapper.selectByExample(example);
		int a=Integer.parseInt(order.get(0).getGid().toString().trim());
		GoodsinfoExample example2=new GoodsinfoExample();
		example2.createCriteria().andIdEqualTo(a);
		List<Goodsinfo> good=goodmapper.selectByExample(example2);
		List<Object> list=new ArrayList<>();
		list.add(order.get(0));
		list.add(good.get(0).getGoodsname().toString().trim());
		return JsonData.success(list);
		
	}

	@Autowired
	GoodsinfoMapper goodmapper;
	@Override
	public JsonData selectYun(Mobileregistry mobileregistry) {
		// TODO Auto-generated method stub
		DriverinfoExample example=new DriverinfoExample();
		example.createCriteria().andTelEqualTo(mobileregistry.getTel());
		List<Driverinfo> dri=drimapper.selectByExample(example);
		int id=dri.get(0).getId();
		CarinfoExample example2=new CarinfoExample();
		example2.createCriteria().andCidEqualTo(id);
		List<Carinfo> car=carmapper.selectByExample(example2);
		String numberPlate=car.get(0).getNumberplate();
		SendermanagementinfoExample example3=new SendermanagementinfoExample();
		example3.createCriteria().andOrderdriverEqualTo(numberPlate);
		List<Sendermanagementinfo> send=sendMapper.selectByExample(example3);
		String order=send.get(0).getOrdernumber().toString().trim();
		OrdermanagementinfoExample example4=new OrdermanagementinfoExample();
		example4.createCriteria().andOrdernumberEqualTo(order);
		List<Ordermanagementinfo> orderinfo=orderMapper.selectByExample(example4);
		int a=Integer.parseInt(orderinfo.get(0).getGid().toString().trim());
		GoodsinfoExample example5=new GoodsinfoExample();
		example5.createCriteria().andIdEqualTo(a);
		List<Goodsinfo> good=goodmapper.selectByExample(example5);
		List<Object> list=new ArrayList<>();
		list.add(orderinfo.get(0));
		list.add(send.get(send.size()-1));
		list.add(good.get(0).getGoodsname().toString().trim());
		return JsonData.success(list);
	}

	@Override
	public JsonData updateIdcarda(Mobileregistry mobileregistry) {
		// TODO Auto-generated method stub
		MobileregistryExample example =new MobileregistryExample();
		example.createCriteria().andTelEqualTo(mobileregistry.getTel()).andRealnameEqualTo(mobileregistry.getRealname());
		mobileregistryMapper.updateByExampleSelective(mobileregistry, example);
		return JsonData.success();
	}
	
	@Override
	public JsonData updateDriverCard(Mobileregistry mobileregistry) {
		// TODO Auto-generated method stub
		MobileregistryExample example =new MobileregistryExample();
		example.createCriteria().andTelEqualTo(mobileregistry.getTel()).andRealnameEqualTo(mobileregistry.getRealname());
		mobileregistryMapper.updateByExampleSelective(mobileregistry, example);
		return JsonData.success();
	}
	
	
	@Override
	public JsonData updateIdcardA(Mobileregistry mobileregistry) {
		// TODO Auto-generated method stub
		MobileregistryExample example =new MobileregistryExample();
		example.createCriteria().andTelEqualTo(mobileregistry.getTel()).andRealnameEqualTo(mobileregistry.getRealname());
		mobileregistryMapper.updateByExampleSelective(mobileregistry, example);
		return JsonData.success();
	}
	@Override
	public JsonData updateMo(Integer page) {
		// TODO Auto-generated method stub
		if (page == null || page == 0) {
			page = 1;
		}
		MobileregistryExample example =new MobileregistryExample((page - 1) * 15, 15);
		example.createCriteria().andUploadstateEqualTo("1");
		List<Mobileregistry> selectByExample=mobileregistryMapper.selectByExample(example);
		MobileregistryExample example2=new MobileregistryExample();
		example2.createCriteria().andUploadstateEqualTo("1");
		long countByExample = mobileregistryMapper.countByExample(example2);
		PageResult<Mobileregistry> pageResult = new PageResult<Mobileregistry>(selectByExample, (int) countByExample);
		return JsonData.success(pageResult);
	}
	
	
	@Override
	public JsonData updateIdcardB(Mobileregistry mobileregistry) {
		// TODO Auto-generated method stub
		MobileregistryExample example =new MobileregistryExample();
		example.createCriteria().andTelEqualTo(mobileregistry.getTel()).andRealnameEqualTo(mobileregistry.getRealname());
		mobileregistryMapper.updateByExampleSelective(mobileregistry, example);
		return JsonData.success();
	}
	
	
	@Override
	public JsonData updateDriving(Mobileregistry mobileregistry) {
		// TODO Auto-generated method stub
		MobileregistryExample example =new MobileregistryExample();
		example.createCriteria().andTelEqualTo(mobileregistry.getTel()).andRealnameEqualTo(mobileregistry.getRealname());
		mobileregistryMapper.updateByExampleSelective(mobileregistry, example);
		return JsonData.success();
	}
	
	@Override
	public JsonData updateOperating(Mobileregistry mobileregistry) {
		// TODO Auto-generated method stub
		MobileregistryExample example =new MobileregistryExample();
		example.createCriteria().andTelEqualTo(mobileregistry.getTel()).andRealnameEqualTo(mobileregistry.getRealname());
		mobileregistryMapper.updateByExampleSelective(mobileregistry, example);
		return JsonData.success();
	}

	@Override
	public JsonData selectRen(Mobileregistry mobileregistry) {
		boolean pc_falg=false;
		boolean dri_falg=false;
		boolean ida_falg=false;
		boolean driving_falg=false;
		boolean idb_falg=false;
		boolean ope_falg=false;
		MobileregistryExample example =new MobileregistryExample();
		example.createCriteria().andRealnameEqualTo(mobileregistry.getRealname()).andTelEqualTo(mobileregistry.getTel());
		List<Mobileregistry> selectByExample =mobileregistryMapper.selectByExample(example);
		if(!selectByExample.get(0).getOperatinglicencepath().equals("")){
			ope_falg=true;
		}
		if(!selectByExample.get(0).getPcphoto().equals("")){
			pc_falg=true;
		}
		if(!selectByExample.get(0).getIdcarda().equals("")){
			ida_falg=true;
		}
		if(!selectByExample.get(0).getDrivercard().equals("")){
			dri_falg=true;
		}
		if(!selectByExample.get(0).getIdcardb().equals("")){
			idb_falg=true;
		}
		if(!selectByExample.get(0).getDrivinglicensepath().equals("")){
			driving_falg=true;
		}
		if(pc_falg||ope_falg||ida_falg||idb_falg||dri_falg||driving_falg){
			mobileregistry.setUploadstate("1");
			mobileregistryMapper.updateByExampleSelective(mobileregistry, example);
		}
		List<Object> list=new ArrayList<>();
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("pc_flag", pc_falg);
		map.put("ope_flag", ope_falg);
		map.put("idb_flag", idb_falg);
		map.put("ida_flag", ida_falg);
		map.put("driving_flag", driving_falg);
		map.put("dri_flag", dri_falg);
		list.add(map);
		return JsonData.success(list);
	}
	

	
}
