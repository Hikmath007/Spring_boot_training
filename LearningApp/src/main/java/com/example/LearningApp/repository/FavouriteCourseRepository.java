package com.example.LearningApp.repository;

import com.example.LearningApp.entity.FavouriteCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FavouriteCourseRepository extends JpaRepository<FavouriteCourse, Long> {

}
