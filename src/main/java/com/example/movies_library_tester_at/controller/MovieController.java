package com.example.movies_library_tester_at.controller;

import com.example.movies_library_tester_at.model.Movie;
import com.example.movies_library_tester_at.repository.MovieRepository;
import com.example.movies_library_tester_at.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

   private PersonRepository personRepository;
   private MovieRepository movieRepository;

    public MovieController(PersonRepository personRepository, MovieRepository movieRepository) {
        this.personRepository = personRepository;
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movie")
    public List<Movie> getMovies(){

        return movieRepository.findAll();
    }


}
