package com.datangdu.cn.model.provider;

public class ProviderWithBLOBs extends Provider {
    private byte[] providerImg;

	private byte[] img;

	public byte[] getProviderImg() {
		return providerImg;
	}

	public void setProviderImg(byte[] providerImg) {
		this.providerImg = providerImg;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	
}