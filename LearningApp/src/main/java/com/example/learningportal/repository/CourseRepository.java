package com.example.learningportal.repository;

import com.example.learningportal.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByCategory(String category);
}
