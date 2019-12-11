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

import com.datangdu.cn.model.cart.Cart;
import com.datangdu.cn.model.provider_product.ProviderProduct;
import com.datangdu.cn.zservice.CartService;
import com.datangdu.cn.zservice.ProviderProductService;

@Controller
@RequestMapping("/product")
public class ControllerProductProvider {
	//显示所有商品
		 @Resource 
		 ProviderProductService  providerProductService;
		 @Resource 
		 CartService  cService;
		 
		@ResponseBody
		@RequestMapping(value="/gmgm",method=RequestMethod.POST)
		public Map<String,Object> Provideproduct(HttpServletRequest request){
			Map<String,Object> map=new HashMap<String,Object>();
			//String id=request.getParameter("id");
			List<Cart> cart=cService.getcartid(request);
			map.put("cartnum", cart.size());
			List<ProviderProduct> providerProductInfo=providerProductService.getProviderProductInfoById(request);
			System.out.println(providerProductInfo); 
			map.put("providerProductInfo",providerProductInfo);
			System.out.println("map"+map);
			return map ;

		}
		
		@ResponseBody			//模糊查询
		@RequestMapping(value="/select",method = RequestMethod.GET)
		public Map <String,Object> selecte(HttpServletRequest request) {
			Map<String,Object> map = new HashMap<String,Object>();
			List<ProviderProduct> providerProductInfo= providerProductService.select2(request);
			System.out.println(providerProductInfo); 
			map.put("providerProductInfo", providerProductInfo);
			return map;
		}
		

}
