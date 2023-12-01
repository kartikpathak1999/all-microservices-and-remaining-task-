package com.example.demo.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Mentor;
import com.example.demo.service.MentorService;

@RestController
@RequestMapping("/api/mentors")
public class MentorController {
    private final MentorService mentorService;

    public MentorController(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    // Endpoint to get a mentor by ID
    @GetMapping("/{id}")
    public ResponseEntity<Mentor> getMentorById(@PathVariable Long id) {
        // Implement logic to retrieve a mentor by ID using mentorService
        Mentor mentor = mentorService.getMentorById(id);
        if (mentor != null) {
            return ResponseEntity.ok(mentor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint to create a new mentor
    @PostMapping("/create")
    public ResponseEntity<Mentor> createMentor(@RequestBody Mentor mentor) {
        // Implement logic to create a new mentor using mentorService
        Mentor createdMentor = mentorService.createMentor(mentor);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMentor);
    }

    // Other endpoints for update, delete, get all mentors, etc.
}
