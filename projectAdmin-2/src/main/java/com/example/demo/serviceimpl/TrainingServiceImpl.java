package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Training;
import com.example.demo.repository.TrainingRepository;
import com.example.demo.service.TrainingService;

//TrainingServiceImpl class
@Service
public class TrainingServiceImpl implements TrainingService {
 private final TrainingRepository trainingRepository;

 public TrainingServiceImpl(TrainingRepository trainingRepository) {
     this.trainingRepository = trainingRepository;
 }

 @Override
 public List<Training> getTrainingsByMentorId(Long mentorId) {
     return trainingRepository.findByMentorId(mentorId);
 }

 @Override
 public Training createTraining(Training training) {
     return trainingRepository.save(training);
 }


}
