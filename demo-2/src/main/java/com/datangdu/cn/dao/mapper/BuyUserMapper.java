package com.datangdu.cn.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.datangdu.cn.model.buy_user.BuyUser;
import com.datangdu.cn.model.buy_user.BuyUserExample;
@Mapper
public interface BuyUserMapper {
  
    long countByExample(BuyUserExample example);

    int deleteByExample(BuyUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(BuyUser record);

    int insertSelective(BuyUser record);

    List<BuyUser> selectByExampleWithBLOBs(BuyUserExample example);

    List<BuyUser> selectByExample(BuyUserExample example);
    
    List<BuyUser> selectByLike(String name, BuyUserExample example);

    BuyUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BuyUser record, @Param("example") BuyUserExample example);

    int updateByExampleWithBLOBs(@Param("record") BuyUser record, @Param("example") BuyUserExample example);

    int updateByExample(@Param("record") BuyUser record, @Param("example") BuyUserExample example);

    int updateByPrimaryKeySelective(BuyUser record);

    int updateByPrimaryKeyWithBLOBs(BuyUser record);

    int updateByPrimaryKey(BuyUser record);
}