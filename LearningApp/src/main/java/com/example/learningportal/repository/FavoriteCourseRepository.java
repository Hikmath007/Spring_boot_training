package com.example.learningportal.repository;

import com.example.learningportal.entity.Course;
import com.example.learningportal.entity.User;
import com.example.learningportal.entity.FavoriteCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FavoriteCourseRepository extends JpaRepository<FavoriteCourse, Long> {

    boolean existsByCourseAndUser(Course course, User user);
}
