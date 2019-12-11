package com.datangdu.cn.service;

import com.datangdu.cn.model.product_user.ProductUser;
import com.datangdu.cn.model.product_user.ProductUserWithBLOBs;

public interface ProductUserService {
	  	ProductUser selectByTel(String tel);
	  	 ProductUserWithBLOBs  selectBytel(ProductUserWithBLOBs record);
	    int updateByPrimaryKeyWithBLOBs(ProductUserWithBLOBs record);
	    int productHeadImg(ProductUserWithBLOBs record);
	    ProductUserWithBLOBs  getUserImg(String tel);
}