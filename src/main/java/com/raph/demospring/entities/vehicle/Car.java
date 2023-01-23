package com.raph.demospring.entities.vehicle;


import com.raph.demospring.entities.Vehicle;
import jakarta.persistence.*;

@Entity

public class Car extends Vehicle {

    @Id
    private int id;
    private String seatingcapacity;
    private String sunroof;
    public String getSeatingcapacity() {
        return seatingcapacity;
    }
    public void setSeatingcapacity(String seatingcapacity) {
        this.seatingcapacity = seatingcapacity;
    }
    public String getSunroof() {
        return sunroof;
    }
    public void setSunroof(String sunroof) {
        this.sunroof = sunroof;
    }

    
    
}
