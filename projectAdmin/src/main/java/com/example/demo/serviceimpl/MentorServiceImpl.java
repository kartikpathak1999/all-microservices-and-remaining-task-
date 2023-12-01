package com.example.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Mentor;
import com.example.demo.repository.MentorRepository;
import com.example.demo.service.MentorService;

@Service
public class MentorServiceImpl implements MentorService {
    private final MentorRepository mentorRepository;

    public MentorServiceImpl(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    @Override
    public Mentor getMentorById(Long id) {
        return mentorRepository.findById(id).orElse(null);
    }

    @Override
    public Mentor createMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    // Implement other methods defined in the MentorService interface
}
