package com.framework.core.springmvc.config;



import java.io.Serializable;
import java.util.Date;

/**
 * Created by ninetynine99 on 03/10/16.
 */


public class User implements Serializable{

    private Long id;
    private Long accountType;
    private String loginId;
    private String password;
    private String email;
    private Date passwordExpiry;
    private String rule;

    public User(Long id, Long accountType, String loginId, String password, String email, Date passwordExpiry, String rule) {

        this.id = id;
        this.accountType = accountType;
        this.loginId = loginId;
        this.password = password;
        this.email = email;
        this.passwordExpiry = passwordExpiry;
        this.rule = rule;
    }


    public User(com.framework.core.springmvc.domain.Account account) {

        this.id = account.getId();
        this.accountType = account.getAccountType().getId();
        this.loginId = account.getLoginId();
        this.password = account.getPassword();
        this.email = account.getPassword();
        this.passwordExpiry = account.getPasswordExpiry();
        this.rule = account.getRule();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountType() {
        return accountType;
    }

    public void setAccountType(Long accountType) {
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
