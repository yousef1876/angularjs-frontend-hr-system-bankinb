package com.framework.core.springmvc.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ninetynine99 on 29/10/2016.
 */

@Entity
@Table(name = "OPERATION_SERVICE")
public class OperationService {

    @Id
    @GeneratedValue
    @Column(name = "OS_ID")
    private Long id;

    @Column(name = "OS_NAME", length = 250 ,  nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "OS_TYPE", nullable = false)
    private ServiceType serviceType;

    @Column(name = "OS_CODE", length = 250 )
    private String code;

    @Column(name = "OS_DESC" , length = 2500)
    private String description;

    @OneToOne
    @JoinColumn(name="OS_opc_id")
    private OperationCountry operationCountry;

    @OneToOne
    @JoinColumn(name="OS_Area_ID")
    private Area area;

    @OneToOne
    @JoinColumn(name="OS_city_ID")
    private City city;

    @OneToMany
    @JoinTable(name = "OS_BILLERS")
    private Set<Biller> billers = new HashSet<Biller>();

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

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Set<Biller> getBillers() {
        return billers;
    }

    public void setBillers(Set<Biller> billers) {
        this.billers = billers;
    }
}
