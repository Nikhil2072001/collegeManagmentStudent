package com.example.test.demoTest.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Grant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int ruppes;
//    @ManyToOne
//    @JoinColumn
    private Branch branchName;
}
