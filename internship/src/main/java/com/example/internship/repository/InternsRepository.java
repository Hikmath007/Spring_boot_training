package com.example.internship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.internship.entity.Interns;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InternsRepository extends JpaRepository<Interns, Long> {

    @Query(value = "SELECT name FROM interns WHERE intern_department = :department", nativeQuery = true)
    List<String> findInternNamesByDepartment(@Param("department") String department);
}