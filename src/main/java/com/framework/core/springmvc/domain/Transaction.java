package com.framework.core.springmvc.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TRANSACTION")
@Inheritance(strategy = InheritanceType.JOINED)
public class Transaction {

    @Id
    @GeneratedValue
    @Column(name = "TXN_ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "TXN_TT_ID", nullable = false)
    private TransactionType transactionType;

    @OneToOne
    @JoinColumn(name = "TXN_DW_ID", nullable = false)
    private Wallet wallet;

    @Column(name = "TXN_Wallet_No", length = 14, nullable = false)
    private String walletNo;

    @Column(name = "TXN_Amount", columnDefinition="Decimal(12,3) default '0.000'", nullable = false)
    private double amount;

    @Column(name = "TXN_Date")
    private Date date;

    @Column(name = "TXN_Status", length = 2, nullable = false)
    private int status;

    @Column(name = "TXN_Comment")
    private String comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public String getWalletNo() {
        return walletNo;
    }

    public void setWalletNo(String walletNo) {
        this.walletNo = walletNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
