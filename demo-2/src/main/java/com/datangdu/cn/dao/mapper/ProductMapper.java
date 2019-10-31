package com.datangdu.cn.dao.mapper;

import com.datangdu.cn.model.product.Product;
import com.datangdu.cn.model.product.ProductExample;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProductMapper {
    long countByExample(ProductExample example);

	int deleteByExample(ProductExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Product record);

	int insertSelective(Product record);

	List<Product> selectByExample(ProductExample example);
	List<Product> findByName( ProductExample example);

	Product selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

	int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

	int updateByPrimaryKeySelective(Product record);

	int updateByPrimaryKey(Product record);

	
}