package com.example.LearningApp.dto;

import com.example.LearningApp.entity.Course;
import lombok.Data;

@Data
public class FavouriteCourseDto {
	private Long id;
	private UserDto user;
	private CourseDto course;

	public Course getCourseId() {
		return null;
	}
}
