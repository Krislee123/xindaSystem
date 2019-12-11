package com.datangdu.cn.zservice.lmpl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.datangdu.cn.dao.mapper.ProviderProductMapper;
import com.datangdu.cn.model.provider_product.ProviderProduct;
import com.datangdu.cn.model.provider_product.ProviderProductExample;
import com.datangdu.cn.zservice.ProviderProductService;

@Service
public class ProviderProductServicelmpl implements ProviderProductService {
	@Resource
	ProviderProductMapper providerProductMapper;
	//查询所有产品
	@Override
	public List<ProviderProduct> getpp() {
		ProviderProductExample providerProductExample = new ProviderProductExample();
		ProviderProductExample.Criteria criteria = providerProductExample.createCriteria();
		System.out.println("查询结果几条==="+providerProductMapper.selectByExample(providerProductExample).size());
		return providerProductMapper.selectByExample(providerProductExample);
	}
	
	//通过产品id查
	@Override
	public List<ProviderProduct> getid(String id) {
		ProviderProductExample providerProductExample = new ProviderProductExample();
		ProviderProductExample.Criteria criteria = providerProductExample.createCriteria();
		criteria.andIdEqualTo(id);
		return providerProductMapper.selectByExample(providerProductExample);
	}
	
	//模糊查询
		@Override
		public List<ProviderProduct> select(HttpServletRequest request) {
			List<ProviderProduct> pp=providerProductMapper.selectByLike(request.getParameter("name"));
			return pp;
		}
		@Override
		public List<ProviderProduct> select2(HttpServletRequest request) {
			ProviderProductExample providerProductExample = new ProviderProductExample();
			ProviderProductExample.Criteria criteria = providerProductExample.createCriteria();
			providerProductExample.setOrderByClause(request.getParameter("index"));
			System.out.println("cs"+providerProductExample.getOrderByClause());
			providerProductExample.setLikeName(request.getParameter("name"));
			return providerProductMapper.selectByAll2(providerProductExample);
		}
		
	
	@Override		//修改状态为2下线
	public int xx(ProviderProduct pp,String id) {
		ProviderProductExample providerProductExample = new ProviderProductExample();
		ProviderProductExample.Criteria criteria = providerProductExample.createCriteria();
		criteria.andIdEqualTo(id);
		pp.setStatus(2);
		return providerProductMapper.updateByExampleSelective(pp, providerProductExample);
	}

	@Override		//修改状态为1上线
	public int sx(ProviderProduct pp,String id) {
		ProviderProductExample providerProductExample = new ProviderProductExample();
		ProviderProductExample.Criteria criteria = providerProductExample.createCriteria();
		criteria.andIdEqualTo(id);
		pp.setStatus(1);
		return providerProductMapper.updateByExampleSelective(pp, providerProductExample);
	}

	
	//查询所有商品
	@Override
	public List<ProviderProduct> getProviderProductInfoById(HttpServletRequest request) {
		// TODO Auto-generated method stub
		System.out.println(123546);
		
		ProviderProductExample providerProductExample = new ProviderProductExample();
		ProviderProductExample.Criteria criteria = providerProductExample.createCriteria();
		providerProductExample.setOrderByClause(request.getParameter("index"));
		System.out.println("查询结果几条==="+providerProductMapper.selectByExample(providerProductExample).size());
		return providerProductMapper.selectByExample(providerProductExample);
	}
	
	public int del(HttpServletRequest request) {
		ProviderProductExample providerProductExample = new ProviderProductExample();
		ProviderProductExample.Criteria criteria = providerProductExample.createCriteria();
		System.out.println("1444");
		criteria.andIdEqualTo(request.getParameter("id"));
		return providerProductMapper.deleteByExample(providerProductExample);
	}
	
	//////////////////////////////////////////////////////////
	//运营优质推荐页面查询
	@Override
	public List<ProviderProduct> selectAll(HttpServletRequest request) {
		// TODO Auto-generated method stub
		ProviderProductExample providerProductExample = new ProviderProductExample();
		ProviderProductExample.Criteria criteria = providerProductExample.createCriteria();
		providerProductExample.setOrderByClause(request.getParameter("index"));
		System.out.println("cs"+providerProductExample.getOrderByClause());
		providerProductExample.setLikeName(request.getParameter("name"));
		return providerProductMapper.selectByAll(providerProductExample);
	}
	
	//运营优质推荐页面查询分页
		@Override
		public List<ProviderProduct> selectpaging(HttpServletRequest request) {
			// TODO Auto-generated method stub
			ProviderProductExample providerProductExample = new ProviderProductExample();
			ProviderProductExample.Criteria criteria = providerProductExample.createCriteria();
			providerProductExample.setOrderByClause(request.getParameter("index"));
			providerProductExample.setLikeName(request.getParameter("name"));
			providerProductExample.setPageSize((Integer.valueOf(request.getParameter("pageSize"))-1)*2);
			System.out.println("getPageSize"+providerProductExample.getPageSize());
			providerProductExample.setPageNum(Integer.valueOf(request.getParameter("pageNum")));
			System.out.println("getPageNum"+providerProductExample.getPageNum());
			return providerProductMapper.selectBypaging(providerProductExample);
		}
	
		@Override		//是否推荐服务
		public int check1(HttpServletRequest request) {
			ProviderProduct pp=new ProviderProduct();
			pp.setId(request.getParameter("id"));
			if(request.getParameter("a").equals("1")) {
			pp.setRecommend(2);}else {
				pp.setRecommend(1);
			}
			return providerProductMapper.updateByPrimaryKeySelective(pp);
		}
		
		@Override		//是否创业必备
		public int check2(HttpServletRequest request) {
			ProviderProduct pp=new ProviderProduct();
			System.out.println("1444");
			pp.setId(request.getParameter("id"));
			if(request.getParameter("b").equals("1")) {
			pp.setHighQuality(2);
			}else {
				pp.setHighQuality(1);
			}
			System.out.println("125");
			return providerProductMapper.updateByPrimaryKeySelective(pp);
		}
		
		@Override
		public ProviderProduct getUserInfo(String id) {
			return providerProductMapper.selectByPrimaryKey(id);
		}
		@Override
		public int update2(ProviderProduct pp) {
			return providerProductMapper.updateByPrimaryKeySelective(pp);
		}
}
