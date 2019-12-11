package com.datangdu.cn.model.product_user;

public class ProductUserWithBLOBs extends ProductUser {
	

	private byte[] providerImg;

    private byte[] authFile;

    public byte[] getProviderImg() {
        return providerImg;
    }

    public void setProviderImg(byte[] providerImg) {
        this.providerImg = providerImg;
    }

    public byte[] getAuthFile() {
        return authFile;
    }

    public void setAuthFile(byte[] authFile) {
        this.authFile = authFile;
    }
}