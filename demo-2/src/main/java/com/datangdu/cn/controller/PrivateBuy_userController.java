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

import com.datangdu.cn.administrators.service.Buy_userService;
import com.datangdu.cn.model.buy_user.BuyUser;

@Controller
@RequestMapping("/opeuser")
public class PrivateBuy_userController {
	@Resource
	Buy_userService buy_userService;
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public Map<String, Object> product(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();
		List<BuyUser> buy_userList = buy_userService.getUser(request);
		map.put("buy_userList", buy_userList);
		return map;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public Map<String, Object> page(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();
		List<BuyUser> buy_userList = buy_userService.selectByPage(request);
		map.put("buy_userList", buy_userList);
		return map;
	}

}
