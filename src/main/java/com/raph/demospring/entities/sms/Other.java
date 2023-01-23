package com.raph.demospring.entities.sms;


import com.raph.demospring.entities.Sms;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value = "not null")
public class Other extends Sms {
    
}
