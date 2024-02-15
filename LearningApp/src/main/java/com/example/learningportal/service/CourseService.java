package com.example.learningportal.service;

import com.example.learningportal.UnauthorizedException;
import com.example.learningportal.entity.Course;
import com.example.learningportal.entity.User;
import com.example.learningportal.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private UserService userService;

    public List<Course> findByCategory(String category) {
        return courseRepository.findByCategory(category);
    }

    public Course createCourse(User user, Course course) {

        if (userService.isAuthor(user)) {
            course.setAuthor(user);
            return courseRepository.save(course);
        } else {
            throw new UnauthorizedException("Only authors can create courses.");
        }
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
