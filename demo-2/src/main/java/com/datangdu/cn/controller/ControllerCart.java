package com.datangdu.cn.controller;

import java.util.ArrayList;
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
import com.datangdu.cn.model.member.Member;
import com.datangdu.cn.model.provider_product.ProviderProduct;
import com.datangdu.cn.model.service_order.ServiceOrder;
import com.datangdu.cn.zservice.CartService;
import com.datangdu.cn.zservice.MemberService;
import com.datangdu.cn.zservice.ProviderProductService;
import com.datangdu.cn.zservice.ServiceOrderService;

@Controller
@RequestMapping("/product")
public class ControllerCart {
	@Resource
	CartService cartService;
	@Resource
	ProviderProductService providerProductService;
	@Resource
	ServiceOrderService serviceOrderService;
	@Resource
	MemberService mService;


//将网页查询到的id插入购物车
	@ResponseBody
	@RequestMapping(value = "/jkk", method = RequestMethod.POST)
	public Map<String, Object> ProductAdd(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Cart> cartInfo = cartService.getcid(request);
		System.out.println("加入购物车成功吗"+cartInfo.size());
		if (cartInfo.isEmpty()) {
			int a = cartService.insertCart(request);
			System.out.println("插入成功" + a);
			map.put("msg", a);
			return map;
		}

		if (!cartInfo.isEmpty()) {
			map.put("msg", "id已存在");
			Cart cart = new Cart();
			cart.setBuyNum(cartInfo.get(0).getBuyNum() + 1);
			int a = cartService.updateBuynum(cart, request.getParameter("id"));
		}

		return map;
	}

	// 根据购物车里商品id返回商品信息
	@ResponseBody
	@RequestMapping(value = "/getproductinfo", method = RequestMethod.GET)
	public Map<String, Object> Provideproduct(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		// List<Cart> cartInfo=cartService.getcartid(request);
		List<Map<String, Object>> product = new ArrayList<Map<String, Object>>();

		List<Cart> cartInfo = cartService.getuid(request.getParameter("userid"));
		System.out.println(cartInfo.size());
		for (int i = 0; i < cartInfo.size(); i++) {
			Map<String, Object> map1 = new HashMap<String, Object>();

			String id = cartInfo.get(i).getServiceId();
			System.out.println("1111111111111");
			List<ProviderProduct> providerProductInfo = providerProductService.getid(id);
			providerProductInfo.get(0).setNum2(cartInfo.get(i).getBuyNum());
			System.out.println("2222222222222");
//		providerProductInfo.add((ProviderProduct)providerProductService.getid(id));
			if (product.size() == 0) {
				System.out.println("name"+providerProductInfo.get(0).getProviderName());
				map1.put("name", providerProductInfo.get(0).getProviderName());
				map1.put("product", providerProductInfo);
				map1.put("num", cartInfo.get(i).getBuyNum());
				product.add(map1);
				map.put("product", product);
				continue;
			} else {
				int num = 0;
				for (Map<String, Object> map2 : product) {
					if (map2.get("name").equals(providerProductInfo.get(0).getProviderName())) {
						num = 1;
						break;
					}
				}
				
				for (Map<String, Object> map2 : product) {
					System.out.println("product"+map2.get("name")+map2.size());
					
					if (map2.get("name").equals(providerProductInfo.get(0).getProviderName())) {
						System.out.println("product--if"+map2.get("name"));
						 ((List<ProviderProduct>) map2.get("product")).add(providerProductInfo.get(0));
						break;
					} else if(num == 1) {
						continue;
					} else {
						System.out.println("product--else"+providerProductInfo.get(0).getProviderName());
						map1.put("name", providerProductInfo.get(0).getProviderName());
						map1.put("product", providerProductInfo);
						map1.put("num", cartInfo.get(i).getBuyNum());
						product.add(map1);
						System.out.println("product--else"+map2.get("name"));
						break;
					}
				}

			}

		}

		map.put("product", product);
		return map;
	}
	
	//通过商品id删除商品
	@ResponseBody
	@RequestMapping(value="/providerProductdelete",method=RequestMethod.POST)
	public Map<String,Object> Productdelete(HttpServletRequest request) {
		Map<String,Object> map=new HashMap<String,Object>();
		int cartInfo=cartService.providerProductDelete(request);
		map.put("msg","恭喜删除成功");
		map.put("code",1);
		return map;	
	}
	

