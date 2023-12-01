package com.example.mentorservice.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="mentors")
public class Mentor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false, unique = true)
	private String teachingdomain;
	@Column(nullable = false, unique = true)
	private LocalDate trainingStartDate;
	@Column(nullable = false, unique = true)
    private LocalDate trainingEndDate;
    
    
}
