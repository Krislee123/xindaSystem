package com.datangdu.cn.administrators.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.datangdu.cn.administrators.service.Buy_userService;
import com.datangdu.cn.dao.mapper.BuyUserMapper;
import com.datangdu.cn.model.buy_user.BuyUser;
import com.datangdu.cn.model.buy_user.BuyUserExample;

@Service
public class Buy_userServicelmpl implements Buy_userService {
	@Resource
	BuyUserMapper buyUserMapper;
	@Override
	public List<BuyUser> getUser(HttpServletRequest request) {
		// TODO Auto-generated method stub
		BuyUserExample buyUserExample = new BuyUserExample();
		return buyUserMapper.selectByExample(null);
	}

	@Override
	public List<BuyUser> selectByPage(HttpServletRequest request) {
		// TODO Auto-generated method stub
		BuyUserExample buyUserExample = new BuyUserExample();
		buyUserExample.setPageSize(Integer.parseInt(request.getParameter("pageSize")));
		buyUserExample.setPageNum(Integer.parseInt(request.getParameter("pageNum")));
		
		return buyUserMapper.selectByLike(request.getParameter("name"),buyUserExample);
	}

}
