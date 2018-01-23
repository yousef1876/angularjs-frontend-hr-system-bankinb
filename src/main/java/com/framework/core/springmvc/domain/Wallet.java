package com.framework.core.springmvc.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "DIGITAL_WALLET")
public class Wallet {

    @Id
    @GeneratedValue
    @Column(name = "DW_ID" , length = 12)
    private Long id;

    @Column(name = "DW_Code", length = 14, nullable = false, unique = true)
    private String code;

    @Column(name = "DW_Mobile_Number", length = 20 ,nullable = false, unique = true )
    private String mobileNumber;

    @Column(name = "DW_PIN", length = 50)
    private String pin;

    @Column(name = "DW_Current_Balance", columnDefinition="Decimal(12,3) default '0.000'")
    private double currentBalance;

    @Column(name = "DW_Available_Balance", columnDefinition="Decimal(12,3) default '0.000'")
    private double availableBalance;

    @Column(name = "DW_offlne_Balance", columnDefinition="Decimal(12,3) default '0.000'")
    private double offlineBalance;

    @Column(name = "DW_Reserved_Balance", columnDefinition="Decimal(12,3) default '0.000'")
    private double reservedBalance;

    @Column(name = "DW_Status", length = 2)
    private int status;

    @OneToOne
    @JoinColumn(name = "DW_Currency_ID", nullable = false)
    private Currency currency;

    @OneToMany
    @JoinTable(name = "DIGITAL_SUB_WALLET")
    private Set<SubWallet> subWallets = new HashSet<SubWallet>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getOfflineBalance() {
        return offlineBalance;
    }

    public void setOfflineBalance(double offlineBalance) {
        this.offlineBalance = offlineBalance;
    }


    public double getReservedBalance() {
        return reservedBalance;
    }

    public void setReservedBalance(double reservedBalance) {
        this.reservedBalance = reservedBalance;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Set<SubWallet> getSubWallets() {
        return subWallets;
    }

    public void setSubWallets(Set<SubWallet> subWallets) {
        this.subWallets = subWallets;
    }
}
