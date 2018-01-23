package com.framework.core.springmvc.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "Branch_User")
public class BranchUser extends Account {

    @Column(name = "BU_First_Name", length = 45)
    private String firstName;

    @Column(name = "BU_Mid_Name", length = 45)
    private String midName;

    @Column(name = "BU_Last_name", length = 45)
    private String lastName;

    @Column(name = "BU_Status", length = 2)
    private int status;

    @OneToOne
    @JoinColumn(name="BU_BCH_id" , nullable = false)
    private Branch branch;

    @OneToMany
    @JoinColumn(name="Cus_Branch_user_id")
    private Set<Customer> customers = new HashSet<Customer>();

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
