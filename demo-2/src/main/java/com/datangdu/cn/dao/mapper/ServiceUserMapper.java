package com.datangdu.cn.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.datangdu.cn.model.service_user.ServiceUser;
import com.datangdu.cn.model.service_user.ServiceUserExample;
import com.datangdu.cn.model.service_user.ServiceUserWithBLOBs;

@Mapper
public interface ServiceUserMapper {

	long countByExample(ServiceUserExample example);

	int deleteByExample(ServiceUserExample example);

	int deleteByPrimaryKey(String id);

	int insert(ServiceUserWithBLOBs record);

	int insertSelective(ServiceUserWithBLOBs record);

	List<ServiceUserWithBLOBs> selectByExampleWithBLOBs(ServiceUserExample example);

	List<ServiceUser> selectByExample(ServiceUserExample example);

	List<ServiceUser> selectByLike(
			@Param("name")String name, @Param("example")ServiceUserExample example);

	ServiceUserWithBLOBs selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") ServiceUserWithBLOBs record,
			@Param("example") ServiceUserExample example);

	int updateByExampleWithBLOBs(@Param("record") ServiceUserWithBLOBs record,
			@Param("example") ServiceUserExample example);

	int updateByExample(@Param("record") ServiceUser record, @Param("example") ServiceUserExample example);

	int updateByPrimaryKeySelective(ServiceUserWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(ServiceUserWithBLOBs record);

	int updateByPrimaryKey(ServiceUser record);

	List<ServiceUser> selectByState(String state);

	List<ServiceUser> selectById(String id);
}