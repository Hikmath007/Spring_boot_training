package com.example.LearningApp.dto;

import lombok.Data;

	
@Data
public class EnrollmentDto {
	private Long id;
	private UserDto user;
	private CourseDto course;
}