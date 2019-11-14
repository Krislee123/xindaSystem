package com.datangdu.cn.service.lmpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.datangdu.cn.dao.mapper.BusinessOrderMapper;
import com.datangdu.cn.model.bus_order.BusinessOrder;
import com.datangdu.cn.model.bus_order.BusinessOrderExample;
import com.datangdu.cn.service.EcomerceService;
@Service
public class EcommerceServicelmpl implements EcomerceService {
	@Resource
	BusinessOrderMapper busoMapper;
	

}
