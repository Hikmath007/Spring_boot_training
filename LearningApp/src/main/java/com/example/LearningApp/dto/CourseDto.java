package com.example.LearningApp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CourseDto {
	private Long courseId;
	private String title;
	private String category;
	private Long authorId;
}
