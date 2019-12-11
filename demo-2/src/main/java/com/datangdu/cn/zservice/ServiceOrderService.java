package com.datangdu.cn.zservice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.datangdu.cn.model.service_order.ServiceOrder;

public interface ServiceOrderService {
	public List<ServiceOrder> getso();

	public List<ServiceOrder> select(HttpServletRequest request);

	List<ServiceOrder> getuid(String userid);

	public int up(HttpServletRequest request);
	int insertServiceOrder(HttpServletRequest request);


	List<ServiceOrder> getll(String userid);

	public int pProductDelete(HttpServletRequest request);


	List<ServiceOrder> getmm(String serciceNo);
	

	List<ServiceOrder> getpay(HttpServletRequest request);

	List<ServiceOrder> getpaylist(HttpServletRequest request);

	List<ServiceOrder> gettime(HttpServletRequest request);

	List<ServiceOrder> gettimepage(HttpServletRequest request);

	List<ServiceOrder> getlist(HttpServletRequest request);

	List<ServiceOrder> getlist2(HttpServletRequest request);

	List<ServiceOrder> content(HttpServletRequest request);

	List<ServiceOrder> search(HttpServletRequest request);

	int contentsave(ServiceOrder so);
}
