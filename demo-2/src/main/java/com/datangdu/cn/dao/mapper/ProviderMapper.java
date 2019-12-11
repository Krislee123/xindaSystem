package com.datangdu.cn.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.datangdu.cn.model.provider.Provider;
import com.datangdu.cn.model.provider.ProviderExample;
@Mapper
public interface ProviderMapper {
    long countByExample(ProviderExample example);

	int deleteByExample(ProviderExample example);

	int deleteByPrimaryKey(String id);

	int insert(Provider record);

	int insertSelective(Provider record);

	List<Provider> selectByExample(ProviderExample example);
	
	List<Provider> selectByLike(ProviderExample example);	//模糊查询
	
	List<Provider> selectBypaging(ProviderExample example);	//分页模糊查询

	Provider selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Provider record, @Param("example") ProviderExample example);

	int updateByExample(@Param("record") Provider record, @Param("example") ProviderExample example);

	int updateByPrimaryKeySelective(Provider record);

	int updateByPrimaryKey(Provider record);
	
	int saveUserImg(Provider provider);

	int saveFileImg(Provider provider);
}