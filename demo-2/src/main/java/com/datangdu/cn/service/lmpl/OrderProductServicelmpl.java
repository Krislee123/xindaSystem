package com.datangdu.cn.service.lmpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.datangdu.cn.dao.mapper.BusinessOrderMapper;
import com.datangdu.cn.model.businessOrder.BusinessOrder;
import com.datangdu.cn.model.businessOrder.BusinessOrderExample;
import com.datangdu.cn.service.OrderProductService;
@Service
public class OrderProductServicelmpl implements OrderProductService {
	@Resource
	BusinessOrderMapper businessOrderMapper;

	@Override
	public List<BusinessOrder> findPname(String name) {//订单信息，模糊查询
		// TODO Auto-generated method stub
		BusinessOrderExample productExample=new BusinessOrderExample();
		  productExample.setName(name);
		  return businessOrderMapper.findPname(productExample);
		
	}

	

}
