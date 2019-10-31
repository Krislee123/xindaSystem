package com.datangdu.cn.dao.mapper;

import com.datangdu.cn.model.product_user.ProductUser;
import com.datangdu.cn.model.product_user.ProductUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProductUserMapper {
    long countByExample(ProductUserExample example);

    int deleteByExample(ProductUserExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(ProductUser record);

    int insertSelective(ProductUser record);

    List<ProductUser> selectByExample(ProductUserExample example);

    List<ProductUser> Login(ProductUserExample example);

    
    ProductUser selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") ProductUser record, @Param("example") ProductUserExample example);

    int updateByExample(@Param("record") ProductUser record, @Param("example") ProductUserExample example);

    int updateByPrimaryKeySelective(ProductUser record);

    int updateByPrimaryKey(ProductUser record);
}