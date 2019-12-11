package com.datangdu.cn.model.service_product;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ServiceProduct {

	private String id;

	private String serviceName;

	private String serviceExplain;

	private Float servicePrice;

	private String serviceState;

	private Date ts;

	private Integer salesVolume;

	private String serviceId;

	private String name;

	private String recommend;

	private String entrepreneurship;

	private byte[] imag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName == null ? null : serviceName.trim();
	}

	public String getServiceExplain() {
		return serviceExplain;
	}

	public void setServiceExplain(String serviceExplain) {
		this.serviceExplain = serviceExplain == null ? null : serviceExplain.trim();
	}

	public Float getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(Float servicePrice) {
		this.servicePrice = servicePrice;
	}

	public String getServiceState() {
		return serviceState;
	}

	public void setServiceState(String serviceState) {
		this.serviceState = serviceState == null ? null : serviceState.trim();
	}

	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}

	public Integer getSalesVolume() {
		return salesVolume;
	}

	public void setSalesVolume(Integer salesVolume) {
		this.salesVolume = salesVolume;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId == null ? null : serviceId.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend == null ? null : recommend.trim();
	}

	public String getEntrepreneurship() {
		return entrepreneurship;
	}

	public void setEntrepreneurship(String entrepreneurship) {
		this.entrepreneurship = entrepreneurship == null ? null : entrepreneurship.trim();
	}

	public byte[] getImag() {
		return imag;
	}

	public void setImag(byte[] imag) {
		this.imag = imag;
	}
}