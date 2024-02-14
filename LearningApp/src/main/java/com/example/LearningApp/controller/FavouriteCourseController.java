package com.example.LearningApp.controller;

import com.example.LearningApp.dto.FavouriteCourseDto;
import com.example.LearningApp.entity.Course;
import com.example.LearningApp.entity.FavouriteCourse;
import com.example.LearningApp.entity.User;
import com.example.LearningApp.service.CourseService;
import com.example.LearningApp.service.FavouriteCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favorite-courses")
public class FavouriteCourseController {

	private static final com.example.LearningApp.entity.User User = null;

	@Autowired
	@Qualifier("favouriteCourseService")
	private FavouriteCourseService favoriteCourseService;

	@Autowired
	private CourseService courseService; // Import your CourseService

	@PostMapping("/add")
	public ResponseEntity<FavouriteCourse> addFavoriteCourse(@RequestBody FavouriteCourseDto favoriteCourseDto,
			@RequestAttribute("user") User user) {
		FavouriteCourse favouriteCourse = new FavouriteCourse();

		// Set the User object
		favouriteCourse.setUser(user);

		// Assuming favoriteCourseDTO.getCourseId() returns the ID of the course
		// Fetch the Course entity from the database based on the ID
		Course course = courseService.findById(favouriteCourseDto.getCourseId()); // You need to have a method in your service to fetch the Course by ID

		if (course == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		// Set the Course object
		favouriteCourse.setCourse(course);

		// Add the FavoriteCourse
		FavouriteCourse addedFavoriteCourse = favoriteCourseService.addFavoriteCourse(user, favouriteCourse);

		return new ResponseEntity<>(addedFavoriteCourse, HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<FavouriteCourse>> getAllFavouriteCourses(@RequestAttribute("user") User user) {
		List<FavouriteCourse> favouriteCourses = FavouriteCourseService.getAllFavouriteCourses(User);
		return new ResponseEntity<>(favouriteCourses, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<FavouriteCourse> removeFavoriteCourse(@PathVariable("id") Long id,
			@RequestAttribute("user") User user) {
		favoriteCourseService.removeFavouriteCourse(user, id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}