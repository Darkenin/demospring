package com.raph.demospring.entities.sms;


import com.raph.demospring.entities.Sms;
import jakarta.persistence.*;

@Entity

public class Failed  extends Sms {

    private String errormessage;

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    
}
