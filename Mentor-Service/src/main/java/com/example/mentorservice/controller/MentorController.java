package com.example.mentorservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mentorservice.dto.MentorDto;
import com.example.mentorservice.service.MentorService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Tag(
     name = "CRUD REST API for Mentor-Service Resources ",
        description = "Create Mentor "
)
@RestController
@AllArgsConstructor
@RequestMapping("/api/mentors")
public class MentorController {
	@Autowired
    private MentorService mentorService;

    //build create mentor REST API
    @Operation(
            summary = "Create Mentor-Service REST API",
            description = "Create Mentor REST API is used to save Mentor in database "
    )
    @ApiResponse(
            responseCode = "202",
            description = "HTTP status 201 created"
    )
    @PostMapping
    public ResponseEntity<MentorDto> createMentor(@Valid @RequestBody MentorDto mentor){
        MentorDto savedMentor = mentorService.createMentor(mentor);
        return new ResponseEntity<>(savedMentor, HttpStatus.CREATED);
    }
/*
    @Operation(
            summary = "Get Mentor-Service API",
            description = "Get Mentor-Service API is used to get mentor from database "
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP status 200 success"
    )*/
    /*@GetMapping("/{id}")
    public ResponseEntity<MentorDto> getMentorById(@PathVariable("id") Long mentorId){
        MentorDto mentor =  mentorService.getMentorById(mentorId);
        return new ResponseEntity<>(mentor,HttpStatus.OK);
    }

    @Operation(
            summary = "Get all Mentor REST API",
            description = "Get Mentor REST API is used to Get all the mentor from database "
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP status 200 ok"
    )
    @GetMapping()
    public ResponseEntity<List<MentorDto>> getAllMentors(){
        List<MentorDto> users = mentorService.getAllMentors();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }


    @Operation(
            summary = "Update User REST API",
            description = "Update User REST API is used to update user in database "
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP status 200 Ok"
    )
    @PutMapping("/{id}")
    public ResponseEntity<MentorDto> updateUser(@PathVariable("id") Long userId,@RequestBody @Valid MentorDto user){
        user.setId(userId);
        MentorDto updatedUser = mentorService.updateUser(user);
        return new ResponseEntity<>(updatedUser,HttpStatus.OK);
    }

    @Operation(
            summary = "Delete User REST API",
            description = "Delete User REST API is used to delete user in database "
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP status 200 Success"
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        mentorService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted",HttpStatus.OK);
*/    

//    @ExceptionHandler(ResourceNotFoundException.class)
//    public  ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException exception, WebRequest webRequest){
//        ErrorDetails errorDetails = new ErrorDetails(
//                LocalDateTime.now(),
//                exception.getMessage(),
//                webRequest.getDescription(false),
//                "User Not Found"
//        );
//        return  new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
//
//    }

}
