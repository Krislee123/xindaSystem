package com.datangdu.cn.administrators.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.datangdu.cn.administrators.service.Service_userService;
import com.datangdu.cn.dao.mapper.ServiceUserMapper;
import com.datangdu.cn.model.service_user.ServiceUser;
import com.datangdu.cn.model.service_user.ServiceUserExample;

@Service
public class Service_userServicelmpl implements Service_userService {
	@Resource
	ServiceUserMapper serviceUserMapper;
	@Override
	public List<ServiceUser> getService_user(HttpServletRequest request) {//通过服务商状态查询  正常、停用那个
		// TODO Auto-generated method stub
		return serviceUserMapper.selectByState(request.getParameter("state"));
	}

	@Override
	public int reState(ServiceUser user) {
		// TODO Auto-generated method stub
		ServiceUser serviceUser = new ServiceUser();   //赋值
		serviceUser.setId(user.getId());
		serviceUser.setName(user.getName());
		serviceUser.setHp(user.getHp());
		serviceUser.setArea(user.getArea());
		serviceUser.setServicePh(user.getServicePh());
		serviceUser.setServicePw(user.getServicePw());
		serviceUser.setAdminIntroduction(user.getAdminIntroduction());
		serviceUser.setMail(user.getMail());
		serviceUser.setTs(user.getTs());
		serviceUser.setUserIntroduction(user.getUserIntroduction());
		serviceUser.setWorkTs(user.getWorkTs());
		serviceUser.setQq(user.getQq());
		serviceUser.setWx(user.getWx());
		serviceUser.setCustomerPh(user.getCustomerPh());
		serviceUser.setBusinessLicense(user.getBusinessLicense());
		serviceUser.setState("1"); //1 是状态
		return serviceUserMapper.updateByPrimaryKey(serviceUser); //updateByPrimaryKey用了这个方法   根据主键修改
	}
	

	@Override
	public int reState1(ServiceUser user) {
		// TODO Auto-generated method stub
		ServiceUser serviceUser = new ServiceUser();  //赋值
		serviceUser.setId(user.getId());
		serviceUser.setName(user.getName());
		serviceUser.setHp(user.getHp());
		serviceUser.setArea(user.getArea());
		serviceUser.setServicePh(user.getServicePh());
		serviceUser.setServicePw(user.getServicePw());
		serviceUser.setAdminIntroduction(user.getAdminIntroduction());
		serviceUser.setMail(user.getMail());
		serviceUser.setTs(user.getTs());
		serviceUser.setUserIntroduction(user.getUserIntroduction());
		serviceUser.setWorkTs(user.getWorkTs());
		serviceUser.setQq(user.getQq());
		serviceUser.setWx(user.getWx());
		serviceUser.setCustomerPh(user.getCustomerPh());
		serviceUser.setBusinessLicense(user.getBusinessLicense());
		serviceUser.setState("0");
		return serviceUserMapper.updateByPrimaryKey(serviceUser);    //停用  根据主键修改
	}

	@Override
	public List<ServiceUser> getUser(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return serviceUserMapper.selectById(request.getParameter("id"));
	}
	
	@Override
	public List<ServiceUser> selectByPage(HttpServletRequest request) {
		// TODO Auto-generated method stub
		ServiceUserExample serviceUserExample = new ServiceUserExample();
		serviceUserExample.setPageSize(Integer.parseInt(request.getParameter("pageSize")));
		serviceUserExample.setPageNum(Integer.parseInt(request.getParameter("pageNum")));
		return serviceUserMapper.selectByLike(request.getParameter("name"), serviceUserExample);
	}

}
