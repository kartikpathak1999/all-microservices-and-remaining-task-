package com.example.mentorservice.mapper;

import com.example.mentorservice.dto.MentorDto;
import com.example.mentorservice.entity.Mentor;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-30T01:33:49+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.9 (Eclipse Adoptium)"
)
public class AutoMentorMapperImpl implements AutoMentorMapper {

    @Override
    public MentorDto mapToMentorDto(Mentor mentor) {
        if ( mentor == null ) {
            return null;
        }

        MentorDto mentorDto = new MentorDto();

        mentorDto.setEmail( mentor.getEmail() );
        mentorDto.setId( mentor.getId() );
        mentorDto.setName( mentor.getName() );
        mentorDto.setTeachingdomain( mentor.getTeachingdomain() );
        mentorDto.setTrainingEndDate( mentor.getTrainingEndDate() );
        mentorDto.setTrainingStartDate( mentor.getTrainingStartDate() );

        return mentorDto;
    }

    @Override
    public Mentor mapToMentor(MentorDto mentorDto) {
        if ( mentorDto == null ) {
            return null;
        }

        Mentor mentor = new Mentor();

        mentor.setEmail( mentorDto.getEmail() );
        mentor.setId( mentorDto.getId() );
        mentor.setName( mentorDto.getName() );
        mentor.setTeachingdomain( mentorDto.getTeachingdomain() );
        mentor.setTrainingEndDate( mentorDto.getTrainingEndDate() );
        mentor.setTrainingStartDate( mentorDto.getTrainingStartDate() );

        return mentor;
    }
}
