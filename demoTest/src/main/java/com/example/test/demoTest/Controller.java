package com.example.test.demoTest;

import com.example.test.demoTest.Models.Branch;
import com.example.test.demoTest.Models.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Service service;
    @PostMapping("/student/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody() StudentModel student){
        service.addStudent(student);
        return new ResponseEntity<>("successfully added", HttpStatus.CREATED);
    }
@PostMapping("/branch/addBranch")
    public ResponseEntity<String> addBranch(@RequestBody()Branch branch){
        service.addBranch(branch);
        return new ResponseEntity<>("Successfully added",HttpStatus.CREATED);
}
}
