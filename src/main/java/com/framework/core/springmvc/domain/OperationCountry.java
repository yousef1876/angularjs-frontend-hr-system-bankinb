package com.framework.core.springmvc.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Operation_Country")
public class OperationCountry {

    @Id
    @GeneratedValue
    @Column(name = "COP_id")
    private Long id;

    @Column(name = "COP_Name", length = 40, nullable = false, unique = true)
    private String name;

    @Column(name = "COP_Nationality", length = 80, nullable = false, unique = true)
    private String nationality;

    @Column(name = "COP_Code", length = 3, nullable = false, unique = true)
    private String code;

    @Column(name = "COP_Phone_Code", length = 5, nullable = false, unique = true)
    private String phoneCode;

    @Column(name = "COP_Token", length = 5, nullable = false, unique = true)
    private String token;

    @OneToOne
    @JoinColumn(name="COP_OP_Lan_id" , nullable = false)
    private OperationLanguage operationLanguage;

    @OneToMany
    @JoinColumn(name="ARE_COP_id")
    private Set<Area> areas = new HashSet<Area>();

    @OneToMany
    @JoinColumn(name="BCH_OPC_ID")
    private Set<Branch> branches = new HashSet<Branch>();

    @OneToMany
    @JoinColumn(name="Cus_opc_id")
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public OperationLanguage getOperationLanguage() {
        return operationLanguage;
    }

    public void setOperationLanguage(OperationLanguage operationLanguage) {
        this.operationLanguage = operationLanguage;
    }

    public Set<Area> getAreas() {
        return areas;
    }

    public void setAreas(Set<Area> areas) {
        this.areas = areas;
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
