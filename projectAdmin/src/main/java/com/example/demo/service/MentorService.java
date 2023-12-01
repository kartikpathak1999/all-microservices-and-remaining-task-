package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Mentor;

public interface MentorService {
    Mentor getMentorById(Long id);
    Mentor createMentor(Mentor mentor);
    // Other method declarations as needed
}



