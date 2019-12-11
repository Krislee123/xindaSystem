package com.datangdu.cn.zservice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.datangdu.cn.model.member.Member;

public interface MemberService {
	public List<Member> getList();
	public List<Member> getMember(String id);
	public int register(HttpServletRequest request);
	List<Member> getcellphone(String id);
	public int updatepassword(Member member,HttpServletRequest request);
	public List<Member> getMemberInfoById(HttpServletRequest request);
	List<Member> selectpaging(HttpServletRequest request);
	List<Member> select(HttpServletRequest request);

	public int updatepassword1(Member member,HttpServletRequest request);

	public Member getUserInfo(String id);
	int updatexx(HttpServletRequest request);
	public void saveUserImg(Member member) throws Exception;
	int update2(Member m);
	Member select2(String m);
}
