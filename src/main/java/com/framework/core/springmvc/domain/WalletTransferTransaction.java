package com.framework.core.springmvc.domain;

import javax.persistence.*;


@Entity
@Table(name = "WalletTransfer")
public class WalletTransferTransaction extends Transaction {

    @OneToOne
    @JoinColumn(name = "WT_CUS_ID")
    private Customer customer;

    @Column(name = "DEST_WALLET_ID", length = 12, nullable = false)
    private Long destWalletId;

    @Column(name = "SOURCE_WALLET_ID", length = 12, nullable = false)
    private Long sourceWalletId;


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getDestWalletId() {
        return destWalletId;
    }

    public void setDestWalletId(Long destWalletId) {
        this.destWalletId = destWalletId;
    }

    public Long getSourceWalletId() {
        return sourceWalletId;
    }

    public void setSourceWalletId(Long sourceWalletId) {
        this.sourceWalletId = sourceWalletId;
    }
}
