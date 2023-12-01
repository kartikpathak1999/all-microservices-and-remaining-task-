package com.example.mentorservice.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.mentorservice.dto.MentorDto;
import com.example.mentorservice.entity.Mentor;


@Mapper
public interface AutoMentorMapper {

    AutoMentorMapper MAPPER = Mappers.getMapper(AutoMentorMapper.class);

    MentorDto mapToMentorDto(Mentor mentor);
    Mentor mapToMentor(MentorDto mentorDto);

}
