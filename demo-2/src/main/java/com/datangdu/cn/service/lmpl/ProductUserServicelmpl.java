package com.datangdu.cn.service.lmpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.datangdu.cn.dao.mapper.ProductUserMapper;
import com.datangdu.cn.model.product_user.ProductUser;
import com.datangdu.cn.model.product_user.ProductUserExample;
import com.datangdu.cn.service.LoginService;
@Service
public class ProductUserServicelmpl implements LoginService{
	@Resource
	ProductUserMapper productuserMapper;
	
	@Override
	public List<ProductUser> Login(String tel) {
		System.out.println("impl tel"+tel);
		// TODO Auto-generated method stub
		ProductUserExample productUserExample=new ProductUserExample();
		ProductUserExample.Criteria criteria=productUserExample.createCriteria();		
		criteria.andTelEqualTo(tel);
		
		return productuserMapper.selectByExample(productUserExample);
	}

}
