package com.example.LearningApp.controller;

import com.example.LearningApp.entity.FavouriteCourse;
import com.example.LearningApp.entity.User;
import com.example.LearningApp.service.FavouriteCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/favourite-courses")
public class FavouriteCourseController {

	@Autowired
	private FavouriteCourseService favouriteCourseService;

	@PostMapping("/add")
	public ResponseEntity<FavouriteCourse> addFavouriteCourse(@RequestBody FavouriteCourse favouriteCourse, @RequestAttribute("user") User user) {
		FavouriteCourse addedFavouriteCourse = favouriteCourseService.addFavouriteCourse(user, favouriteCourse);
		return new ResponseEntity<>(addedFavouriteCourse, HttpStatus.CREATED);
	}


}
