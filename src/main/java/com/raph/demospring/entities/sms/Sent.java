package com.raph.demospring.entities.sms;


import java.time.ZonedDateTime;

import com.raph.demospring.entities.Sms;
import jakarta.persistence.*;

@Entity
public class Sent extends Sms {
    
    private ZonedDateTime deliveredon;

    public ZonedDateTime getDeliveredon() {
        return deliveredon;
    }

    public void setDeliveredon(ZonedDateTime deliveredon) {
        this.deliveredon = deliveredon;
    }

    
}
