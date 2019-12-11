package com.datangdu.cn.service.lmpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.datangdu.cn.dao.mapper.ProductUserMapper;
import com.datangdu.cn.model.product_user.ProductUser;
import com.datangdu.cn.model.product_user.ProductUserExample;
import com.datangdu.cn.model.product_user.ProductUserWithBLOBs;
import com.datangdu.cn.service.LoginService;
import com.datangdu.cn.service.ProductUserService;
import com.datangdu.cn.service.RegisterService;

@Service
public class ProductUserServicelmpl implements LoginService, ProductUserService, RegisterService {
	@Resource
	ProductUserMapper productuserMapper;

	@Override
	public List<ProductUser> Login(String tel) {// 登录

		ProductUserExample productUserExample = new ProductUserExample();
		ProductUserExample.Criteria criteria = productUserExample.createCriteria();
		criteria.andTelEqualTo(tel);// 对比手机号

		return productuserMapper.selectByExample(productUserExample);
	}

	@Override
	public int repassword(ProductUser record) {// 修改密码
		// TODO Auto-generated method stub

		return productuserMapper.repassword(record);
	}

	@Override
	public int register(ProductUser record) {// 注册
		// TODO Auto-generated method stub
		return productuserMapper.register(record);
	}

	@Override
	public ProductUser selectByTel(String tel) {//查询店铺信息
		// TODO Auto-generated method stub
		ProductUserExample productExample = new ProductUserExample();
		productExample.setTel(tel);
		return productuserMapper.selectByTel(productExample);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(ProductUserWithBLOBs record) {//修改用户登录信息
		return productuserMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public ProductUserWithBLOBs selectBytel(ProductUserWithBLOBs record) {//设置用户登录信息
		return productuserMapper.selectBytel(record);
	}

	@Override
	public int productHeadImg(ProductUserWithBLOBs record) {//修改头像
		return productuserMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public ProductUserWithBLOBs getUserImg(String tel) {//展示头像
		return productuserMapper.getUserImg(tel);
	}

}
