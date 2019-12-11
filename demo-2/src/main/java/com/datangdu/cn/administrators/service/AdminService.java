package com.datangdu.cn.administrators.service;

import java.util.List;

import com.datangdu.cn.model.administrators_user.AdministratorsUser;

public interface AdminService {
public List<AdministratorsUser> operator_login(String phone);
	
	public int operator_repassword(AdministratorsUser user);
}
