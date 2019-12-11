package com.datangdu.cn.zservice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.datangdu.cn.model.sys_user.SysUser;

public interface SysUserService {
	public List<SysUser> setUserLogin(HttpServletRequest request);
	public int updatepassword(SysUser su,HttpServletRequest request);
	SysUser getUserInfo(String id);
}

