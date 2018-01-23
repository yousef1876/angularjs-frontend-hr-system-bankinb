package com.framework.core.springmvc.domain;

import javax.persistence.*;


@Entity
@Table(name = "Payment")
public class PaymentTransaction extends Transaction {

    @OneToOne
    @JoinColumn(name="PAY_SEND_CUS_ID")
    private Customer customer;

    @Column(name = "PAY_REC_WALLET_NO", length = 14 ,nullable = false)
    private String destWalletNo;

    @OneToOne
    @JoinColumn(name = "TXN_DEST_DW_ID", nullable = false)
    private Wallet destWallet;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public String getDestWalletNo() {
        return destWalletNo;
    }

    public void setDestWalletNo(String destWalletNo) {
        this.destWalletNo = destWalletNo;
    }

    public Wallet getDestWallet() {
        return destWallet;
    }

    public void setDestWallet(Wallet destWallet) {
        this.destWallet = destWallet;
    }
}
