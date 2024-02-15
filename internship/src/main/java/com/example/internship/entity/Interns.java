package com.example.internship.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "internsdata")
@Getter
@Setter
public class Interns {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Internsid;
    private String name;
    private String department;
    private Double internSalary;

}
