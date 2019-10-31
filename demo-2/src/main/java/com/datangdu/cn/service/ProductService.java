package com.datangdu.cn.service;

import java.util.List;

import com.datangdu.cn.model.product.Product;


public interface ProductService {
	 List<Product> findByName(String name);
		int insert(Product record);
		int deleteByPrimaryKey(Integer id);
}
