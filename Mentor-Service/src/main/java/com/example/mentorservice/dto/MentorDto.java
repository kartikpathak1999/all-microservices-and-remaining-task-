package com.example.mentorservice.dto;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "UserDto Model Info"
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MentorDto {
    private Long id;

    @Schema(
            description = "Mentor Name"
    )
    @NotEmpty(message = "Mentor Name should not be null or empty")
    private String name;

    @Schema(
            description = "Mentor teachingdomain"
    )
    @NotEmpty(message = "Mentor teachingdomain should not be null or empty")
	private String teachingdomain;
    
    @Schema(
            description = "Mentor trainingStartDate"
    )
    //@NotEmpty(message = "Mentor trainingStartDate should not be null or empty")
	private LocalDate trainingStartDate;
    
    @Schema(
            description = "Mentor trainingEndDate"
    )
    //@NotEmpty(message = "Mentor trainingEndDate should not be null or empty")
    private LocalDate trainingEndDate;
    
    
    @Schema(
            description = "Mentor Email"
    )
    @NotEmpty(message = "Mentor email should not be null or empty")
    @Email(message = "Email should be valid")
    private String email;
}
