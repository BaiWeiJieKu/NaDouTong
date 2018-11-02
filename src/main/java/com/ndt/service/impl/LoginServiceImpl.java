package com.ndt.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndt.dao.LogininfoMapper;
import com.ndt.entity.Logininfo;
import com.ndt.entity.LogininfoExample;
import com.ndt.service.LoginService;
import com.ndt.util.JsonData;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LogininfoMapper LogininfoMapper;

	@Override
	public JsonData insertLogin(Logininfo logininfo) {

		LogininfoExample example = new LogininfoExample();
		example.createCriteria().andUsernameEqualTo(logininfo.getUsername());// 根据用户名查询,查重
		List<Logininfo> selectByExample = LogininfoMapper.selectByExample(example);

		if (!selectByExample.isEmpty()) {
			return JsonData.fail("用户名重复");// 如果能查到数据,说明存在此用户名,不允许插入
		} else {
			logininfo.setDisablelogin("0");// 0可以登录,1禁止登录
			logininfo.setIsreview("0");// 0未审核,1已审核
			Date date = new Date();
			logininfo.setCreatetime(date);
			int insertSelective = LogininfoMapper.insertSelective(logininfo);// 插入数据
			if (insertSelective > 0) {
				return JsonData.success();
			} else {
				return JsonData.fail("注册失败");
			}
		}

	}

	@Override
	public int disableLogin(Logininfo logininfo) {
		return LogininfoMapper.updateByPrimaryKeySelective(logininfo);
	}

	@Override
	public JsonData isReview(Logininfo logininfo) {

		int updateByPrimaryKeySelective = LogininfoMapper.updateByPrimaryKeySelective(logininfo);
		if (updateByPrimaryKeySelective > 0) {
			return JsonData.success();
		} else {
			return JsonData.fail("修改审核状态失败");
		}
	}

	@Override
	public List<Logininfo> Login(Logininfo login) {
		// TODO Auto-generated method stub
		LogininfoExample example = new LogininfoExample();
		example.createCriteria().andUsernameEqualTo(login.getUsername()).andPasswordEqualTo(login.getPassword())
				.andDisableloginEqualTo("0").andIsreviewEqualTo("1");
		return LogininfoMapper.selectByExample(example);
	}

	@Override
	public List<Logininfo> isLogin(Logininfo login) {
		// TODO Auto-generated method stub
		LogininfoExample example = new LogininfoExample();
		example.createCriteria().andUsernameEqualTo(login.getUsername()).andPasswordEqualTo(login.getPassword())
				.andDisableloginEqualTo("0").andIsreviewEqualTo("0");
		return LogininfoMapper.selectByExample(example);
	}

	@Override
	public List<Logininfo> reviewInformation(Integer page) {
		// TODO Auto-generated method stub
		if (page == 0 || page == null) {
			page = 1;
		}
		LogininfoExample example = new LogininfoExample((page - 1) * 15, 15);
		example.setOrderByClause("id desc");
		example.createCriteria().andIsreviewEqualTo("0");
		return LogininfoMapper.selectByExample(example);
	}

	public int reviewInformationCount() {
		// TODO Auto-generated method stub
		LogininfoExample example = new LogininfoExample();
		example.createCriteria().andIsreviewEqualTo("0");
		return (int) LogininfoMapper.countByExample(example);
	}

}
