package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Mentor;


import java.util.List;

// Mentor repository
public interface MentorRepository extends JpaRepository<Mentor, Long> {
    // Custom queries if needed
}



