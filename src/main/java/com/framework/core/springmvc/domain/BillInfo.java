package com.framework.core.springmvc.domain;

import javax.persistence.*;

@Entity
@Table(name = "SERVICE_BILL_INFO")
public class BillInfo {

    @Id
    @GeneratedValue
    @Column(name = "SBI_ID")
    private Long id;

    @Column(name = "SBI_NAME", length = 250 ,  nullable = false)
    private String name;

    @Column(name = "SBI_DESC" , length = 250)
    private String description;

    @Column(name = "SBI_Value" , length = 250)
    private String value;

    @OneToOne
    @JoinColumn(name = "SBI_BILLER", nullable = false)
    private Biller biller;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Biller getBiller() {
        return biller;
    }

    public void setBiller(Biller biller) {
        this.biller = biller;
    }
}

