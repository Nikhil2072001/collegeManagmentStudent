package com.example.test.demoTest.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(unique = true ,nullable = false)
    private int rollNo;
    private int marks;
    @OneToOne(mappedBy = "studentModel",cascade = CascadeType.ALL)
    private Branch branch;

}
