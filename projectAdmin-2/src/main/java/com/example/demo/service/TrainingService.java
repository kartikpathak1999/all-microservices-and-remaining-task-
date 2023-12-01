package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Mentor;
import com.example.demo.entity.Training;
import com.example.demo.repository.TrainingRepository;


//TrainingService interface
public interface TrainingService {
 List<Training> getTrainingsByMentorId(Long mentorId);

 Training createTraining(Training training);
}
