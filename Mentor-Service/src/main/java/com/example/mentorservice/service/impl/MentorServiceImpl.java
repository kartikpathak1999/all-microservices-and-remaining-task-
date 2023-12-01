package com.example.mentorservice.service.impl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mentorservice.dto.MentorDto;
import com.example.mentorservice.entity.Mentor;
import com.example.mentorservice.exception.EmailAlreadyExistsException;
import com.example.mentorservice.mapper.AutoMentorMapper;
import com.example.mentorservice.repository.MentorRepository;
import com.example.mentorservice.service.MentorService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MentorServiceImpl implements MentorService {
	@Autowired
    private MentorRepository mentorRepository;


    private ModelMapper modelMapper;

    @Override
    public MentorDto createMentor(MentorDto mentorDto) {
        //convert MentorDto into User JPA entity
        //User user = UserMapper.mapToUser(userDto);
       // User user = modelMapper.map(userDto,User.class);

        Optional<Mentor> optionalMentor = mentorRepository.findByEmail(mentorDto.getEmail());

        if(optionalMentor.isPresent()){
            throw new EmailAlreadyExistsException("Email Already Exists for Mentor");
        }

        Mentor mentor = AutoMentorMapper.MAPPER.mapToMentor(mentorDto);
        Mentor savedMentor = mentorRepository.save(mentor);

        //convert User JPA entity into UserDto
       // UserDto savedUserDto = UserMapper.mapToUserDto(savedUser);
        //UserDto savedUserDto = modelMapper.map(savedUser, UserDto.class);


        MentorDto savedMentorDto = AutoMentorMapper.MAPPER.mapToMentorDto(savedMentor);
         return savedMentorDto;
    }

	/*
	 * @Override public MentorDto getUserById(Long userId) {
	 * 
	 * Mentor mentor = mentorRepository.findById(userId).orElseThrow( ()-> new
	 * ResourceNotFoundException("User", "id", userId) ); // return
	 * UserMapper.mapToUserDto(user); //return modelMapper.map(user,UserDto.class);
	 * 
	 * 
	 * return AutoMentorMapper.MAPPER.mapToUserDto(mentor); }
	 * 
	 * @Override public List<MentorDto> getAllUsers() { List<Mentor> mentors =
	 * mentorRepository.findAll(); // return
	 * users.stream().map(UserMapper::mapToUserDto).collect(Collectors.toList()); //
	 * return users.stream().map((user) -> modelMapper.map(user,UserDto.class)
	 * ).collect(Collectors.toList());
	 * 
	 * 
	 * return mentors.stream().map((user) ->
	 * AutoMentorMapper.MAPPER.mapToUserDto(user)).collect(Collectors.toList()); }
	 * 
	 * @Override public MentorDto updateUser(MentorDto user) {
	 * 
	 * Mentor existingUser = mentorRepository.findById(user.getId()).orElseThrow( ()
	 * -> new ResourceNotFoundException("User", "id", user.getId()) );
	 * 
	 * existingUser.setFirstName(user.getFirstName());
	 * existingUser.setLastName(user.getLastName());
	 * existingUser.setEmail(user.getEmail()); Mentor updatedUser =
	 * mentorRepository.save(existingUser); // return
	 * UserMapper.mapToUserDto(updatedUser); //return
	 * modelMapper.map(updatedUser,UserDto.class);
	 * 
	 * 
	 * return AutoMentorMapper.MAPPER.mapToUserDto(updatedUser); }
	 * 
	 * @Override public void deleteUser(Long userId) { Mentor existingUser =
	 * mentorRepository.findById(userId).orElseThrow( () -> new
	 * ResourceNotFoundException("User", "id", userId) );
	 * mentorRepository.deleteById(userId); }
	 */

	/*
	 * @Override public MentorDto createMentor(MentorDto mentor) { // TODO
	 * Auto-generated method stub return null; }
	 */


}
