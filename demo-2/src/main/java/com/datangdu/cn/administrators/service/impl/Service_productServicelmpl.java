package com.datangdu.cn.administrators.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.datangdu.cn.administrators.service.Service_productService;
import com.datangdu.cn.dao.mapper.ServiceProductMapper;
import com.datangdu.cn.model.service_product.ServiceProduct;
import com.datangdu.cn.model.service_product.ServiceProductExample;

@Service
public class Service_productServicelmpl implements Service_productService {
	@Resource
	ServiceProductMapper serviceProductMapper;
	@Override
	public List<ServiceProduct> getService_product() {
		// TODO Auto-generated method stub
		ServiceProductExample serviceProductExample = new ServiceProductExample();
		ServiceProductExample.Criteria criteria = serviceProductExample.createCriteria();
		
		return serviceProductMapper.selectByExample(serviceProductExample);
	}

	@Override
	public ServiceProduct selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKey(ServiceProduct user) {
		// TODO Auto-generated method stub
		return serviceProductMapper.updateByPrimaryKey(user);
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return serviceProductMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<ServiceProduct> selectByLike(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return serviceProductMapper.selectByLike(request.getParameter("text"));
	}

}
