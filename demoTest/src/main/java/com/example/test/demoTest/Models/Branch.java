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
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Enumerated(value = EnumType.STRING)
    private BranchType branchType;
    private String hodName;
    private String contactNo;
    @OneToOne
    @JoinColumn
    private StudentModel studentModel;
//    @OneToMany(mappedBy = "branchName",cascade = CascadeType.ALL)
//    private Grant grant;



}
