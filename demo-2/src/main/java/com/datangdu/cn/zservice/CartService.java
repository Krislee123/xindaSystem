package com.datangdu.cn.zservice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.datangdu.cn.model.cart.Cart;

public interface CartService {
	int insertCart(HttpServletRequest request);
	public int updateBuynum(Cart cart,String id);
	List<Cart> getcartid(HttpServletRequest request);
	List<Cart> getuid(String userid);
	int providerProductDelete(HttpServletRequest request);
	public int updateBuynum1(Cart cart,HttpServletRequest request);

	List<Cart> getcid(HttpServletRequest request);
}
