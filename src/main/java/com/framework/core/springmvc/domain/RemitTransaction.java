package com.framework.core.springmvc.domain;

import javax.persistence.*;


@Entity
@Table(name = "REMIT")
public class RemitTransaction extends Transaction {


    @OneToOne
    @JoinColumn(name="REM_REC_BEN_ID")
    private Customer benficiary;

    @Column(name = "REM_REC_WALLET_NO", length = 14 ,nullable = false)
    private String destWalletNo;

    @OneToOne
    @JoinColumn(name = "TXN_DEST_DW_ID", nullable = false)
    private Wallet destWallet;

    public Customer getBenficiary() {
        return benficiary;
    }

    public void setBenficiary(Customer benficiary) {
        this.benficiary = benficiary;
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
