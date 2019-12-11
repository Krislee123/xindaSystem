package com.datangdu.cn.zservice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.datangdu.cn.model.provider.Provider;

public interface ProviderService {
	public List<Provider> getList();

	List<Provider> select(HttpServletRequest request);

	List<Provider> selectpaging(HttpServletRequest request);

	List<Provider> getList2();

	int starstop(HttpServletRequest request);
}
