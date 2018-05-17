package com.spay.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class BankMessage  implements Serializable{

    private String subBranchNo;
    private String subBankName;
    private String bankName;
    private String province;
    private String city;

    public String getSubBranchNo() {
        return subBranchNo;
    }

    public void setSubBranchNo(String subBranchNo) {
        this.subBranchNo = subBranchNo;
    }

    public String getSubBankName() {
        return subBankName;
    }

    public void setSubBankName(String subBankName) {
        this.subBankName = subBankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
