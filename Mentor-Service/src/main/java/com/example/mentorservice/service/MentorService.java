package com.example.mentorservice.service;

import org.springframework.stereotype.Service;

import com.example.mentorservice.dto.MentorDto;
@Service
public interface MentorService {
    MentorDto createMentor(MentorDto mentor);
    //MentorDto getUserById(Long userId);

    //List<MentorDto> getAllUsers();

    //MentorDto updateUser(MentorDto user);

    //void deleteUser(Long userId);
}
