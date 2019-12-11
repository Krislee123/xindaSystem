package com.datangdu.cn.model.provider;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Provider {
	  private String id;

	    private String name;

	    private String providerInfo;

	    private String cellphone;

	    private String loginId;

	    private String password;

	    private byte[]  providerImg;

	    private String regionId;

	    private Date registerTime;

	    private Integer status;

	    private byte[] authFile;

	    private String weixin;

	    private String qq;

	    private String workTime;

	    private String email;

	    private Integer recommend;

	    private String providerIntroduce;

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id == null ? null : id.trim();
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name == null ? null : name.trim();
	    }

	    public String getProviderInfo() {
	        return providerInfo;
	    }

	    public void setProviderInfo(String providerInfo) {
	        this.providerInfo = providerInfo == null ? null : providerInfo.trim();
	    }

	    public String getCellphone() {
	        return cellphone;
	    }

	    public void setCellphone(String cellphone) {
	        this.cellphone = cellphone == null ? null : cellphone.trim();
	    }

	    public String getLoginId() {
	        return loginId;
	    }

	    public void setLoginId(String loginId) {
	        this.loginId = loginId == null ? null : loginId.trim();
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password == null ? null : password.trim();
	    }

	    public byte[] getProviderImg() {
			return providerImg;
		}

		public void setProviderImg(byte[] data) {
			this.providerImg = data;
		}

		public String getRegionId() {
	        return regionId;
	    }

	    public void setRegionId(String regionId) {
	        this.regionId = regionId == null ? null : regionId.trim();
	    }

	    public Date getRegisterTime() {
	        return registerTime;
	    }

	    public void setRegisterTime(Date registerTime) {
	        this.registerTime = registerTime;
	    }

	    public Integer getStatus() {
	        return status;
	    }

	    public void setStatus(Integer status) {
	        this.status = status;
	    }

	    public byte[] getAuthFile() {
	        return authFile;
	    }

	    public void setAuthFile(byte[] data) {
	    	this.authFile = data;
	    }

	    public String getWeixin() {
	        return weixin;
	    }

	    public void setWeixin(String weixin) {
	        this.weixin = weixin == null ? null : weixin.trim();
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

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email == null ? null : email.trim();
	    }

	    public Integer getRecommend() {
	        return recommend;
	    }

	    public void setRecommend(Integer recommend) {
	        this.recommend = recommend;
	    }

	    public String getProviderIntroduce() {
	        return providerIntroduce;
	    }

	    public void setProviderIntroduce(String providerIntroduce) {
	        this.providerIntroduce = providerIntroduce == null ? null : providerIntroduce.trim();
	    }
}