package com.example.test.demoTest;

import com.example.test.demoTest.Models.Branch;
import com.example.test.demoTest.Models.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service

public class Service {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    BranchRepository branchRepository;
    @Autowired
    GrantRepository grantRepository;
public void addStudent(StudentModel student){
    studentRepository.save(student);
}
public void addBranch(Branch branch){
branchRepository.save(branch);
}
}
