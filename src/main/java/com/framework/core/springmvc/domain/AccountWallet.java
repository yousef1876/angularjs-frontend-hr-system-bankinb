package com.framework.core.springmvc.domain;

import java.math.BigDecimal;

public class AccountWallet {

    private BigDecimal accountId;
    private BigDecimal accountTypeId;
    private String email;
    private String firstName;
    private String midName;
    private String lastName;
    private String walletNo;
    private String mobileNo;
    private BigDecimal currentBalance;
    private BigDecimal avaialableBalance;

    public BigDecimal getAccountId() {
        return accountId;
    }

    public void setAccountId(BigDecimal accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(BigDecimal accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWalletNo() {
        return walletNo;
    }

    public void setWalletNo(String walletNo) {
        this.walletNo = walletNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public BigDecimal getAvaialableBalance() {
        return avaialableBalance;
    }

    public void setAvaialableBalance(BigDecimal avaialableBalance) {
        this.avaialableBalance = avaialableBalance;
    }
}
