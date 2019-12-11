package com.datangdu.cn.model.administrators_user;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class AdministratorsUser {
    private String id;

	private String administratorsPh;

	private String administratorsPw;

	private String name;

	private String mail;

	private String state;

	private Date ts;

	private byte[] hp;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getAdministratorsPh() {
		return administratorsPh;
	}

	public void setAdministratorsPh(String administratorsPh) {
		this.administratorsPh = administratorsPh == null ? null : administratorsPh.trim();
	}

	public String getAdministratorsPw() {
		return administratorsPw;
	}

	public void setAdministratorsPw(String administratorsPw) {
		this.administratorsPw = administratorsPw == null ? null : administratorsPw.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail == null ? null : mail.trim();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}

	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}

	public byte[] getHp() {
		return hp;
	}

	public void setHp(byte[] hp) {
		this.hp = hp;
	}

	
}