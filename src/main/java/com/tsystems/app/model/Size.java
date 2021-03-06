package com.tsystems.app.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sizes")
public class Size implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "size_id")
    private int id;

    @Column(name = "size", nullable = false)
    private String size;

    @Column(name = "available_number", nullable = false)
    private String availableNumber;

    @Column(name = "cost_dependency", nullable = false)
    private String costDependency;

    public Size() {
    }

    public Size(String size, String availableNumber, String costDependency) {
        this.size = size;
        this.availableNumber = availableNumber;
        this.costDependency = costDependency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAvailableNumber() {
        return availableNumber;
    }

    public void setAvailableNumber(String availableNumber) {
        this.availableNumber = availableNumber;
    }

    public String getCostDependency() {
        return costDependency;
    }

    public void setCostDependency(String costDependency) {
        this.costDependency = costDependency;
    }
}
