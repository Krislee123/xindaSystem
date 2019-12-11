package com.datangdu.cn.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.datangdu.cn.model.cart.Cart;
import com.datangdu.cn.model.cart.CartExample;
@Mapper
public interface CartMapper {

	long countByExample(CartExample example);

	int deleteByExample(CartExample example);

	int insert(Cart record);

	int insertSelective(Cart record);

	List<Cart> selectByExample(CartExample example);

	int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

	int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);

}