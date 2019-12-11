package com.datangdu.cn.model.product_user;

import org.springframework.stereotype.Component;

@Component
public class ProductUser {
    protected Integer pId;

    protected  String username;

    protected  String password;

    protected  String tel;

    protected  String providerInfo;

    protected  String qq;

    protected  String workTime;

    protected  String wechat;

    protected  String email;

    protected  String registerTime;

    protected  String regin;

    protected  Integer productuId;

    protected  String productname;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getProviderInfo() {
        return providerInfo;
    }

    public void setProviderInfo(String providerInfo) {
        this.providerInfo = providerInfo == null ? null : providerInfo.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime == null ? null : workTime.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime == null ? null : registerTime.trim();
    }

    public String getRegin() {
        return regin;
    }

    public void setRegin(String regin) {
        this.regin = regin == null ? null : regin.trim();
    }

    public Integer getProductuId() {
        return productuId;
    }

    public void setProductuId(Integer productuId) {
        this.productuId = productuId;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }
}