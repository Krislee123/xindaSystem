package com.datangdu.cn.zservice.lmpl;



import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.datangdu.cn.dao.mapper.ProviderMapper;
import com.datangdu.cn.model.provider.Provider;
import com.datangdu.cn.model.provider.ProviderExample;
import com.datangdu.cn.zservice.ProviderService;

@Service
public class ProviderServicelmpl implements  ProviderService {
	@Resource
	ProviderMapper providerMapper;
	@Override
	public List<Provider> getList() {
		// TODO Auto-generated method stub
		ProviderExample providerExample = new ProviderExample();
		ProviderExample.Criteria criteria = providerExample.createCriteria();
		criteria.andStatusEqualTo(1);
		return providerMapper.selectByExample(providerExample);
	}

	@Override
	public List<Provider> select(HttpServletRequest request) {
		// TODO Auto-generated method stub
		ProviderExample providerExample = new ProviderExample();
		ProviderExample.Criteria criteria = providerExample.createCriteria();
		providerExample.setLikeName(request.getParameter("name"));
		providerExample.setStatus(Integer.valueOf(request.getParameter("index")));
		return providerMapper.selectByLike(providerExample);
	}

	@Override
	public List<Provider> selectpaging(HttpServletRequest request) {
		// TODO Auto-generated method stub
		ProviderExample providerExample = new ProviderExample();
		ProviderExample.Criteria criteria = providerExample.createCriteria();
		providerExample.setStatus(Integer.valueOf(request.getParameter("index")));
		providerExample.setLikeName(request.getParameter("name"));
		providerExample.setPageSize((Integer.valueOf(request.getParameter("pageSize"))-1)*2);
		System.out.println("getPageSize"+providerExample.getPageSize());
		providerExample.setPageNum(Integer.valueOf(request.getParameter("pageNum")));
		System.out.println("getPageNum"+providerExample.getPageNum());
		return providerMapper.selectBypaging(providerExample);
	}

	@Override
	public List<Provider> getList2() {
		// TODO Auto-generated method stub
		ProviderExample providerExample = new ProviderExample();
		ProviderExample.Criteria criteria = providerExample.createCriteria();
		criteria.andStatusEqualTo(2);
		return providerMapper.selectByExample(providerExample);
	}

	@Override
	public int starstop(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Provider p = new Provider();
		p.setId(request.getParameter("id"));
		if(request.getParameter("status").equals("1")) {
			p.setStatus(2);
		}else{
			p.setStatus(1);
		}
		return providerMapper.updateByPrimaryKeySelective(p);
	}
	}

	

