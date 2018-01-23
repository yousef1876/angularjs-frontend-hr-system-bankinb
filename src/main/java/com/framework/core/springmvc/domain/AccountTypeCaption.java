package com.framework.core.springmvc.domain;


import javax.persistence.*;

@Entity
@Table(name = "Account_TYPE_CAPTION")
public class AccountTypeCaption {

    @Id
    @GeneratedValue
    @Column(name = "ATC_ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "ATC_AT_ID" , nullable = false)
    private AccountType accountType;


    @OneToOne
    @JoinColumn(name = "ATC_OP_Lan_id" , nullable = false)
    private OperationLanguage operationLanguage;


    @Column(name = "ATC_CAPTION" , nullable = false )
    private String caption;

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

    public OperationLanguage getOperationLanguage() {
        return operationLanguage;
    }

    public void setOperationLanguage(OperationLanguage operationLanguage) {
        this.operationLanguage = operationLanguage;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}