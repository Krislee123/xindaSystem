package com.datangdu.cn.zservice.lmpl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.datangdu.cn.dao.mapper.CartMapper;
import com.datangdu.cn.model.cart.Cart;
import com.datangdu.cn.model.cart.CartExample;
import com.datangdu.cn.zservice.CartService;

@Service
public class CartServicelmpl implements CartService  {
	@Resource
	CartMapper cartMapper;

	@Override
	public int insertCart(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
	   	System.out.println(id);
	       Cart cart=new Cart();
	   	System.out.println("插入成功");
	cart.setServiceId(id);
	cart.setBuyNum(1);
	cart.setUserId(request.getParameter("userid"));
		return cartMapper.insert(cart);
	}

	@Override
	public int updateBuynum(Cart cart, String id) {
		// TODO Auto-generated method stub
		CartExample cartExample = new CartExample();
		CartExample.Criteria criteria = cartExample.createCriteria();
		criteria.andServiceIdEqualTo(id);
		return cartMapper.updateByExampleSelective(cart, cartExample);
	}

	@Override
	public List<Cart> getcartid(HttpServletRequest request) {
		// TODO Auto-generated method stub
		CartExample cartExample = new CartExample();
		CartExample.Criteria criteria = cartExample.createCriteria();
		criteria.andUserIdEqualTo(request.getParameter("userid"));
		return cartMapper.selectByExample(cartExample);
	}

	@Override
	public List<Cart> getuid(String userid) {
		// TODO Auto-generated method stub
		CartExample cartExample = new CartExample();
		CartExample.Criteria criteria = cartExample.createCriteria();
		criteria.andUserIdEqualTo(userid);
		return cartMapper.selectByExample(cartExample);
	}

	@Override
	public int providerProductDelete(HttpServletRequest request) {
		// TODO Auto-generated method stub
String id=request.getParameter("id");
		
		CartExample cartExample=new CartExample();
		CartExample.Criteria criteria=cartExample.createCriteria();
		criteria.andServiceIdEqualTo(id);
		return cartMapper.deleteByExample(cartExample);
	}

	@Override
	public int updateBuynum1(Cart cart, HttpServletRequest request) {
		// TODO Auto-generated method stub
		CartExample cartExample = new CartExample();
		CartExample.Criteria criteria = cartExample.createCriteria();
		criteria.andServiceIdEqualTo(request.getParameter("id"));
		criteria.andUserIdEqualTo(request.getParameter("userid"));
		
		return cartMapper.updateByExampleSelective(cart, cartExample);
	}

	@Override
	public List<Cart> getcid(HttpServletRequest request) {
		// TODO Auto-generated method stub
		CartExample cartExample = new CartExample();
		CartExample.Criteria criteria = cartExample.createCriteria();
		criteria.andServiceIdEqualTo(request.getParameter("id"));
		criteria.andUserIdEqualTo(request.getParameter("userid"));
		System.out.println("用户名=="+request.getParameter("userid")+"=="+request.getParameter("id"));
		return cartMapper.selectByExample(cartExample);
	}
}
