package com.framework.core.springmvc.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "BRANCH")
public class Branch {

    @Id
    @GeneratedValue
    @Column(name = "BCH_id")
    private Long id;

    @Column(name = "BCH_Name", length = 40, nullable = false , unique = true)
    private String name;

    @Column(name = "BCH_Code", length = 40, nullable = false , unique = true)
    private String code;

    @OneToOne
    @JoinColumn(name="BCH_OPC_ID", nullable = false)
    private OperationCountry operationCountry;

    @OneToOne
    @JoinColumn(name="BCH_AREA_ID" , nullable = false)
    private Area area;

    @OneToOne
    @JoinColumn(name="BCH_City_ID" , nullable = false)
    private City city;

    @Column(name = "Cus_address", length = 250)
    private String address;

    @Column(name = "BCH_Status", length = 2)
    private int status;

    @OneToMany
    @JoinColumn(name="BU_BCH_id")
    private Set<BranchUser> users = new HashSet<BranchUser>();

    @OneToMany
    @JoinColumn(name="Cus_Branch_id")
    private Set<Customer> customers = new HashSet<Customer>();


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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OperationCountry getOperationCountry() {
        return operationCountry;
    }

    public void setOperationCountry(OperationCountry operationCountry) {
        this.operationCountry = operationCountry;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<BranchUser> getUsers() {
        return users;
    }

    public void setUsers(Set<BranchUser> users) {
        this.users = users;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
