
package com.example.internship.controller;

import com.example.internship.entity.Interns;
import com.example.internship.repository.InternsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interns")
public class InternsController {

    private final InternsRepository internsRepository;

    @Autowired
    public InternsController(InternsRepository internsRepository) {
        this.internsRepository = internsRepository;
    }

    @GetMapping
    public List<String> getInternNamesByDepartment(@PathVariable String department) {
        return internsRepository.findInternNamesByDepartment(department);
    }
    @PostMapping
    public Interns addIntern(@RequestBody Interns interns) {
        internsRepository.save(interns);
        return internsRepository.save(interns);
    }
}
