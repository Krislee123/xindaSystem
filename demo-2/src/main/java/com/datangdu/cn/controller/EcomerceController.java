package com.datangdu.cn.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.datangdu.cn.model.bus_order.BusinessOrder;
import com.datangdu.cn.service.EcomerceService;

@Controller
@RequestMapping("/ecomerce") 
public class EcomerceController {
	@Resource // 相当于创建对象
	EcomerceService ecomerceService;
	@RequestMapping("index")
	public String index() {
		return "e-commerce_login";
	}
	
	/*
	 * @RequestMapping("findByName") public String findByName(Map<String, Object>
	 * map, @RequestParam(defaultValue = "") String name) {
	 * 
	 * List<BusinessOrder> productList = ecomerceService.findByName(name);
	 * System.out.println("11111" + name); map.put("productList", productList);
	 * map.put("name", name);
	 * 
	 * return "e-commerce_product"; }
	 * 
	 */
}
