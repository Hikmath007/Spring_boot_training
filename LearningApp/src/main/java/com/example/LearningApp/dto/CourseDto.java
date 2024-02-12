package com.example.LearningApp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseDto {
	private Long courseId;
	private String title;
	private String category;
	private Long authorId;
}

