package com.datangdu.cn.service;

import java.util.List;

import com.datangdu.cn.model.bus_order.BusinessOrder;

public interface OrderProductService {
	 List<BusinessOrder> findPname(String name);
}