package com.framework.core.springmvc.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "CASHIN")
public class CashInTransaction extends Transaction {


    @Column(name = "CI_depositor_name", length = 200, nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "CI_identity_type", nullable = false)
    private IdentityType identityType;

    @OneToOne
    @JoinColumn(name="dep_identity_issuer_country")
    private Country identityIssuerCountry;

    @Column(name = "CI_identity_No", length = 200, nullable = false)
    private String identityNo;


    @Column(name = "Ci_Identity_Issuance_Date")
    private Date identityIssuanceDate;

    @Column(name = "CI_identity_expiry_date")
    private Date identityExpirationDate;

    @OneToOne
    @JoinColumn(name = "CI_Agent_id")
    private Agent agent;

    @OneToOne
    @JoinColumn(name = "CI_Agent_User_id")
    private AgentUser agentUser;

    @OneToOne
    @JoinColumn(name = "CI_Branch_ID")
    private Branch branch;

    @OneToOne
    @JoinColumn(name = "CI_Branch_User_ID")
    private BranchUser branchUser;

    @Column(name = "CI_print_copies", length = 2)
    private int printCopies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IdentityType getIdentityType() {
        return identityType;
    }

    public void setIdentityType(IdentityType identityType) {
        this.identityType = identityType;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public Date getIdentityIssuanceDate() {
        return identityIssuanceDate;
    }

    public void setIdentityIssuanceDate(Date identityIssuanceDate) {
        this.identityIssuanceDate = identityIssuanceDate;
    }

    public Date getIdentityExpirationDate() {
        return identityExpirationDate;
    }

    public void setIdentityExpirationDate(Date identityExpirationDate) {
        this.identityExpirationDate = identityExpirationDate;
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

    public int getPrintCopies() {
        return printCopies;
    }

    public void setPrintCopies(int printCopies) {
        this.printCopies = printCopies;
    }

    public Country getIdentityIssuerCountry() {
        return identityIssuerCountry;
    }

    public void setIdentityIssuerCountry(Country identityIssuerCountry) {
        this.identityIssuerCountry = identityIssuerCountry;
    }
}
