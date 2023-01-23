package com.raph.demospring.entities.emp;

import  jakarta.persistence.*;

import java.time.ZonedDateTime;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int id;
    private String employeename;
    private String department;
    private Date joiningdate;
    private int age;
    private String address;
    private float salary;
    private ZonedDateTime lefton;
    private boolean leftjob;

    public Employee() {
    }

    public int getEmployee_id() {
        return id;
    }

    public void setEmployee_id(int employee_id) {
        this.id = employee_id;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getJoiningdate() {
        return joiningdate;
    }

    public void setJoiningdate(Date joiningdate) {
        this.joiningdate = joiningdate;
    }

    public int getAge() {
        return age;
    }


    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public ZonedDateTime getLefton() {
        return lefton;
    }

    public void setLefton(ZonedDateTime lefton) {
        this.lefton = lefton;
    }

    public boolean isLeftjob() {
        return leftjob;
    }

    public void setLeftjob(boolean leftjob) {
        this.leftjob = leftjob;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getLeftjob() {
        return leftjob;
    }

    public void setLeftjob(Boolean leftjob) {
        this.leftjob = leftjob;
    }
}
