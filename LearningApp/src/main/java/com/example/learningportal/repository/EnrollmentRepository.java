package com.example.learningportal.repository;

import com.example.learningportal.entity.Course;
import com.example.learningportal.entity.Enrollment;
import com.example.learningportal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    boolean existsByCourseAndUser(Course course, User user);
}
