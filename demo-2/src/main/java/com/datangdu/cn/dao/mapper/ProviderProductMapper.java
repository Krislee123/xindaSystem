package com.datangdu.cn.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.datangdu.cn.model.provider_product.ProviderProduct;
import com.datangdu.cn.model.provider_product.ProviderProductExample;
@Mapper
public interface ProviderProductMapper {
	long countByExample(ProviderProductExample example);

	int deleteByExample(ProviderProductExample example);

	int deleteByPrimaryKey(String id);

	int insert(ProviderProduct record);

	int insertSelective(ProviderProduct record);

	List<ProviderProduct> selectByExample(ProviderProductExample example);
	
	List<ProviderProduct> selectByLike(String name);	//模糊查询
	
	
	List<ProviderProduct> selectByAll(ProviderProductExample example);	//排序
	
	List<ProviderProduct> selectByAll2(ProviderProductExample example);	//排序
	
	List<ProviderProduct> selectBypaging(ProviderProductExample example);	//排序分页

	ProviderProduct selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") ProviderProduct record,
			@Param("example") ProviderProductExample example);

	int updateByExample(@Param("record") ProviderProduct record, @Param("example") ProviderProductExample example);

	int updateByPrimaryKeySelective(ProviderProduct record);

	int updateByPrimaryKey(ProviderProduct record);

	int saveServiceImg(ProviderProduct providerProduct);

	List<ProviderProduct> selectByLikeProductId(String id);
}