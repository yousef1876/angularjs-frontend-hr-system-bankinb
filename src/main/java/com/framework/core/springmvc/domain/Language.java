package com.framework.core.springmvc.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Language_Param")
public class Language {

    @Id
    @GeneratedValue
    @Column(name = "LAP_ID")
    private Long id;

    @Column(name = "LAP_Name", length = 40, nullable = false, unique = true)
    private String name;

    @Column(name = "LAP_Caption", length = 40, nullable = false)
    private String caption;

    @Column(name = "LAP_Direction", length = 1, nullable = false)
    private String direction;

    @OneToMany
    @JoinColumn(name="OPL_Lan_id")
    private Set<OperationLanguage> operationLanguages = new HashSet<OperationLanguage>();

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

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Set<OperationLanguage> getOperationLanguages() {
        return operationLanguages;
    }

    public void setOperationLanguages(Set<OperationLanguage> operationLanguages) {
        this.operationLanguages = operationLanguages;
    }
}
