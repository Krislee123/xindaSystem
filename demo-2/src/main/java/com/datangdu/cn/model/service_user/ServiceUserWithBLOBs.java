package com.datangdu.cn.model.service_user;

public class ServiceUserWithBLOBs extends ServiceUser {
   

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
}