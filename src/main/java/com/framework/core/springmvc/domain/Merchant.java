package com.framework.core.springmvc.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "MERCHANT")
public class Merchant extends Account {


    @OneToOne
    @JoinColumn(name = "MER_Industry_ID", nullable = false)
    private Industry industry;

    @Column(name = "MER_Brand_Name")
    private String brandName;

    @Column(name = "MER_Con_First_Name" , length = 45)
    private String contactFirstName;

    @Column(name = "MER_Con_Mid_Name"  , length = 45)
    private String contactMidName;

    @Column(name = "MER_Con_Last_Name" , length = 45 )
    private String contactLastName;

    @Column(name = "MER_Con_Position" )
    private String contactPositon;

    @Column(name = "MER_Con_Email" )
    private String contactEmail;

    @Column(name = "MER_Con_Mobile"  )
    private String contactMobile;

    @Column(name = "MER_Con_Business_Phone"  )
    private String contactBusineesPhone;

    @Column(name = "MER_con_Buisness_Fax"  )
    private String contactBusineesFax;

    @OneToOne
    @JoinColumn(name="MER_opc_id", nullable = false)
    private OperationCountry country;

    @OneToOne
    @JoinColumn(name="MER_Area_ID", nullable = false)
    private Area area;

    @OneToOne
    @JoinColumn(name="MER_city_ID", nullable = false)
    private City city;

    @Column(name = "MER_postal_code"  , length = 8  )
    private String postalCode;

    @Column(name = "MER_address")
    private String address;

    @Column(name = "MER_Auth_First_Name" , length = 45)
    private String firstName;

    @Column(name = "MER_Auth_Mid_Name"  , length = 45)
    private String midName;

    @Column(name = "MER_Auth_Last_Name" , length = 45 )
    private String lastName;

    @Column(name = "MER_Auth_Mobile"  , length = 16  )
    private String mobileNumber;

    @Column(name = "MER_Auth_Home_Phone"  , length = 16  )
    private String homePhone;

    @Column(name = "MER_status", length = 11)
    private int status;

    @OneToMany
    @JoinTable(name = "MER_DIGITAL_WALLET")
    private Set<Wallet> wallets = new HashSet<Wallet>();

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactMidName() {
        return contactMidName;
    }

    public void setContactMidName(String contactMidName) {
        this.contactMidName = contactMidName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactPositon() {
        return contactPositon;
    }

    public void setContactPositon(String contactPositon) {
        this.contactPositon = contactPositon;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactBusineesPhone() {
        return contactBusineesPhone;
    }

    public void setContactBusineesPhone(String contactBusineesPhone) {
        this.contactBusineesPhone = contactBusineesPhone;
    }

    public String getContactBusineesFax() {
        return contactBusineesFax;
    }

    public void setContactBusineesFax(String contactBusineesFax) {
        this.contactBusineesFax = contactBusineesFax;
    }

    public OperationCountry getCountry() {
        return country;
    }

    public void setCountry(OperationCountry country) {
        this.country = country;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Set<Wallet> getWallets() {
        return wallets;
    }

    public void setWallets(Set<Wallet> wallets) {
        this.wallets = wallets;
    }
}
