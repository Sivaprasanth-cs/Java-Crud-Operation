package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="student_table")
public class Student {

    @Id
    @GeneratedValue()

    private int id;
    private String name;
    private int age;
    private String department;
    @Column(name = "roll_no")
    private int rollNo;


}
