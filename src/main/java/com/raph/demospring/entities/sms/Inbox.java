package com.raph.demospring.entities.sms;


import com.raph.demospring.entities.Sms;
import jakarta.persistence.*;

@Entity

public class Inbox extends Sms {

    private String smstype;

    public String getSmstype() {
        return smstype;
    }

    public void setSmstype(String smstype) {
        this.smstype = smstype;
    }

    

}
