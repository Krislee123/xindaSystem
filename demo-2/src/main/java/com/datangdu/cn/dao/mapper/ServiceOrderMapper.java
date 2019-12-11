package com.datangdu.cn.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.datangdu.cn.model.service_order.ServiceOrder;
import com.datangdu.cn.model.service_order.ServiceOrderExample;
@Mapper
public interface ServiceOrderMapper {
	long countByExample(ServiceOrderExample example);

	int deleteByExample(ServiceOrderExample example);

	int deleteByPrimaryKey(String serviceNo);

	int insert(ServiceOrder record);

	int insertSelective(ServiceOrder record);

	List<ServiceOrder> selectByExample(ServiceOrderExample example);
	
	List<ServiceOrder> selectByLike(String name);	//模糊查询
	
	List<ServiceOrder> selectByLike2(ServiceOrderExample example);	//模糊查询
	
	List<ServiceOrder> selectByLike5(ServiceOrderExample example);	//模糊查询
	
	List<ServiceOrder> selectBypaging(ServiceOrderExample example);	//分页模糊查询
	
	List<ServiceOrder> selectBytime(ServiceOrderExample example);	//
	
	List<ServiceOrder> selectBytimepage(ServiceOrderExample example);	//
	
	List<ServiceOrder> selectByorderform(ServiceOrderExample example);	//
	
	List<ServiceOrder> selectByorderformpage(ServiceOrderExample example);	//

	ServiceOrder selectByPrimaryKey(String serviceNo);

	int updateByExampleSelective(@Param("record") ServiceOrder record, @Param("example") ServiceOrderExample example);

	int updateByExample(@Param("record") ServiceOrder record, @Param("example") ServiceOrderExample example);

	int updateByPrimaryKeySelective(ServiceOrder record);

	int updateByPrimaryKey(ServiceOrder record);
}