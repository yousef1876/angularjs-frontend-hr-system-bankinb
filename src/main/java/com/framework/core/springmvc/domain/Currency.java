package com.framework.core.springmvc.domain;


import javax.persistence.*;

@Entity
@Table(name = "CURRENCY")
public class Currency {

    @Id
    @GeneratedValue
    @Column(name = "CUR_ID")
    private Long id;

    @Column(name = "CUR_Name", length = 50, nullable = false , unique = true)
    private String name;


    @Column(name = "CUR_Code", length = 3, nullable = false , unique = true)
    private String code;

    @OneToOne
    @JoinColumn(name = "CUR_Lang_ID", nullable = false)
    private OperationLanguage operationLanguage;

    @OneToOne
    @JoinColumn(name = "CUR_CP_id", nullable = false)
    private Country country;

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

    public OperationLanguage getOperationLanguage() {
        return operationLanguage;
    }

    public void setOperationLanguage(OperationLanguage operationLanguage) {
        this.operationLanguage = operationLanguage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}
