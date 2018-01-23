package com.framework.core.springmvc.domain;

import javax.persistence.*;

@Entity
@Table(name = "SERVICE_BILLER")
public class Biller extends Account{


    @Column(name = "SB_NAME", length = 250 ,  nullable = false)
    private String name;

    @Column(name = "SB_DESC" , length = 2500)
    private String description;

    @Column(name = "SB_ADDRESS" , length = 2500)
    private String address;

    @OneToOne
    @JoinColumn(name="SB_opc_id")
    private OperationCountry operationCountry;

    @OneToOne
    @JoinColumn(name="SB_Area_ID")
    private Area area;

    @OneToOne
    @JoinColumn(name="SB_city_ID")
    private City city;

    @OneToOne
    @JoinColumn(name = "SB_TYPE", nullable = false)
    private ServiceType serviceType;

    @OneToOne
    @JoinColumn(name = "SB_SERVICE", nullable = false)
    private OperationService operationService;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public OperationService getOperationService() {
        return operationService;
    }

    public void setOperationService(OperationService operationService) {
        this.operationService = operationService;
    }
}

