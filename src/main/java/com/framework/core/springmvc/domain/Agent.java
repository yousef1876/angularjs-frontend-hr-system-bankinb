package com.framework.core.springmvc.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "AGENT")
public class Agent extends Account {

    @OneToMany
    @JoinColumn(name="AU_Agt_id")
    private Set<AgentUser> agentUsers= new HashSet<AgentUser>();

    @OneToMany
    @JoinColumn(name="Cus_agent_id")
    private Set<Customer> customers = new HashSet<Customer>();

    public Set<AgentUser> getAgentUsers() {
        return agentUsers;
    }

    public void setAgentUsers(Set<AgentUser> agentUsers) {
        this.agentUsers = agentUsers;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
