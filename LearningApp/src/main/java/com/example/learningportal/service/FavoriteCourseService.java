package com.example.learningportal.service;

import com.example.learningportal.UnauthorizedException;
import com.example.learningportal.entity.User;
import com.example.learningportal.entity.FavoriteCourse;
import com.example.learningportal.repository.FavoriteCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteCourseService {
    @Autowired
    private FavoriteCourseRepository favoriteCourseRepository;

    @Autowired
    private UserService userService;

    public FavoriteCourse addFavoriteCourse(User user, FavoriteCourse favoriteCourse) {

        if (userService.isLearner(user)) {

            return favoriteCourseRepository.save(favoriteCourse);
        } else {
            throw new UnauthorizedException("Only learners can add favorite courses.");
        }
    }


}
