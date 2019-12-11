package com.datangdu.cn.zservice.lmpl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.datangdu.cn.dao.mapper.SysUserMapper;
import com.datangdu.cn.model.sys_user.SysUser;
import com.datangdu.cn.model.sys_user.SysUserExample;
import com.datangdu.cn.zservice.SysUserService;

@Service
public class SysUserServicelmpl implements SysUserService {
	@Resource
	SysUserMapper sysUserMapper;
	//登录
	@Override
	public List<SysUser> setUserLogin(HttpServletRequest request) {
		System.out.println("查询前");
		SysUserExample sysUserExample = new SysUserExample();
		SysUserExample.Criteria criteria = sysUserExample.createCriteria();
		criteria.andCellphoneEqualTo(request.getParameter("cellphone"));
		System.out.println("查询结束");
		return sysUserMapper.selectByExample(sysUserExample);
	}
	
	
	
	//修改密码
	public int updatepassword(SysUser su,HttpServletRequest request) {
		SysUserExample sysUserExample = new SysUserExample();
		SysUserExample.Criteria criteria = sysUserExample.createCriteria();
		criteria.andCellphoneEqualTo(request.getParameter("cellphone"));
		return sysUserMapper.updateByExampleSelective(su, sysUserExample);
	}



	@Override
	public SysUser getUserInfo(String id) {
		// TODO Auto-generated method stub
		return sysUserMapper.selectByPrimaryKey(id);
	}
}
