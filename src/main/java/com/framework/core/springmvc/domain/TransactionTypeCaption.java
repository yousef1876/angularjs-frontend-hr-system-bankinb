package com.framework.core.springmvc.domain;


import javax.persistence.*;

@Entity
@Table(name = "TRANASACTION_TYPE_CAPTION")
public class TransactionTypeCaption {

    @Id
    @GeneratedValue
    @Column(name = "TTC_ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "TTC_TT_ID", nullable = false)
    private TransactionType transactionType;


    @OneToOne
    @JoinColumn(name = "TTC_OP_Lan_id", nullable = false)
    private OperationLanguage operationLanguage;


    @Column(name = "TTC_CAPTION", nullable = false)
    private String caption;


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