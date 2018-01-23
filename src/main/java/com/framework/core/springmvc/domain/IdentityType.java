package com.framework.core.springmvc.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "IDENTITY_TYPE")
public class IdentityType {

    @Id
    @GeneratedValue
    @Column(name = "IT_ID")
    private Long id;


    @Column(name = "IT_Description ", length = 40)
    private String description;

    @OneToOne
    @JoinColumn(name = "IT_OP_Lan_id", nullable = false)
    private OperationLanguage operationLanguage;

    @OneToMany
    @JoinColumn(name="Cus_Identity_Type")
    private Set<Customer> customers = new HashSet<Customer>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OperationLanguage getOperationLanguage() {
        return operationLanguage;
    }

    public void setOperationLanguage(OperationLanguage operationLanguage) {
        this.operationLanguage = operationLanguage;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
