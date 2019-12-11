package com.datangdu.cn.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.datangdu.cn.model.member.Member;
import com.datangdu.cn.model.member.MemberExample;
@Mapper
public interface MemberMapper {
	long countByExample(MemberExample example);

	int deleteByExample(MemberExample example);

	int deleteByPrimaryKey(String id);

	int insert(Member record);

	int insertSelective(Member record);

	List<Member> selectByExample(MemberExample example);
	
	List<Member> selectByLike(MemberExample example);	//模糊查询
	
	List<Member> selectBypaging(MemberExample example);	//分页模糊查询

	Member selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

	int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

	int updateByPrimaryKeySelective(Member record);

	int updateByPrimaryKey(Member record);
	
	int saveUserImg(Member record);
}