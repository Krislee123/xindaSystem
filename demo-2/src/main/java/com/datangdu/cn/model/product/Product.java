package com.datangdu.cn.model.product;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private Integer id;

	private String name;

	private Integer code;

	private String img;

	private String info;

	private Integer showOrder;

	private String styleId;

	private String typeId;

	private Integer marketPrice;

	private String unit;

	private Integer storeNum;

	private Integer saleNum;

	private String status;

	private String serviceContent;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img == null ? null : img.trim();
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info == null ? null : info.trim();
	}

	public Integer getShowOrder() {
		return showOrder;
	}

	public void setShowOrder(Integer showOrder) {
		this.showOrder = showOrder;
	}

	public String getStyleId() {
		return styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId == null ? null : styleId.trim();
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId == null ? null : typeId.trim();
	}

	public Integer getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(Integer marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit == null ? null : unit.trim();
	}

	public Integer getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(Integer storeNum) {
		this.storeNum = storeNum;
	}

	public Integer getSaleNum() {
		return saleNum;
	}

	public void setSaleNum(Integer saleNum) {
		this.saleNum = saleNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getServiceContent() {
		return serviceContent;
	}

	public void setServiceContent(String serviceContent) {
		this.serviceContent = serviceContent == null ? null : serviceContent.trim();
	}

	
}