	//通过商品【-】减少商品数量
	@ResponseBody
	@RequestMapping(value="/reducenum",method=RequestMethod.POST)
	public Map<String,Object> Productreduce(HttpServletRequest request,String id) {
		Map<String,Object> map=new HashMap<String,Object>();
	//	List<Cart> cartInfo = cartService.getuid(request.getParameter("userid"));		
	//	List<Cart> cartInfo = cartService.getid(request,id);	
				Cart cart = new Cart();
				cart.setBuyNum(Integer.valueOf(request.getParameter("num")) -1);
				
				cart.setServiceId(id);
				System.out.println(cart.getBuyNum());
				int a = cartService.updateBuynum1(cart, request);
	
				map.put("code", 1);
				map.put("msg",a);	

		return map;
		
	}
	
	//通过商品【+】增加商品数量
	@ResponseBody
	@RequestMapping(value="/addnum",method=RequestMethod.POST)
	public Map<String,Object> Productadd(HttpServletRequest request,String id) {
		Map<String,Object> map=new HashMap<String,Object>();
	//	List<Cart> cartInfo = cartService.getid(request,id);
				Cart cart = new Cart();
				cart.setBuyNum(Integer.valueOf(request.getParameter("num")) +1);
				cart.setServiceId(id);
				System.out.println(cart.getBuyNum());
				int a = cartService.updateBuynum1(cart, request);
				map.put("code", 1);
				map.put("msg",a);	
		return map;
		
	}
	
	
	
	//通过改变商品数量进行改变
		@ResponseBody
		@RequestMapping(value="/updatenum",method=RequestMethod.POST)
		public Map<String,Object> Productupdate(HttpServletRequest request,String id) {
			Map<String,Object> map=new HashMap<String,Object>();
		//	List<Cart> cartInfo = cartService.getid(request,id);
					Cart cart = new Cart();
					cart.setBuyNum(Integer.valueOf(request.getParameter("num")) );
					cart.setServiceId(id);
					System.out.println(cart.getBuyNum());
					int a = cartService.updateBuynum1(cart, request);
					map.put("code", 1);
					map.put("msg",a);	
			return map;
			
		}
	
	
	//通过结算向serviceorder里插入订单编号等
	@ResponseBody
	@RequestMapping(value="/ggg",method=RequestMethod.POST)
	public Map<String,Object> Productorder(HttpServletRequest request) {
		Map<String,Object> map=new HashMap<String,Object>();
		List<ServiceOrder> serviceOrderInfo = serviceOrderService.getuid(request.getParameter("userid"));	
			ServiceOrder serviceOrder = new ServiceOrder();
			String danhao=request.getParameter("nn");
			System.out.println(danhao);		
			serviceOrder.setServiceNo(danhao);
			int a = serviceOrderService.insertServiceOrder(request);
		  map.put("product", serviceOrderInfo);

				map.put("code", 1);
		return map;
		
	}
	
	/*
	//选择支付方式设置paytype
		@ResponseBody
		@RequestMapping(value="/hhh",method=RequestMethod.POST)
		public Map<String,Object> Productzhifu(HttpServletRequest request) {
			Map<String,Object> map=new HashMap<String,Object>();
			if(Integer.valueOf(request.getParameter("paytype"))!=0) {
				
			int a = serviceOrderService.up(request);	
					map.put("code", 1);
					map.put("msg", "支付成功");
					return map;
			}
			map.put("msg", "请选择支付方式");
			return map;
			
		}
	*/
	
	//
	@ResponseBody
	@RequestMapping(value="/mmm",method=RequestMethod.POST)
	public Map<String,Object> Productxiangqing(HttpServletRequest request) {
		Map<String,Object> map=new HashMap<String,Object>();
		List<ServiceOrder> soList=serviceOrderService.getll(request.getParameter("userid"));
		/////////////////////////////////////////////
		
		for(int j=0;j<soList.size();j++) {

			String [] str=soList.get(j).getServiceId().split(",");//str={0003*1,0002*2}
			System.out.println(str[0]);
			System.out.println(str.length);
			
			String [] str1=new String[10];
			String [] str2=new String[10];
			List<ProviderProduct> pp;
			StringBuffer buf=new StringBuffer();
			
			//“0002”
			
			for(int i=0;i<str.length;i++) {
				String [] str3=str[i].split("\\*");	//str3={0003,1}
				
				pp=providerProductService.getid(str3[0]);		//查询产品id
				str1[i]=pp.get(0).getServiceContent();		//产品名称存入str1

				str2[i]=str3[1];											//数量存入str2
				System.out.println("结果"+str1[i]+"*"+str2[i]);
				buf.append(str1[i]+"*"+str2[i]+" ");
				soList.get(j).setServiceId(buf.toString());
				System.out.println(buf.toString());
			}
			}
		///////////////////////////////////////////////////
		map.put("list", soList);	
		return map;
		
	}
	
	
	
