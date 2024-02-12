package com.employeeXD.employeeXD.entity;

import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "employee_XD")
public class EmployeeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "emp_id")
    private long id;
    @Column(name = "Gender" )
    private String gender;
    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;
    @Column(name = "dateOfbirth")
    private Date dateOfbirth;

    public EmployeeEntity() {
    }

    public EmployeeEntity(long id, String gender, String name, Date dateOfbirth, String address) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.dateOfbirth = dateOfbirth;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(Date dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}