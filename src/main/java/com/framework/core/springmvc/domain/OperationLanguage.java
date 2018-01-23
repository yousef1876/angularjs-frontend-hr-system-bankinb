package com.framework.core.springmvc.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Operation_Language")
public class OperationLanguage implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "OPL_ID")
    private Long id;

    @OneToOne
    @JoinColumn(name="OPL_Lan_id", nullable = false)
    private Language language;

    @Column(name = "OPL_Caption", length = 40, nullable = false)
    private String caption;

    @Column(name = "OPL_Direction", length = 1, nullable = false)
    private String direction;

    @OneToMany
    @JoinColumn(name="COP_OP_Lan_id")
    private Set<OperationCountry> operationCountries = new HashSet<OperationCountry>();


    @OneToMany
    @JoinColumn(name="AT_OP_Lan_id")
    private Set<AccountType> accountTypes= new HashSet<AccountType>();

    @OneToMany
    @JoinColumn(name="CP_OP_Lan_id")
    private Set<Country> countries = new HashSet<Country>();

    @OneToMany
    @JoinColumn(name="CUR_Lang_ID")
    private Set<Currency> currencies = new HashSet<Currency>();

    @OneToMany
    @JoinColumn(name="IT_OP_Lan_id")
    private Set<IdentityType> identityTypes = new HashSet<IdentityType>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Set<OperationCountry> getOperationCountries() {
        return operationCountries;
    }

    public void setOperationCountries(Set<OperationCountry> operationCountries) {
        this.operationCountries = operationCountries;
    }

    public Set<AccountType> getAccountTypes() {
        return accountTypes;
    }

    public void setAccountTypes(Set<AccountType> accountTypes) {
        this.accountTypes = accountTypes;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }

    public Set<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Set<Currency> currencies) {
        this.currencies = currencies;
    }
}
