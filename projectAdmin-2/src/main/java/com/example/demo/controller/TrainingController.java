package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Training;
import com.example.demo.service.TrainingService;

@RestController
@RequestMapping("/api/trainings")
public class TrainingController {
    private final TrainingService trainingService;

    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    // Endpoint to get trainings by Mentor ID
    @GetMapping("{mentorId}")
    public ResponseEntity<List<Training>> getTrainingsByMentorId(@PathVariable Long mentorId) {
        List<Training> trainings = trainingService.getTrainingsByMentorId(mentorId);
        if (!trainings.isEmpty()) {
            return ResponseEntity.ok(trainings);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint to create a new training
    @PostMapping("/create")
    public ResponseEntity<Training> createTraining(@RequestBody Training training) {
        Training createdTraining = trainingService.createTraining(training);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTraining);
    }
}