package com.example.LearningApp.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "favourite_courses")
@Getter
@Setter
public class FavouriteCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long favouriteId;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
