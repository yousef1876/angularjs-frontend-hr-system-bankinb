package com.framework.core.springmvc.domain;


import javax.persistence.*;

@Entity
@Table(name = "NOTIFICATION_TYPE")
public class NotificationType {

    @Id
    @GeneratedValue
    @Column(name = "NT_ID")
    private Long id;

    @Column(name = "NT_Name", length = 40 , unique = true , nullable = false)
    private String name;

    @Column(name = "NT_Description ", length = 40)
    private String description;

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
}
