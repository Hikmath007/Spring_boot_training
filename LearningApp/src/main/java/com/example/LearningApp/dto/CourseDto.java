package com.example.LearningApp.dto;

import lombok.Data;

@Data
public class CourseDto {
	private Long Id;
	private String title;
	private String category;
	private Long author;
	private String password;

}
