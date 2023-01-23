package com.raph.demospring.entities;


import jakarta.persistence.*;
import com.raph.demospring.commons.PersonInfo;


@Entity
@Table(name="doctors")
@AttributeOverride(name = "entrydate", column = @Column(name ="joiningdate"))
public class Doctor extends PersonInfo {
    
    private String roomno;
    private String specialization;

    public String getRoomno() {
        return roomno;
    }
    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    
}
