package com.framework.core.springmvc.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "AGENT_USER")
public class AgentUser extends Account {

    @OneToOne
    @JoinColumn(name="AU_Agt_id" , nullable = false)
    private Agent agent;

    @Column(name = "AU_First_Name", length = 45)
    private String firstName;

    @Column(name = "AU_Mid_Name", length = 45)
    private String midName;

    @Column(name = "AU_Last_name", length = 45)
    private String lastName;

    @Column(name = "AU_Status", length = 2)
    private int status;

    @OneToMany
    @JoinColumn(name="Cus_agent_user_id")
    private Set<Customer> customers = new HashSet<Customer>();

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
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
