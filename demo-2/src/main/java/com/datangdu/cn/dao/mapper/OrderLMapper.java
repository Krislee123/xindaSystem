package com.datangdu.cn.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.datangdu.cn.model.order.OrderL;
import com.datangdu.cn.model.order.OrderLExample;
@Mapper
public interface OrderLMapper {
    
	  long countByExample(OrderLExample example);

	    int deleteByExample(OrderLExample example);

	    int deleteByPrimaryKey(String id);

	    int insert(OrderL record);

	    int insertSelective(OrderL record);

	    List<OrderL> selectByExample(OrderLExample example);
	    
	    List<OrderL> selectByLike(String name, OrderLExample example);

	    OrderL selectByPrimaryKey(String id);

	    int updateByExampleSelective(@Param("record") OrderL record, @Param("example") OrderLExample example);

	    int updateByExample(@Param("record") OrderL record, @Param("example") OrderLExample example);

	    int updateByPrimaryKeySelective(OrderL record);

	    int updateByPrimaryKey(OrderL record);
	    
	    List<OrderL> selectByDate(String startdate, String enddate,OrderLExample example);
	    
	    List<OrderL> selectByDate1(String startdate, String enddate);
}