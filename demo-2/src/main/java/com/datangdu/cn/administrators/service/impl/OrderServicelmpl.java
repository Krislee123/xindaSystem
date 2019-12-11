package com.datangdu.cn.administrators.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.datangdu.cn.administrators.service.OrderService;
import com.datangdu.cn.dao.mapper.OrderLMapper;
import com.datangdu.cn.model.order.OrderL;
import com.datangdu.cn.model.order.OrderLExample;

@Service
public class OrderServicelmpl implements OrderService {
	@Resource
	OrderLMapper orderLMapper;

	@Override
	public List<OrderL> getOrder() {
		// TODO Auto-generated method stub
		OrderLExample orderExample = new OrderLExample();
		OrderLExample.Criteria criteria = orderExample.createCriteria();

		return orderLMapper.selectByExample(null);
	}

	@Override
	public List<OrderL> getExpenses() {
		// TODO Auto-generated method stub

		return orderLMapper.selectByExample(null);
	}

	@Override
	public List<OrderL> selectByDate(HttpServletRequest request) {
		// TODO Auto-generated method stub
		OrderLExample orderLExample = new OrderLExample();  //赋值
		orderLExample.setPageSize(Integer.parseInt(request.getParameter("pageSize")));
		orderLExample.setPageNum(Integer.parseInt(request.getParameter("pageNum")));
		return orderLMapper.selectByDate(request.getParameter("enddate"), request.getParameter("startdate"), orderLExample);
	}
	

	@Override
	public List<OrderL> selectByDate1(HttpServletRequest request) {
		// TODO Auto-generated method stub
		 return orderLMapper.selectByDate1(request.getParameter("enddate"), request.getParameter("startdate"));
	}

	@Override
	public OrderL selectById(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return orderLMapper.selectByPrimaryKey(request.getParameter("num"));
	}

	@Override
	public List<OrderL> selectByLike(HttpServletRequest request) {
		// TODO Auto-generated method stub
		OrderLExample orderLExample = new OrderLExample();
		orderLExample.setPageSize(Integer.parseInt(request.getParameter("pageSize")));
		orderLExample.setPageNum(Integer.parseInt(request.getParameter("pageNum")));
		return orderLMapper.selectByLike(request.getParameter("name"), orderLExample);
	}

}
