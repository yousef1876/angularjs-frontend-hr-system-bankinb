package com.framework.core.springmvc.domain;

import javax.persistence.*;

@Entity
@Table(name = "SERVICE_BILL_CONFIG")
public class BillConfig {

    @Id
    @GeneratedValue
    @Column(name = "BC_ID")
    private Long id;

    @Column(name = "BC_NAME", length = 250 ,  nullable = false)
    private String name;

    @Column(name = "BC_DESC" , length = 250)
    private String description;

    @OneToOne
    @JoinColumn(name = "BC_BILLER", nullable = false)
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

    public Biller getBiller() {
        return biller;
    }

    public void setBiller(Biller biller) {
        this.biller = biller;
    }
}

