package com.framework.core.springmvc.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "SERVICE_BILL")
public class Bill {

    @Id
    @GeneratedValue
    @Column(name = "SB_ID")
    private Long id;

    @Column(name = "SB_NAME", length = 250 ,  nullable = false)
    private String name;

    @Column(name = "SB_DESC", length = 250 ,  nullable = false)
    private String description;

    @OneToMany
    @JoinTable(name = "SB_INFO")
    private Set<BillInfo> billInfos = new HashSet<BillInfo>();

    @OneToOne
    @JoinColumn(name = "SB_SERVICE", nullable = false)
    private OperationService operationService;

    @OneToOne
    @JoinColumn(name = "SB_BILLER", nullable = false)
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

    public Set<BillInfo> getBillInfos() {
        return billInfos;
    }

    public void setBillInfos(Set<BillInfo> billInfos) {
        this.billInfos = billInfos;
    }

    public OperationService getOperationService() {
        return operationService;
    }

    public void setOperationService(OperationService operationService) {
        this.operationService = operationService;
    }

    public Biller getBiller() {
        return biller;
    }

    public void setBiller(Biller biller) {
        this.biller = biller;
    }
}

