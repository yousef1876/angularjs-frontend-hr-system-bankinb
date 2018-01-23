package com.framework.core.springmvc.domain;

import javax.persistence.*;


@Entity
@Table(name = "OfflinePayment")
public class OfflinePaymentTransaction extends Transaction {


    @OneToOne
    @JoinColumn(name="OFF_PAY_REC_ACC_ID")
    private Account account;


    @Column(name = "OFF_PAY_REC_WALLET_NO", length = 14 ,nullable = false)
    private String destWalletNo;


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


    public String getDestWalletNo() {
        return destWalletNo;
    }

    public void setDestWalletNo(String destWalletNo) {
        this.destWalletNo = destWalletNo;
    }
}
