package com.framework.core.springmvc.domain;


import javax.persistence.*;

@Entity
@Table(name = "SUB_WALLET")
public class SubWallet {

    @Id
    @GeneratedValue
    @Column(name = "DW_ID" , length = 12)
    private Long id;

    @Column(name = "SW_Current_Balance", columnDefinition="Decimal(12,3) default '0.000'")
    private double currentBalance;

    @Column(name = "SW_Available_Balance", columnDefinition="Decimal(12,3) default '0.000'")
    private double availableBalance;

    @Column(name = "SW_Reserved_Balance", columnDefinition="Decimal(12,3) default '0.000'")
    private double reservedBalance;

    @Column(name = "SW_Status", length = 2)
    private int status;

    @OneToOne
    @JoinColumn(name = "SW_TYPE_ID", nullable = false)
    private SubWalletType  type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public SubWalletType getType() {
        return type;
    }

    public void setType(SubWalletType type) {
        this.type = type;
    }


    public double getReservedBalance() {
        return reservedBalance;
    }

    public void setReservedBalance(double reservedBalance) {
        this.reservedBalance = reservedBalance;
    }
}
