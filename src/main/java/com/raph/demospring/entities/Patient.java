package com.raph.demospring.entities;


import com.raph.demospring.commons.PersonInfo;
import jakarta.persistence.*;

@Entity
@Table(name="patients")
@AttributeOverride(name = "entrydate", column = @Column(name ="visitdate"))
public class Patient extends PersonInfo {
    
    private String symptoms;
    private String healthhistory;
    
    public String getSymptoms() {
        return symptoms;
    }
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
    public String getHealthhistory() {
        return healthhistory;
    }
    public void setHealthhistory(String healthhistory) {
        this.healthhistory = healthhistory;
    }

    
}
