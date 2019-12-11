package com.datangdu.cn.model.sys_user;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class SysUser {
	 private String id;

	    private String userName;

	    private String password;

	    private String email;

	    private String cellphone;

	    private Integer status;

	    private Date registerTime;

	    private byte[] headImg;

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id == null ? null : id.trim();
	    }

	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName == null ? null : userName.trim();
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password == null ? null : password.trim();
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email == null ? null : email.trim();
	    }

	    public String getCellphone() {
	        return cellphone;
	    }

	    public void setCellphone(String cellphone) {
	        this.cellphone = cellphone == null ? null : cellphone.trim();
	    }

	    public Integer getStatus() {
	        return status;
	    }

	    public void setStatus(Integer status) {
	        this.status = status;
	    }

	    public Date getRegisterTime() {
	        return registerTime;
	    }

	    public void setRegisterTime(Date registerTime) {
	        this.registerTime = registerTime;
	    }

	    public byte[] getHeadImg() {
	        return headImg;
	    }

	    public void setHeadImg(byte[] headImg) {
	        this.headImg = headImg;
	    }
}