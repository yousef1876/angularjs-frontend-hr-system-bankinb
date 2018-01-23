package com.framework.core.springmvc.domain;


import javax.persistence.*;

@Entity
@Table(name = "Table_Status_Param")
public class Status {

    @Id
    @GeneratedValue
    @Column(name = "TSP_id")
    private Long id;

    @Column(name = "TSP_Table", length = 50, nullable = false)
    private String tableName;

    @Column(name = "TSP_Status_id" , length = 2)
    private int statusId;

    @Column(name = "TSP_Value", length = 50, nullable = false)
    private String value;

    @OneToOne
    @JoinColumn(name = "TSP_OP_Lan_id", nullable = false)
    private OperationLanguage operationLanguage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public OperationLanguage getOperationLanguage() {
        return operationLanguage;
    }

    public void setOperationLanguage(OperationLanguage operationLanguage) {
        this.operationLanguage = operationLanguage;
    }
}
