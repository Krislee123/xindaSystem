package com.datangdu.cn.service;

import java.util.List;

import com.datangdu.cn.model.product_user.ProductUser;
import com.datangdu.cn.model.product_user.ProductUserExample;

public interface ProductUserService {
	   List<ProductUser> selectByExample(ProductUserExample example);
}
