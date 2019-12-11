package com.datangdu.cn.zservice.lmpl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.datangdu.cn.dao.mapper.ServiceOrderMapper;
import com.datangdu.cn.model.service_order.ServiceOrder;
import com.datangdu.cn.model.service_order.ServiceOrderExample;
import com.datangdu.cn.zservice.ServiceOrderService;

@Service
public class ServiceOrderlmpl implements ServiceOrderService  {
	@Resource
	ServiceOrderMapper ServiceOrderMapper;
	@Override//查询服务订单
	public List<ServiceOrder> getso() {
		ServiceOrderExample serviceOrderExample = new ServiceOrderExample();
		ServiceOrderExample.Criteria criteria = serviceOrderExample.createCriteria();
		//System.out.println("查询结果几条==="+ServiceOrderMapper.selectByExample(serviceOrderExample).size());
		return ServiceOrderMapper.selectByExample(serviceOrderExample);
	}
	
	//模糊查询
	@Override
	public List<ServiceOrder> select(HttpServletRequest request){
		List<ServiceOrder> so=ServiceOrderMapper.selectByLike(request.getParameter("name"));
		return so;
	}
	
	


	@Override//费用中心查询
	public List<ServiceOrder> getpaylist(HttpServletRequest request) {
		ServiceOrderExample serviceOrderExample = new ServiceOrderExample();
		ServiceOrderExample.Criteria criteria = serviceOrderExample.createCriteria();
		serviceOrderExample.setStatus(2);
		return ServiceOrderMapper.selectByLike2(serviceOrderExample);
	}
	
	@Override
	public List<ServiceOrder> search(HttpServletRequest request){
		ServiceOrderExample serviceOrderExample = new ServiceOrderExample();
		ServiceOrderExample.Criteria criteria = serviceOrderExample.createCriteria();
		serviceOrderExample.setLikeName(request.getParameter("name"));
		serviceOrderExample.setMemberId(request.getParameter("userid"));
		if(!request.getParameter("data1").isEmpty()) {
			serviceOrderExample.setData1(request.getParameter("data1"));
		}else {
			serviceOrderExample.setData1("1970-01-01");
		}
		if(!request.getParameter("data2").isEmpty()) {
			serviceOrderExample.setData2(request.getParameter("data2"));
		}else {
			serviceOrderExample.setData2("3030-01-01");
		}
		List<ServiceOrder> so=ServiceOrderMapper.selectByLike5(serviceOrderExample);
		return so;
	}
	
	
	//通过用户userid查
	@Override
	public List<ServiceOrder> getuid(String userid) {	
		ServiceOrderExample serviceOrderExample = new ServiceOrderExample();
		ServiceOrderExample.Criteria criteria = serviceOrderExample.createCriteria();
		criteria.andMemberIdEqualTo(userid);
		return ServiceOrderMapper.selectByExample(serviceOrderExample);
	}
	
	
	//通过用户userid查
		@Override
		public List<ServiceOrder> getll(String userid) {	
			ServiceOrderExample serviceOrderExample = new ServiceOrderExample();
			ServiceOrderExample.Criteria criteria = serviceOrderExample.createCriteria();
			criteria.andMemberIdEqualTo(userid);
//			criteria.andStatusEqualTo(2);
			return ServiceOrderMapper.selectByExample(serviceOrderExample);
		}

		

	//将订单信息插入serviceorder表
	@Override
	public int insertServiceOrder(HttpServletRequest request) {
		// TODO Auto-generated method stub

	   	ServiceOrder serviceOrder=new ServiceOrder();
	   	System.out.println("插入成功");
	   	serviceOrder.setServiceNo(request.getParameter("nn"));
	   	serviceOrder.setMemberId(request.getParameter("userid"));
	   	serviceOrder.setServiceId(request.getParameter("str4")); 	
	   	serviceOrder.setTotalPrice(Integer.valueOf(request.getParameter("totalprice1")));
	   	serviceOrder.setStatus(1);
		serviceOrder.setPayType(0);
		java.sql.Date ctime = new java.sql.Date(new java.util.Date().getTime()); 
	   	serviceOrder.setCreateTime(ctime);
		return ServiceOrderMapper.insert(serviceOrder);
	}
	
	
	//修改支付类型
	@Override
	public int up(HttpServletRequest request){
		ServiceOrder serviceOrder=new ServiceOrder();
		serviceOrder.setServiceNo(request.getParameter("nn"));
		serviceOrder.setPayType(Integer.valueOf(request.getParameter("paytype")));
		serviceOrder.setStatus(2);
		int so=ServiceOrderMapper.updateByPrimaryKeySelective(serviceOrder);
		return so;
	}
	
	
	
