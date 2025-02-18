package com.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.poc.entity.Coach;
import com.poc.service.CoachService;

import java.util.List;

@RestController
@RequestMapping("/coaches")
public class CoachController {

    @Autowired
    private CoachService coachService; // Injecting the service

    @GetMapping
    public List<Coach> getAllCoaches() {
        return coachService.getAllCoaches(); // Using service layer
    }

    @PostMapping
    public Coach addCoach(@RequestBody Coach coach) {
        return coachService.saveCoach(coach); // Using service layer
    }

    @GetMapping("/{id}")
    public Coach getCoachById(@PathVariable int id) {
        return coachService.getCoachById(id); // Using service layer
    }
}
