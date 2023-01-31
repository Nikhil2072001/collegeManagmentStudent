package com.example.test.demoTest;

import com.example.test.demoTest.Models.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch,Integer> {
}
