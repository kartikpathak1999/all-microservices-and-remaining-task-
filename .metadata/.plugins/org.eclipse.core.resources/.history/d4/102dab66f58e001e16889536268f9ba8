package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Training;

public interface TrainingRepository extends JpaRepository<Training, Long> {
    
	List<Training> findByMentorId(Long mentorId);
    // Other custom queries
}
