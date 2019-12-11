package com.datangdu.cn.service;

import java.util.List;

import com.datangdu.cn.model.product_user.ProductUser;

public interface LoginService {
    List<ProductUser> Login(String tel);//登录
    public int repassword(ProductUser record);//忘记密码
}
