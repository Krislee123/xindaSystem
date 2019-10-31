package com.datangdu.cn.service.lmpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.datangdu.cn.dao.mapper.ProductMapper;
import com.datangdu.cn.model.product.Product;
import com.datangdu.cn.model.product.ProductExample;
import com.datangdu.cn.service.ProductService;

@Service
public class ProductServicelmpl implements  ProductService{
	@Resource
	ProductMapper productMapper;

	@Override
	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		  ProductExample productExample=new ProductExample();
		  productExample.setName(name);
		  return productMapper.findByName(productExample);
	}

	@Override
	public int insert(Product record) {
		// TODO Auto-generated method stub
		return productMapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return productMapper.deleteByPrimaryKey(id);
	}
	
}
