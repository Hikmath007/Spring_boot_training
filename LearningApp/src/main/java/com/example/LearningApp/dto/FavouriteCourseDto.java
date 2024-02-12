package com.example.LearningApp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FavouriteCourseDto {
	private Long favouriteId;
	private Long courseId;
	private Long userId;
}
