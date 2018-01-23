package com.framework.core.springmvc.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Area")
public class Area {

    @Id
    @GeneratedValue
    @Column(name = "ARE_id")
    private Long id;

    @OneToOne
    @JoinColumn(name="ARE_COP_id", nullable = false)
    private OperationCountry operationCountry;

    @Column(name = "ARE_Name", length = 40, nullable = false)
    private String name;

    @Column(name = "ARE_Description", length = 200)
    private String discreption;

    @Column(name = "ARE_Status", length = 11)
    private int status;

    @OneToMany
    @JoinColumn(name="Cit_ARE_id")
    private Set<City> cities = new HashSet<City>();

    @OneToMany
    @JoinColumn(name="BCH_Area_ID")
    private Set<Branch> branches = new HashSet<Branch>();


    @OneToMany
    @JoinColumn(name="Cus_Area_ID")
    private Set<Customer> customers = new HashSet<Customer>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OperationCountry getOperationCountry() {
        return operationCountry;
    }

    public void setOperationCountry(OperationCountry operationCountry) {
        this.operationCountry = operationCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscreption() {
        return discreption;
    }

    public void setDiscreption(String discreption) {
        this.discreption = discreption;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    public Set<Branch> getBranches() {
        return branches;
    }

    public void setBranches(Set<Branch> branches) {
        this.branches = branches;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
