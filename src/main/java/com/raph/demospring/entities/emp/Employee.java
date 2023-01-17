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
    private int employee_id;
    private String employee_name;
    private String department;
    private Date joiningDate;
    private int age;
    private String address;
    private float salary;
    private ZonedDateTime lefton;
    private boolean leftjob;

    public Employee() {
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
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
