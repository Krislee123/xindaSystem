package com.datangdu.cn.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.datangdu.cn.model.administrators_user.AdministratorsUser;
import com.datangdu.cn.model.administrators_user.AdministratorsUserExample;
@Mapper
public interface AdministratorsUserMapper {


	long countByExample(AdministratorsUserExample example);

    int deleteByExample(AdministratorsUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(AdministratorsUser record);

    int insertSelective(AdministratorsUser record);

    List<AdministratorsUser> selectByExampleWithBLOBs(AdministratorsUserExample example);

    List<AdministratorsUser> selectByExample(AdministratorsUserExample example);

    AdministratorsUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AdministratorsUser record, @Param("example") AdministratorsUserExample example);

    int updateByExampleWithBLOBs(@Param("record") AdministratorsUser record, @Param("example") AdministratorsUserExample example);

    int updateByExample(@Param("record") AdministratorsUser record, @Param("example") AdministratorsUserExample example);

    int updateByPrimaryKeySelective(AdministratorsUser record);

    int updateByPrimaryKeyWithBLOBs(AdministratorsUser record);

    int updateByPrimaryKey(AdministratorsUser record);
}