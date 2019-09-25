package com.ndt.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ndt.dao.CarinfoMapper;
import com.ndt.entity.Carinfo;
import com.ndt.entity.CarinfoExample;
import com.ndt.entity.CarinfoExample.Criteria;
import com.ndt.service.CarService;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarinfoMapper carinfoMapper;

	@Override
	public int insertCar(Carinfo car) {
		// TODO Auto-generated method stub
		car.setCreatetime(new Date());
		return carinfoMapper.insertSelective(car);
	}

	@Override
	public int delCars(Integer[] ids) {
		// TODO Auto-generated method stub
		return carinfoMapper.deleteByIds(ids);
	}

	@Override
	public int updateCar(Carinfo car) {
		// TODO Auto-generated method stub
		return carinfoMapper.updateByPrimaryKeySelective(car);
	}

	@Override
	public List<Carinfo> selectCars(Integer page, Carinfo car, Date start, Date end) {
		// TODO Auto-generated method stub
		if (page == null || page <= 0) {
			page = 1;
		}
		CarinfoExample example = new CarinfoExample((page - 1) * 15, 15);
		example.setOrderByClause("id desc");
		Criteria createCriteria = example.createCriteria();
		if (car.getNumberplate() != null && !car.getNumberplate().equals("")) {
			createCriteria.andNumberplateLike("%" + car.getNumberplate() + "%");
		}
		if (car.getRoadtransportcertificate() != null && !car.getRoadtransportcertificate().equals("")) {
			createCriteria.andRoadtransportcertificateLike("%" + car.getRoadtransportcertificate() + "%");
		}
		if (start != null && end != null) {
			createCriteria.andCreatetimeBetween(start, end);
		}
		return carinfoMapper.selectByExample(example);
	}

	@Override
	public int selectCount(Carinfo car) {
		// TODO Auto-generated method stub
		CarinfoExample example = new CarinfoExample();
		Criteria createCriteria = example.createCriteria();
		if (car.getNumberplate() != null && !car.getNumberplate().equals("")) {
			createCriteria.andNumberplateLike("%" + car.getNumberplate() + "%");
		}
		if (car.getRoadtransportcertificate() != null && !car.getRoadtransportcertificate().equals("")) {
			createCriteria.andRoadtransportcertificateLike("%" + car.getRoadtransportcertificate() + "%");
		}
		if (car.getCreatetime() != null && !car.getCreatetime().equals("")) {

		}
		return (int) carinfoMapper.countByExample(example);
	}

	@Override
	public List<Carinfo> selectCarNum(Carinfo car) {
		// TODO Auto-generated method stub
		CarinfoExample example = new CarinfoExample();
		example.createCriteria().andNumberplateEqualTo(car.getNumberplate());
		return carinfoMapper.selectByExample(example);
	}

	@Override
	public List<Carinfo> selectCarNums() {
		// TODO Auto-generated method stub
		return carinfoMapper.selectByExample(new CarinfoExample());
	}

	@Override
	public List<Map<String, Object>> getAllCars() {
		// TODO Auto-generated method stub
		
		return carinfoMapper.getAllCars();
	}

	@Override
	public List<Carinfo> selectRoad(Carinfo car) {
		// TODO Auto-generated method stub
		CarinfoExample example = new CarinfoExample();
		example.createCriteria().andRoadtransportcertificateEqualTo(car.getRoadtransportcertificate());
		return carinfoMapper.selectByExample(example);
	}

}
