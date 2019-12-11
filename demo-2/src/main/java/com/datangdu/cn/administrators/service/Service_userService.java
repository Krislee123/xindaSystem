package com.datangdu.cn.administrators.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.datangdu.cn.model.service_user.ServiceUser;

public interface Service_userService {
public List<ServiceUser> getService_user(HttpServletRequest request);//getService_user定义的函数名    List<ServiceUser>函数返回类型
	
	public int reState(ServiceUser user);//同上
	
	public int reState1(ServiceUser user);
	
	public List<ServiceUser> getUser(HttpServletRequest request);
	
	public List<ServiceUser> selectByPage(HttpServletRequest request);
}
