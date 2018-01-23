package com.framework.core.springmvc.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "CUSTOMER")
public class Customer extends Account implements Serializable {

    @Column(name = "Cus_Identity_Number", length = 50, nullable = false, unique = true)
    private String identityNumber;

    @OneToOne
    @JoinColumn(name = "Cus_Identity_Type")
    private IdentityType identityType;

    @OneToOne
    @JoinColumn(name = "Cus_nationality_country_id")
    private Country nationality;

    @OneToOne
    @JoinColumn(name = "Cus_identity_issuer_country")
    private Country identityIssuerCountry;

    @Column(name = "Cus_identity_expiration_date")
    private Date identityExpirationDate;

    @Column(name = "Cus_identity_issuance_date")
    private Date identityIssuanceDate;

    @Column(name = "Cus_first_name", length = 45)
    private String firstName;

    @Column(name = "Cus_mid_name", length = 45)
    private String midName;

    @Column(name = "Cus_family_name", length = 45)
    private String familyName;

    @Column(name = "Cus_Mother_Maiden_Name", length = 45)
    private String motherName;

    @Column(name = "Cus_mobile_number", length = 45)
    private String mobileNo;

    @Column(name = "Cus_gender", length = 1)
    private String gender;

    @Column(name = "Cus_birth_date")
    private Date birthDate;

    @OneToOne
    @JoinColumn(name = "Cus_opc_id")
    private OperationCountry operationCountry;

    @OneToOne
    @JoinColumn(name = "Cus_Area_ID")
    private Area area;

    @OneToOne
    @JoinColumn(name = "Cus_city_ID")
    private City city;

    @Column(name = "Cus_postal_code", length = 8)
    private String postalCode;

    @Column(name = "Cus_address", length = 250)
    private String address;

    @Column(name = "Cus_status", length = 2)
    private Long status;

    @OneToOne
    @JoinColumn(name = "Cus_agent_id")
    private Agent agent;

    @OneToOne
    @JoinColumn(name = "Cus_agent_user_id")
    private AgentUser agentUser;

    @OneToOne
    @JoinColumn(name = "Cus_Branch_id")
    private Branch branch;

    @OneToOne
    @JoinColumn(name = "Cus_Branch_user_id")
    private BranchUser branchUser;

    @Column(name = "Cus_news_flag", length = 2)
    private int newsFlag;

    @Column(name = "Cus_Notification_flag", length = 2)
    private int notificationFlag;

    @Column(name = "Cus_Advirtising_flag", length = 2)
    private int adsFlag;

    @OneToMany
    @JoinTable(name = "CUS_DIGITAL_WALLET")
    private Set<Wallet> wallets = new HashSet<Wallet>();

    @ManyToMany
    @JoinTable(name = "CUS_BENFS")
    private Set<Customer> benifiacries = new HashSet<Customer>();

    @ManyToMany
    @JoinTable(name = "CUS_NOTIF")
    private Set<Notification> notifications = new HashSet<Notification>();

    @ManyToMany
    @JoinTable(name = "CUS_SERVICES")
    private Set<OperationService> operationServices = new HashSet<OperationService>();

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public IdentityType getIdentityType() {
        return identityType;
    }

    public void setIdentityType(IdentityType identityType) {
        this.identityType = identityType;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public Country getIdentityIssuerCountry() {
        return identityIssuerCountry;
    }

    public void setIdentityIssuerCountry(Country identityIssuerCountry) {
        this.identityIssuerCountry = identityIssuerCountry;
    }

    public Date getIdentityExpirationDate() {
        return identityExpirationDate;
    }

    public void setIdentityExpirationDate(Date identityExpirationDate) {
        this.identityExpirationDate = identityExpirationDate;
    }

    public Date getIdentityIssuanceDate() {
        return identityIssuanceDate;
    }

    public void setIdentityIssuanceDate(Date identityIssuanceDate) {
        this.identityIssuanceDate = identityIssuanceDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public AgentUser getAgentUser() {
        return agentUser;
    }

    public void setAgentUser(AgentUser agentUser) {
        this.agentUser = agentUser;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public BranchUser getBranchUser() {
        return branchUser;
    }

    public void setBranchUser(BranchUser branchUser) {
        this.branchUser = branchUser;
    }

    public int getNewsFlag() {
        return newsFlag;
    }

    public void setNewsFlag(int newsFlag) {
        this.newsFlag = newsFlag;
    }

    public int getNotificationFlag() {
        return notificationFlag;
    }

    public void setNotificationFlag(int notificationFlag) {
        this.notificationFlag = notificationFlag;
    }

    public int getAdsFlag() {
        return adsFlag;
    }

    public void setAdsFlag(int adsFlag) {
        this.adsFlag = adsFlag;
    }

    public Set<Wallet> getWallets() {
        return wallets;
    }

    public void setWallets(Set<Wallet> wallets) {
        this.wallets = wallets;
    }

    public Set<Customer> getBenifiacries() {
        return benifiacries;
    }

    public void setBenifiacries(Set<Customer> benifiacries) {
        this.benifiacries = benifiacries;
    }

    public Set<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(Set<Notification> notifications) {
        this.notifications = notifications;
    }

    public Set<OperationService> getOperationServices() {
        return operationServices;
    }

    public void setOperationServices(Set<OperationService> operationServices) {
        this.operationServices = operationServices;
    }
}
