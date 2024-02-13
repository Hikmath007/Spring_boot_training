package com.example.LearningApp.service.Implementation;

import com.example.LearningApp.entity.FavouriteCourse;
import com.example.LearningApp.entity.User;
import com.example.LearningApp.repository.FavouriteCourseRepository;
import com.example.LearningApp.service.FavouriteCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavouriteCourseServiceImpl extends FavouriteCourseService {
	@Autowired
	private FavouriteCourseRepository favouriteCourseRepository;

	@Override
	public FavouriteCourse addFavouriteCourse(User user, FavouriteCourse favouriteCourse) {
		if (favouriteCourseRepository.existsByCourseAndUser(favouriteCourse.getCourse(), user)) {
			throw new IllegalArgumentException("Course is already added to favorites.");
		}
		favouriteCourse.setUser(user);
		return favouriteCourseRepository.save(favouriteCourse);
	}
}