package com.example.LearningApp.service;

import com.example.LearningApp.UnauthorizedException;
import com.example.LearningApp.entity.FavouriteCourse;
import com.example.LearningApp.entity.User;
import com.example.LearningApp.repository.FavouriteCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavouriteCourseService {
    @Autowired
    private FavouriteCourseRepository favouriteCourseRepository;

    @Autowired
    private UserService userService;

    public FavouriteCourse addFavoriteCourse(User user, FavouriteCourse favouriteCourse) {

        if (userService.isLearner(user)) {

            return favouriteCourseRepository.save(favouriteCourse);
        } else {
            throw new UnauthorizedException("Only learners can add favorite courses.");
        }
    }


    public List<FavouriteCourse> getAllFavouriteCourses(User user) {
        return null;
    }

    public void removeFavouriteCourse(User user, Long id) {

    }


	public FavouriteCourse addFavouriteCourse(User user, FavouriteCourse favouriteCourse) {
		// TODO Auto-generated method stub
		return null;
	}
}