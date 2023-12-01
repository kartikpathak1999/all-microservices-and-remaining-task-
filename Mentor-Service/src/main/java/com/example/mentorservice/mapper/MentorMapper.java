package com.example.mentorservice.mapper;

import com.example.mentorservice.dto.MentorDto;
import com.example.mentorservice.entity.Mentor;

public class MentorMapper {
    //convert Mentor JPA entity to MentorDTO
    public static MentorDto mapToMentorDto(Mentor mentor){
        MentorDto mentorDto = new MentorDto(
                mentor.getId(),
                mentor.getName(),
                mentor.getTeachingdomain(),
                mentor.getTrainingStartDate(),
                mentor.getTrainingEndDate(),
                mentor.getEmail()
        );
        return mentorDto;
    }


    //convert UserDto into Mentor JPA entity
    public static Mentor mapToMentor(MentorDto mentorDto){
        Mentor mentor = new Mentor(
                mentorDto.getId(),
                mentorDto.getName(),
                mentorDto.getEmail(),
                mentorDto.getTeachingdomain(),
                mentorDto.getTrainingStartDate(),
                mentorDto.getTrainingEndDate()
        );
        return mentor;
    }
}
