package com.example.test.demoTest;

import com.example.test.demoTest.Models.Grant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrantRepository extends JpaRepository<Grant,Integer> {
}
