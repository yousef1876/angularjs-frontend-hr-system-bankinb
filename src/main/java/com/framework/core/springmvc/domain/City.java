package com.framework.core.springmvc.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CITY")
public class City {

    @Id
    @GeneratedValue
    @Column(name = "Cit_id")
    private Long id;

    @OneToOne
    @JoinColumn(name="Cit_ARE_id", nullable = false)
    private Area area;

    @Column(name = "Cit_Name", length = 40, nullable = false)
    private String name;

    @Column(name = "Cit_Description", length = 200)
    private String discreption;

    @OneToMany
    @JoinColumn(name="BCH_City_ID")
    private Set<Branch> branches = new HashSet<Branch>();

    @OneToMany
    @JoinColumn(name="Cus_Area_ID")
    private Set<Customer> customers = new HashSet<Customer>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscreption() {
        return discreption;
    }

    public void setDiscreption(String discreption) {
        this.discreption = discreption;
    }

    public Set<Branch> getBranches() {
        return branches;
    }

    public void setBranches(Set<Branch> branches) {
        this.branches = branches;
    }
}
