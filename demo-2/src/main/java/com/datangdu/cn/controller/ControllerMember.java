package com.datangdu.cn.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datangdu.cn.model.member.Member;
import com.datangdu.cn.model.region.Region;
import com.datangdu.cn.zservice.MemberService;
import com.datangdu.cn.zservice.RegionService;

@Controller
@RequestMapping("/ec")
public class ControllerMember {
	@Resource
	RegionService rService;
	@Resource
	MemberService mService;
	
	@ResponseBody		//得到省
	@RequestMapping(value="/sheng",method = RequestMethod.POST)
	public Map<String,Object> getsheng(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();
		List<Region> sheng = rService.getLevel((short) 1);
		map.put("sheng", sheng);
		System.out.println("省id=="+sheng.get(0).getId());

		return map;
	}
	
	@ResponseBody		//得到市
	@RequestMapping(value="/shi",method = RequestMethod.POST)
	public Map<String,Object> getshi(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();
		System.out.println("选择的省id=="+request.getParameter("id"));
		List<Region> shi = rService.getshi(request.getParameter("id"));
		map.put("shi", shi);
		System.out.println("市id=="+shi.get(0).getId());
		return map;
	}
	
	
	@ResponseBody		//得到区
	@RequestMapping(value="/qu",method = RequestMethod.POST)
	public Map<String,Object> getqu(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();
		System.out.println("选择的市id=="+request.getParameter("id"));
		List<Region> qu = rService.getshi(request.getParameter("id"));
		map.put("qu", qu);
		System.out.println("区id=="+qu.get(0).getId());
		return map;
	}
	
	@ResponseBody		//注册
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public Map<String,Object> register(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();
		if(request.getParameter("cellphone").isEmpty()) {
			map.put("msg","输入手机号" );
			return map;
		}
		if(request.getParameter("password").isEmpty()) {
			map.put("msg","输入密码" );
			return map;
		}
		if(request.getParameter("code").isEmpty()) {
			map.put("msg","输入验证码" );
			return map;
		}
		HttpSession session = request.getSession();
		System.out.println("验证码"+session.getAttribute("code"));
		if(!session.getAttribute("code").equals(request.getParameter("code"))) {
			map.put("msg","验证码错误" );
			return map;
		}
		
		List<Member> member=mService.getcellphone(request.getParameter("cellphone"));
		if(!member.isEmpty()) {
			map.put("msg","手机号已存在" );
			return map;
		}
		int a = mService.register(request);		
		System.out.println("插入成功"+a);
		map.put("msg", "注册成功");
		map.put("status", 1);
		return map;
	}
	
	//用户找回密码
	@ResponseBody
	@RequestMapping(value = "/findpassword",method = RequestMethod.POST)
	public Map <String,Object> findPassword(HttpServletRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();
		Member member=new Member();
		
		if(request.getParameter("cellphone").isEmpty()) {
			map.put("msg","输入手机号" );
			return map;
		}
		if(request.getParameter("code").isEmpty()) {
			map.put("msg","输入验证码" );
			return map;
		}
		if(request.getParameter("password1").isEmpty()) {
			map.put("msg","输入密码" );
			return map;
		}
		if(request.getParameter("password2").isEmpty()) {
			map.put("msg","再输入密码" );
			return map;
		}
		if(!request.getParameter("password1").equals(request.getParameter("password2"))) {
			map.put("msg","两次密码不一致");
			return map;
		}
		member.setCellphone(request.getParameter("cellphone"));
		member.setPassword(MD5Util.getMD5(request.getParameter("password1").getBytes()));
		int a=mService.updatepassword(member, request);
		System.out.println("修改密码5"+a);
		map.put("stu", a);
		if(a==1) {
		map.put("msg", "修改成功");
		}else {
			map.put("msg", "账号不存在");
		}
		return map;
	}
	
}
