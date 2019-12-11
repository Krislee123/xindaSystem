package com.datangdu.cn.administrators.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.datangdu.cn.model.service_product.ServiceProduct;

public interface Service_productService {
public List<ServiceProduct> getService_product();
	
	public ServiceProduct selectByPrimaryKey(String id);
	
	public int updateByPrimaryKey(ServiceProduct user);
	
	public int deleteByPrimaryKey(String id);
	
	public List<ServiceProduct> selectByLike(HttpServletRequest request);
}
