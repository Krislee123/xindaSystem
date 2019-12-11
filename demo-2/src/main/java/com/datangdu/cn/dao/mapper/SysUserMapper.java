package com.datangdu.cn.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.datangdu.cn.model.sys_user.SysUser;
import com.datangdu.cn.model.sys_user.SysUserExample;
@Mapper
public interface SysUserMapper {
	 long countByExample(SysUserExample example);

	    int deleteByExample(SysUserExample example);

	    int deleteByPrimaryKey(String id);

	    int insert(SysUser record);

	    int insertSelective(SysUser record);

	    List<SysUser> selectByExampleWithBLOBs(SysUserExample example);

	    List<SysUser> selectByExample(SysUserExample example);

	    SysUser selectByPrimaryKey(String id);

	    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

	    int updateByExampleWithBLOBs(@Param("record") SysUser record, @Param("example") SysUserExample example);

	    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

	    int updateByPrimaryKeySelective(SysUser record);

	    int updateByPrimaryKeyWithBLOBs(SysUser record);

	    int updateByPrimaryKey(SysUser record);
}