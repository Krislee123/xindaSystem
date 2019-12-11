package com.datangdu.cn.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datangdu.cn.administrators.service.OrderService;
import com.datangdu.cn.model.order.OrderL;

@Controller
@RequestMapping("/orderform")
public class PrivateOrderController {
	@Resource
	OrderService orderService;
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.GET) //拦截login
	public Map<String, Object> product(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();  //新建一个map集合 
		List<OrderL> orderList = orderService.getOrder();  //执行getOrder方法  按住Ctrl 跳转
		map.put("orderList", orderList); //调用map orderList查出来的东西
		return map;  //返回map集合 回到前台 js
	}
	
	@ResponseBody 
	@RequestMapping(value = "/cost", method = RequestMethod.GET)   //拦截cost
	public Map<String, Object> expenses(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();  //新建一个map集合
		List<OrderL> orderList = orderService.getExpenses();   //执行getExpenses方法  按住Ctrl 跳转
		List<OrderL> userList = orderService.selectByLike(request);
		map.put("orderList", orderList);  //调用map orderList查出来的东西
		map.put("userList", userList);  //调用map userList查出来的东西
		map.put("coco", orderList.size());  //调用map orderList.size查出来的东西
		return map; //返回map集合 回到前台 js
	}
	
	@ResponseBody
	@RequestMapping(value = "/query", method = RequestMethod.GET)    //拦截query
	public Map<String, Object> query(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();  //新建一个map集合
		List<OrderL> orderList = orderService.selectByDate(request);   //执行selectByDate方法  按住Ctrl 跳转
		List<OrderL> userList = orderService.selectByDate1(request);  //执行selectByDate1方法  按住Ctrl 跳转
		map.put("orderList", orderList);  //调用map orderList查出来的东西
		map.put("coco", userList.size());  //调用map  userList.size查出来的东西
		return map; //返回map集合 回到前台 js
	}
	
	@ResponseBody
	@RequestMapping(value = "/search", method = RequestMethod.GET)  //拦截search
	public Map<String, Object> search(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();  //新建一个map集合
		OrderL order = orderService.selectById(request);   //执行selectById方法  按住Ctrl 跳转
		map.put("orderList", order);   //调用map order查出来的东西
		return map; //返回map集合 回到前台 js
	}
}
