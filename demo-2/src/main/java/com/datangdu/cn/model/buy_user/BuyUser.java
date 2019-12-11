package com.datangdu.cn.model.buy_user;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class BuyUser {
    private String id;

	private String name;

	private String sex;

	private String ph;

	private String pw;

	private String buyArea;

	private Date ts;

	private String mail;

	private Integer buyNum;

	private Float consumePrice;

	private String state;

	private byte[] hp;

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph == null ? null : ph.trim();
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw == null ? null : pw.trim();
	}

	public String getBuyArea() {
		return buyArea;
	}

	public void setBuyArea(String buyArea) {
		this.buyArea = buyArea == null ? null : buyArea.trim();
	}

	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail == null ? null : mail.trim();
	}

	public Integer getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
	}

	public Float getConsumePrice() {
		return consumePrice;
	}

	public void setConsumePrice(Float consumePrice) {
		this.consumePrice = consumePrice;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}

	public byte[] getHp() {
		return hp;
	}

	public void setHp(byte[] hp) {
		this.hp = hp;
	}

	
}