	@Override//费用中心分页查询
	 public List<ServiceOrder> getpay(HttpServletRequest request) {
	  ServiceOrderExample serviceOrderExample = new ServiceOrderExample();
	  ServiceOrderExample.Criteria criteria = serviceOrderExample.createCriteria();
	  serviceOrderExample.setStatus(2);
	  serviceOrderExample.setPageSize((Integer.valueOf(request.getParameter("pageSize"))-1)*2);
	  System.out.println("getPageSize"+serviceOrderExample.getPageSize());
	  serviceOrderExample.setPageNum(Integer.valueOf(request.getParameter("pageNum")));
	  System.out.println("getPageNum"+serviceOrderExample.getPageNum());
	  return ServiceOrderMapper.selectBypaging(serviceOrderExample);
	 }
	
	

	//删除订单
	@Override
	public int pProductDelete(HttpServletRequest request) {

			// TODO Auto-generated method stub
			String serviceNo=request.getParameter("serviceNo");
			System.out.println(1111111111+serviceNo);
			ServiceOrderExample serviceOrderExample=new ServiceOrderExample();
			ServiceOrderExample.Criteria criteria=serviceOrderExample.createCriteria();
			criteria.andServiceNoEqualTo(serviceNo);
			return ServiceOrderMapper.deleteByExample(serviceOrderExample);
	}	

	
	//通过订单serciceNo查
			@Override
			public List<ServiceOrder> getmm(String serciceNo) {	
				ServiceOrderExample serviceOrderExample = new ServiceOrderExample();
				ServiceOrderExample.Criteria criteria = serviceOrderExample.createCriteria();
				criteria.andServiceNoEqualTo(serciceNo);
//				criteria.andStatusEqualTo(2);
				return ServiceOrderMapper.selectByExample(serviceOrderExample);
			}

	
	
	
	@Override//费用中心分页查询
	public List<ServiceOrder> gettime(HttpServletRequest request) {
		ServiceOrderExample serviceOrderExample = new ServiceOrderExample();
		ServiceOrderExample.Criteria criteria = serviceOrderExample.createCriteria();
		serviceOrderExample.setStatus(2);
		serviceOrderExample.setTime(Integer.valueOf(request.getParameter("time")));
		return ServiceOrderMapper.selectBytime(serviceOrderExample);
	}
	
	@Override//费用中心分页查询
	public List<ServiceOrder> gettimepage(HttpServletRequest request) {
		ServiceOrderExample serviceOrderExample = new ServiceOrderExample();
		ServiceOrderExample.Criteria criteria = serviceOrderExample.createCriteria();
		serviceOrderExample.setStatus(2);
		serviceOrderExample.setTime(Integer.valueOf(request.getParameter("time")));
		serviceOrderExample.setPageSize((Integer.valueOf(request.getParameter("pageSize"))-1)*2);
		System.out.println("getPageSize"+serviceOrderExample.getPageSize());
		serviceOrderExample.setPageNum(Integer.valueOf(request.getParameter("pageNum")));
		System.out.println("getPageNum"+serviceOrderExample.getPageNum());
		return ServiceOrderMapper.selectBytimepage(serviceOrderExample);
	}
	
	///////////////////////////////////////////////////////////////////////////服务商订单
	@Override
	public List<ServiceOrder> getlist(HttpServletRequest request) {
		ServiceOrderExample serviceOrderExample = new ServiceOrderExample();
		ServiceOrderExample.Criteria criteria = serviceOrderExample.createCriteria();
		serviceOrderExample.setStatus(Integer.valueOf(request.getParameter("status")));
		System.out.println("serviceOrderExample"+serviceOrderExample.getStatus());
		return ServiceOrderMapper.selectByorderform(serviceOrderExample);
	}

	@Override
	public List<ServiceOrder> getlist2(HttpServletRequest request) {
		ServiceOrderExample serviceOrderExample = new ServiceOrderExample();
		ServiceOrderExample.Criteria criteria = serviceOrderExample.createCriteria();
		serviceOrderExample.setStatus(2);
		serviceOrderExample.setPageSize((Integer.valueOf(request.getParameter("pageSize"))-1)*2);
		System.out.println("getPageSize"+serviceOrderExample.getPageSize());
		serviceOrderExample.setPageNum(Integer.valueOf(request.getParameter("pageNum")));
		System.out.println("getPageNum"+serviceOrderExample.getPageNum());
		return ServiceOrderMapper.selectByorderformpage(serviceOrderExample);
	}

	//////////////////////////////////////////////用户id查订单
	@Override
	public List<ServiceOrder> content(HttpServletRequest request) {
		ServiceOrderExample serviceOrderExample = new ServiceOrderExample();
		ServiceOrderExample.Criteria criteria = serviceOrderExample.createCriteria();
		criteria.andMemberIdEqualTo(request.getParameter("userid"));
		return ServiceOrderMapper.selectByExample(serviceOrderExample);
	}
	
//////////////////////////////////////////////评价
	@Override
	public int contentsave(ServiceOrder so) {
		return ServiceOrderMapper.updateByPrimaryKeySelective(so);
	}
	
}
