package com.framework.core.springmvc.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ACCOUNT")
@Inheritance(strategy = InheritanceType.JOINED)
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "ACC_ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "ACC_Type", nullable = false)
    private AccountType accountType;

    @Column(name = "ACC_Login_ID", length = 40, nullable = false , unique = true)
    private String loginId;

    @Column(name = "ACC_login_pw", length = 200, nullable = false )
    private String password;

    @Column(name = "ACC_email", length = 200, nullable = false , unique = true)
    private String email;

    @Column(name = "ACC_Login_pw_Expiry")
    private Date passwordExpiry;

    @Column(name = "ACC_rule", length = 200)
    private String rule;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getPasswordExpiry() {
        return passwordExpiry;
    }

    public void setPasswordExpiry(Date passwordExpiry) {
        this.passwordExpiry = passwordExpiry;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }
}
