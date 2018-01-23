package com.framework.core.springmvc.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Country_Param")
public class Country {

    @Id
    @GeneratedValue
    @Column(name = "CP_id")
    private Long id;

    @Column(name = "CP_Name", length = 40, nullable = false, unique = true)
    private String name;

    @Column(name = "CP_Nationality", length = 80, nullable = false, unique = true)
    private String nationality;

    @Column(name = "CP_Code", length = 3, nullable = false, unique = true)
    private String code;

    @Column(name = "CP_Phone_Code", length = 5, nullable = false, unique = true)
    private String phoneCode;

    @OneToOne
    @JoinColumn(name="CP_OP_Lan_id", nullable = false)
    private OperationLanguage operationLanguage;

    @OneToMany
    @JoinColumn(name="CUR_CP_id")
    private Set<Currency> currencies = new HashSet<Currency>();

    @OneToMany
    @JoinColumn(name="Cus_nationality_country_id")
    private Set<Customer> nationalityCustiomers = new HashSet<Customer>();

    @OneToMany
    @JoinColumn(name="Cus_identity_issuer_country")
    private Set<Customer> identityIssuersCustomers = new HashSet<Customer>();


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

    public OperationLanguage getOperationLanguage() {
        return operationLanguage;
    }

    public void setOperationLanguage(OperationLanguage operationLanguage) {
        this.operationLanguage = operationLanguage;
    }

    public Set<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Set<Currency> currencies) {
        this.currencies = currencies;
    }

    public Set<Customer> getNationalityCustiomers() {
        return nationalityCustiomers;
    }

    public void setNationalityCustiomers(Set<Customer> nationalityCustiomers) {
        this.nationalityCustiomers = nationalityCustiomers;
    }

    public Set<Customer> getIdentityIssuersCustomers() {
        return identityIssuersCustomers;
    }

    public void setIdentityIssuersCustomers(Set<Customer> identityIssuersCustomers) {
        this.identityIssuersCustomers = identityIssuersCustomers;
    }
}
