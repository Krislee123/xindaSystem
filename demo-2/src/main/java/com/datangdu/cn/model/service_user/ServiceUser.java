package com.datangdu.cn.model.service_user;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class ServiceUser {


	private String id;

    private String name;

    private String area;

    private String servicePh;

    private String servicePw;

    private String adminIntroduction;

    private String state;

    private String mail;

    private Date ts;

    private String userIntroduction;

    private String workTs;

    private String qq;

    private String wx;

    private String customerPh;
    private byte[] hp;

    private byte[] businessLicense;

    public byte[] getHp() {
		return hp;
	}

	public void setHp(byte[] hp) {
		this.hp = hp;
	}

	public byte[] getBusinessLicense() {
		return businessLicense;
	}

	public void setBusinessLicense(byte[] businessLicense) {
		this.businessLicense = businessLicense;
	}

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getServicePh() {
        return servicePh;
    }

    public void setServicePh(String servicePh) {
        this.servicePh = servicePh == null ? null : servicePh.trim();
    }

    public String getServicePw() {
        return servicePw;
    }

    public void setServicePw(String servicePw) {
        this.servicePw = servicePw == null ? null : servicePw.trim();
    }

    public String getAdminIntroduction() {
        return adminIntroduction;
    }

    public void setAdminIntroduction(String adminIntroduction) {
        this.adminIntroduction = adminIntroduction == null ? null : adminIntroduction.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getUserIntroduction() {
        return userIntroduction;
    }

    public void setUserIntroduction(String userIntroduction) {
        this.userIntroduction = userIntroduction == null ? null : userIntroduction.trim();
    }

    public String getWorkTs() {
        return workTs;
    }

    public void setWorkTs(String workTs) {
        this.workTs = workTs == null ? null : workTs.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx == null ? null : wx.trim();
    }

    public String getCustomerPh() {
        return customerPh;
    }

    public void setCustomerPh(String customerPh) {
        this.customerPh = customerPh == null ? null : customerPh.trim();
    }
}