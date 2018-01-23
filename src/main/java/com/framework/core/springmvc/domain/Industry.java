package com.framework.core.springmvc.domain;

import javax.persistence.*;

@Entity
@Table(name = "Industry")
public class Industry {

    @Id
    @GeneratedValue
    @Column(name = "IND_ID")
    private Long id;

    @Column(name = "IND_NAME", length = 40, nullable = false , unique = true)
    private String name;

    @Column(name = "IND_desc", length = 250)
    private String description;

    @OneToOne
    @JoinColumn(name="IND_OP_Lan_id", nullable = false)
    private OperationLanguage operationLanguage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public OperationLanguage getOperationLanguage() {
        return operationLanguage;
    }

    public void setOperationLanguage(OperationLanguage operationLanguage) {
        this.operationLanguage = operationLanguage;
    }
}
