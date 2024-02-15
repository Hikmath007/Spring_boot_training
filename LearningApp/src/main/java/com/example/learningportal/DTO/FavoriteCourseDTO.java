package com.example.learningportal.DTO;

import lombok.Data;

@Data
public class FavoriteCourseDTO {
    private Long id;
    private UserDTO user;
    private CourseDTO course;
}

