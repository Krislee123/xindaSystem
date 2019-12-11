package com.datangdu.cn.administrators.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.datangdu.cn.administrators.service.AdminService;
import com.datangdu.cn.dao.mapper.AdministratorsUserMapper;
import com.datangdu.cn.model.administrators_user.AdministratorsUser;
import com.datangdu.cn.model.administrators_user.AdministratorsUserExample;

@Service
public class AdminServicelmpl implements AdminService {
	@Resource
	AdministratorsUserMapper administratorsUserMapper;
	@Override
	public List<AdministratorsUser> operator_login(String phone) {
		// TODO Auto-generated method stub
		//新建查询条件对象
				AdministratorsUserExample administratorsUserExample = new AdministratorsUserExample();
				//创建具体的条件实例
				AdministratorsUserExample.Criteria criteria = administratorsUserExample.createCriteria();
				
				//设置具体条件
				criteria.andAdministratorsPhEqualTo(phone);
				//执行查询并返回
				return administratorsUserMapper.selectByExample(administratorsUserExample);
		
	}

	@Override
	public int operator_repassword(AdministratorsUser user) {
		// TODO Auto-generated method stub
		//新建查询条件对象
				AdministratorsUserExample administratorsUserExample = new AdministratorsUserExample();
				//创建具体的条件实例
				AdministratorsUserExample.Criteria criteria = administratorsUserExample.createCriteria();

				//执行查询并返回
				return administratorsUserMapper.updateByExample(user, administratorsUserExample);
		
	}

}
