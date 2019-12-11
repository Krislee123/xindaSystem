package com.datangdu.cn.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.datangdu.cn.model.businessOrder.BusinessOrder;
import com.datangdu.cn.model.businessOrder.BusinessOrderExample;
@Mapper
public interface BusinessOrderMapper {
	long countByExample(BusinessOrderExample example);

    int deleteByExample(BusinessOrderExample example);

    int deleteByPrimaryKey(Integer bId);

    int insert(BusinessOrder record);

    int insertSelective(BusinessOrder record);

    List<BusinessOrder> selectByExample(BusinessOrderExample example);
    
    List<BusinessOrder> findPname(BusinessOrderExample example);

    BusinessOrder selectByPrimaryKey(Integer bId);

    int updateByExampleSelective(@Param("record") BusinessOrder record, @Param("example") BusinessOrderExample example);

    int updateByExample(@Param("record") BusinessOrder record, @Param("example") BusinessOrderExample example);

    int updateByPrimaryKeySelective(BusinessOrder record);

    int updateByPrimaryKey(BusinessOrder record);

	
}