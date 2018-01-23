package com.framework.core.springmvc.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "CASHOUT")
public class CashOutTransaction extends Transaction {


    @OneToOne
    @JoinColumn(name = "CO_Agent_id", nullable = false)
    private Agent agent;

    @OneToOne
    @JoinColumn(name = "CO_Agent_User_id", nullable = false)
    private AgentUser agentUser;

    @OneToOne
    @JoinColumn(name = "CO_Branch_ID")
    private Branch branch;

    @OneToOne
    @JoinColumn(name = "CO_Branch_User_ID")
    private BranchUser branchUser;

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
}
