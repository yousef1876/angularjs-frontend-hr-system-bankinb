package com.framework.core.springmvc.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "TRANSFER")
public class TransferTransaction extends Transaction {


    @Column(name = "TFR_expiry_date")
    private Date expireDate;

    @OneToOne
    @JoinColumn(name = "TFR_Agent_id", nullable = false)
    private Agent agent;

    @OneToOne
    @JoinColumn(name = "TFR_Agent_User_id", nullable = false)
    private AgentUser agentUser;

    @OneToOne
    @JoinColumn(name = "TFR_Branch_ID", nullable = false)
    private Branch branch;

    @OneToOne
    @JoinColumn(name = "TFR_Branch_User_ID", nullable = false)
    private BranchUser branchUser;


    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
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
}