	@ResponseBody
	@RequestMapping(value="/mmm2",method=RequestMethod.POST)
	public Map<String,Object> Productxiangqing2(HttpServletRequest request) {
		Map<String,Object> map=new HashMap<String,Object>();
		List<ServiceOrder> list=serviceOrderService.search(request);
		map.put("list", list);	
		return map;
		
	}
	
	//删除订单
	@ResponseBody
	@RequestMapping(value="/Productdelete",method=RequestMethod.POST)
	public Map<String,Object> Productdelete2(HttpServletRequest request) {
		Map<String,Object> map=new HashMap<String,Object>();
		int serviceOrderInfo=serviceOrderService.pProductDelete(request);
		map.put("msg","恭喜删除成功");
		map.put("code",1);
		return map;	
	}

	
	//通过订单编号查询订单信息
	@ResponseBody
	@RequestMapping(value="/sss",method=RequestMethod.POST)
	public Map<String,Object> Product(HttpServletRequest request) {
		Map<String,Object> map=new HashMap<String,Object>();
		List<ServiceOrder> soList=serviceOrderService.getmm(request.getParameter("serviceNo"));
		map.put("list", soList);	
		
		for(int j=0;j<soList.size();j++) {

			  String [] str=soList.get(j).getServiceId().split(",");//str={0003*1,0002*2}
			  System.out.println(str[0]);
			  System.out.println(str.length);
			  
			  String [] str1=new String[10];
			  String [] str2=new String[10];
			  List<ProviderProduct> pp;
			  StringBuffer buf=new StringBuffer();
			  
			  //“0002”
			  
			  for(int i=0;i<str.length;i++) {
			   String [] str3=str[i].split("\\*"); //str3={0003,1}
			   
			   pp=providerProductService.getid(str3[0]);  //查询产品id
			   str1[i]=pp.get(0).getServiceName();  //产品名称存入str1

			   str2[i]=str3[1];           //数量存入str2
			   System.out.println("结果"+str1[i]+"*"+str2[i]);
			   buf.append(str1[i]+"*"+str2[i]+" ");
			   soList.get(j).setServiceId(buf.toString());
			   System.out.println(buf.toString());
			  }
			  
			  }
		
		return map;
		
	}
	
	//修改订单状态
	@ResponseBody
	@RequestMapping(value="/hhh",method=RequestMethod.POST)
	public Map<String,Object> Productfukuan(HttpServletRequest request) {
		Map<String,Object> map=new HashMap<String,Object>();
		List<ServiceOrder> list1=serviceOrderService.getmm(request.getParameter("nn"));
			int a = serviceOrderService.up(request);	
			/////////////////////////////////修改用户表
			Member m=mService.select2(list1.get(0).getMemberId());
			m.setBuyNum(m.getBuyNum()+1);//数量加1
			m.setTotalPrice(m.getTotalPrice()+list1.get(0).getTotalPrice());//消费金额增加
			mService.update2(m);
			////////////////////////////////////修改
			System.out.println(list1.get(0).getServiceId().split(","));
			String [] str=list1.get(0).getServiceId().split(",");//str={0003*1,0002*2}
			  System.out.println(str[0]);
			  System.out.println(str.length);
			  
			  String [] str1=new String[1024];
			  String [] str2=new String[1024];
			  

			  for(int i=0;i<str.length;i++) {
			   String [] str3=str[i].split("\\*"); //str3={0003,1}
			   ProviderProduct pp=providerProductService.getUserInfo(str3[0]);  //查询产品id
			   System.out.println("产品"+pp.getSaleNum());
			   
				pp.setSaleNum(pp.getSaleNum()+Integer.valueOf(str3[1]));//数量加1
				System.out.println("产品销量"+pp.getSaleNum());
				providerProductService.update2(pp);
			  }
					map.put("code", 1);
					map.put("msg", "支付成功");
					return map;

	}
}
