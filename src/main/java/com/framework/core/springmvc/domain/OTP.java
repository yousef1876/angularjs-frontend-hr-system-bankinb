package com.framework.core.springmvc.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "OTP")
public class OTP {

    @Id
    @GeneratedValue
    @Column(name = "OTP_ID")
    private Long id;

    @Column(name = "OTP_DW_Code", length = 14, nullable = false)
    private String walletNo;

    @Column(name = "OTP_CODE", length = 40, nullable = false )
    private String code;

    @Column(name = "OTP_CREATION_DATE")
    private Date creationDate;

    @Column(name = "OTP_EXPIRE_DATE")
    private Date expireDate;

    @Column(name = "OTP_STATUS")
    private int status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWalletNo() {
        return walletNo;
    }

    public void setWalletNo(String walletNo) {
        this.walletNo = walletNo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
