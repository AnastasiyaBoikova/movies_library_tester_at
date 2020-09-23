package com.example.movies_library_tester_at.controller;

import com.example.movies_library_tester_at.model.Passport;
import com.example.movies_library_tester_at.repository.PassportRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassportController {

    PassportRepository passportRepository;

    public PassportController(PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
    }

    @GetMapping("/passport")
    public List<Passport> getAll() {
        return passportRepository.findAll();

    }


}
