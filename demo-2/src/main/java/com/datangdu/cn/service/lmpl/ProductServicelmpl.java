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
	public List<Product> findByName(String name) {//模糊查询
		// TODO Auto-generated method stub
		  ProductExample productExample=new ProductExample();
		  productExample.setName(name);
		  return productMapper.findByName(productExample);
	}
	@Override
	public int insert(Product record) {//添加服务商
		// TODO Auto-generated method stub
		return productMapper.insert(record);
	}
	@Override
	public int deleteByPrimaryKey(Integer id) {//按主键id删除
		// TODO Auto-generated method stub
		return productMapper.deleteByPrimaryKey(id);
	}
	@Override
	public int updateByPrimaryKey(Product record) {//修改服务商信息
		// TODO Auto-generated method stub
		return productMapper.updateByPrimaryKey(record);
	}
	@Override
	public Product selectByPrimaryKey(Integer id) {//修改信息前先查询
		// TODO Auto-generated method stub
		return productMapper.selectByPrimaryKey(id);
	}
	
}
