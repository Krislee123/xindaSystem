package com.datangdu.cn.model.member;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Member {

	 private String id;

	    private String name;

	    private Integer gender;

	    private String cellphone;

	    private String password;

	    private byte[] headImg;

	    private Date registerTime;

	    private String email;

	    private Integer status;

	    private String regionId;

	    private Integer buyNum;

	    private Integer totalPrice;

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

	    public Integer getGender() {
	        return gender;
	    }

	    public void setGender(Integer gender) {
	        this.gender = gender;
	    }

	    public String getCellphone() {
	        return cellphone;
	    }

	    public void setCellphone(String cellphone) {
	        this.cellphone = cellphone == null ? null : cellphone.trim();
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password == null ? null : password.trim();
	    }

	    public byte[] getHeadImg() {
	        return headImg;
	    }

	    public void setHeadImg(byte[] headImg) {
	        this.headImg = headImg;
	    }

	    public Date getRegisterTime() {
	        return registerTime;
	    }

	    public void setRegisterTime(Date registerTime) {
	        this.registerTime = registerTime;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email == null ? null : email.trim();
	    }

	    public Integer getStatus() {
	        return status;
	    }

	    public void setStatus(Integer status) {
	        this.status = status;
	    }

	    public String getRegionId() {
	        return regionId;
	    }

	    public void setRegionId(String regionId) {
	        this.regionId = regionId == null ? null : regionId.trim();
	    }

	    public Integer getBuyNum() {
	        return buyNum;
	    }

	    public void setBuyNum(Integer buyNum) {
	        this.buyNum = buyNum;
	    }

	    public Integer getTotalPrice() {
	        return totalPrice;
	    }

	    public void setTotalPrice(Integer totalPrice) {
	        this.totalPrice = totalPrice;
	    }
}