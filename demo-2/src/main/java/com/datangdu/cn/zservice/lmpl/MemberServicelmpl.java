package com.datangdu.cn.zservice.lmpl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.datangdu.cn.controller.MD5Util;
import com.datangdu.cn.dao.mapper.MemberMapper;
import com.datangdu.cn.model.member.Member;
import com.datangdu.cn.model.member.MemberExample;
import com.datangdu.cn.zservice.MemberService;

@Service
public class MemberServicelmpl implements MemberService {
	@Resource
	MemberMapper memberMapper;
	@Override
	public List<Member> getList() {
		// TODO Auto-generated method stub
		MemberExample memberExample = new MemberExample();
		MemberExample.Criteria criteria = memberExample.createCriteria();
		return memberMapper.selectByExample(memberExample);
	}

	@Override
	public List<Member> getMember(String id) {
		// TODO Auto-generated method stub
		MemberExample memberExample = new MemberExample();
		MemberExample.Criteria criteria = memberExample.createCriteria();
		criteria.andIdEqualTo(id);
		return memberMapper.selectByExample(memberExample);
	}

	@Override
	public int register(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		System.out.println("id=="+uuid);
		Member m=new Member();
		System.out.println("手机号"+request.getParameter("cellphone"));
		System.out.println("密码"+request.getParameter("password"));

		java.sql.Date ctime = new java.sql.Date(new java.util.Date().getTime());

		m.setRegisterTime(ctime);
		m.setId(uuid);
		m.setName(request.getParameter("cellphone"));
		m.setCellphone(request.getParameter("cellphone"));
		m.setPassword(MD5Util.getMD5(request.getParameter("password").getBytes()));
		m.setStatus(1);
		m.setBuyNum(0);
		m.setTotalPrice(0);
		m.setRegionId(request.getParameter("qu"));
		return memberMapper.insert(m);
	}

	@Override
	public List<Member> getcellphone(String id) {
		// TODO Auto-generated method stub
		MemberExample memberExample = new MemberExample();
		MemberExample.Criteria criteria = memberExample.createCriteria();
		criteria.andCellphoneEqualTo(id);
		return memberMapper.selectByExample(memberExample);
	}

	@Override
	public int updatepassword(Member member, HttpServletRequest request) {
		// TODO Auto-generated method stub
		MemberExample memberExample = new MemberExample();
		MemberExample.Criteria criteria = memberExample.createCriteria();
		criteria.andCellphoneEqualTo(request.getParameter("cellphone"));
		return memberMapper.updateByExampleSelective(member, memberExample);
	}

	@Override
	public List<Member> getMemberInfoById(HttpServletRequest request) {
		// TODO Auto-generated method stub
		System.out.println("查询前");
		System.out.println("输入的手机号=="+request.getParameter("cellphone"));
		System.out.println("输入的密码=="+request.getParameter("password"));
		MemberExample memberExample = new MemberExample();
		MemberExample.Criteria criteria = memberExample.createCriteria();
		criteria.andCellphoneEqualTo(request.getParameter("cellphone"));
		criteria.andPasswordEqualTo(request.getParameter("password"));
		System.out.println("查询结束");
		return memberMapper.selectByExample(memberExample);
	}

	@Override
	public List<Member> selectpaging(HttpServletRequest request) {
		// TODO Auto-generated method stub
		MemberExample memberExample = new MemberExample();
		MemberExample.Criteria criteria = memberExample.createCriteria();
		memberExample.setLikeName(request.getParameter("name"));
		memberExample.setPageSize((Integer.valueOf(request.getParameter("pageSize"))-1)*2);
		System.out.println("getPageSize"+memberExample.getPageSize());
		memberExample.setPageNum(Integer.valueOf(request.getParameter("pageNum")));
		System.out.println("getPageNum"+memberExample.getPageNum());
		return memberMapper.selectBypaging(memberExample);
	}

	@Override
	public List<Member> select(HttpServletRequest request) {
		// TODO Auto-generated method stub
		MemberExample memberExample = new MemberExample();
		MemberExample.Criteria criteria = memberExample.createCriteria();
		memberExample.setLikeName(request.getParameter("name"));
		return memberMapper.selectByLike(memberExample);
	}

	@Override
	public int updatepassword1(Member member, HttpServletRequest request) {
		// TODO Auto-generated method stub
		MemberExample memberExample = new MemberExample();
		MemberExample.Criteria criteria = memberExample.createCriteria();
		criteria.andIdEqualTo(request.getParameter("userid"));
		criteria.andPasswordEqualTo(MD5Util.getMD5(request.getParameter("password").getBytes()));
		return memberMapper.updateByExampleSelective(member, memberExample);
	}

	@Override
	public Member getUserInfo(String id) {
		// TODO Auto-generated method stub
		return memberMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updatexx(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Member member=new Member();
		member.setId(request.getParameter("userid"));
		member.setName(request.getParameter("name"));
		member.setEmail(request.getParameter("email"));
		member.setGender(Integer.valueOf(request.getParameter("sex")));
		return memberMapper.updateByPrimaryKeySelective(member);
	}

	@Override
	public void saveUserImg(Member member) throws Exception {
		// TODO Auto-generated method stub
		int i = memberMapper.saveUserImg(member);
		if(i!=1) {
			throw new Exception("更新用户头像失败");
		}
	}

	@Override
	public int update2(Member m) {
		// TODO Auto-generated method stub
		return memberMapper.updateByPrimaryKeySelective(m);
	}

	@Override
	public Member select2(String m) {
		// TODO Auto-generated method stub
		return memberMapper.selectByPrimaryKey(m);
	}

}
