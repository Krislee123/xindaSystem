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

import com.datangdu.cn.administrators.service.Service_productService;
import com.datangdu.cn.model.service_product.ServiceProduct;

@Controller
@RequestMapping("/product")
public class PrivateService_productController {
	@Resource
	Service_productService service_productService;
	
	@RequestMapping("/denglu")
	public String Denglu() {
		return "operator_login";
	}
	@RequestMapping("/op_product")
	public String Op_product() {
		return "operator_product";
	}
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public Map<String, Object> product(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();
		System.out.println("llllllll");
		List<ServiceProduct> service_productList = service_productService.getService_product();
		map.put("service_productList", service_productList);
		return map;
	}
	
	@RequestMapping("/downline")
	public String downline(HttpServletRequest request) {
		ServiceProduct user = new ServiceProduct();
		String id = request.getParameter("id");
		//System.out.println("======"+id);
		user = service_productService.selectByPrimaryKey(id);
	//	System.out.println(user.getServiceState());
		user.setServiceState("0");
	//	System.out.println("user="+user);
		int code = service_productService.updateByPrimaryKey(user);
		
		return "operator_product";
	}
	
	@RequestMapping("/deletel")
	public String deletel(HttpServletRequest request) {
		String id = request.getParameter("id");
		int code = service_productService.deleteByPrimaryKey(id);
		return "operator_product";
	}
	
	@RequestMapping("/upline")
	public String upline(HttpServletRequest request) {
		ServiceProduct user = new ServiceProduct();
		String id = request.getParameter("id");
		System.out.println("======"+id);
		user = service_productService.selectByPrimaryKey(id);
		user.setServiceState("1");
		int code = service_productService.updateByPrimaryKey(user);
		
		return "operator_product";
	}
	
	@ResponseBody
	@RequestMapping(value = "/upall", method = RequestMethod.GET)
	public Map<String, Object> upall(HttpServletRequest request) {
		ServiceProduct user = new ServiceProduct();
		Map<String,Object> map = new HashMap<String,Object>();
		String xx= "";
		System.out.println(xx);
		String str = request.getParameter("str");
		String[] strs= str.split(",");
		System.out.println("======"+str);
		int len = strs.length;
		for(int i = 0;i<len;i++) {
			user = service_productService.selectByPrimaryKey(strs[i]);
			if(user.getServiceState().equals("0")) {
				user.setServiceState("1");
				int code = service_productService.updateByPrimaryKey(user);
				xx += user.getServiceState();
			}
			else {
				xx += user.getServiceState();
			}
//			011111111" ["","11111"]
		}
		map.put("xx", xx);
		
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/downall", method = RequestMethod.GET)
	public Map<String, Object> downall(HttpServletRequest request) {
		ServiceProduct user = new ServiceProduct();
		Map<String,Object> map = new HashMap<String,Object>();
		String xx= "";
		System.out.println(xx);
		String str = request.getParameter("str");
		String[] strs= str.split(",");
		System.out.println("======"+str);
		int len = strs.length;
		for(int i = 0;i<len;i++) {
			user = service_productService.selectByPrimaryKey(strs[i]);
			if(user.getServiceState().equals("1")) {
				user.setServiceState("0");
				int code = service_productService.updateByPrimaryKey(user);
				xx += user.getServiceState();
			}
			else {
				xx += user.getServiceState();
			}
//			011111111" ["","11111"]
		}
		map.put("xx", xx);
		
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public Map<String, Object> search(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();
		List<ServiceProduct> service_productList = service_productService.selectByLike(request);
		map.put("service_productList", service_productList);
		return map;
	}
}
