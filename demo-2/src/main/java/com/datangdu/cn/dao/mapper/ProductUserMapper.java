package com.datangdu.cn.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.datangdu.cn.model.product_user.ProductUser;
import com.datangdu.cn.model.product_user.ProductUserExample;
import com.datangdu.cn.model.product_user.ProductUserWithBLOBs;
@Mapper
public interface ProductUserMapper {
    long countByExample(ProductUserExample example);

    int deleteByExample(ProductUserExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(ProductUserWithBLOBs record);

    int insertSelective(ProductUserWithBLOBs record);

    List<ProductUserWithBLOBs> selectByExampleWithBLOBs(ProductUserExample example);

    List<ProductUser>selectByExample(ProductUserExample example);
List<ProductUser> Login(ProductUserExample example);
    

    
    public int repassword(ProductUser record);
    ProductUserWithBLOBs selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") ProductUserWithBLOBs record, @Param("example") ProductUserExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductUserWithBLOBs record, @Param("example") ProductUserExample example);

    int updateByExample(@Param("record") ProductUser record, @Param("example") ProductUserExample example);

    int updateByPrimaryKeySelective(ProductUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProductUserWithBLOBs record);

    int updateByPrimaryKey(ProductUser record);
}