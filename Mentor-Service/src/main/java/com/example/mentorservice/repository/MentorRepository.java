package com.example.mentorservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mentorservice.entity.Mentor;
@Repository
public interface MentorRepository extends JpaRepository<Mentor, Long> {
        Optional<Mentor> findByEmail(String email);
}
