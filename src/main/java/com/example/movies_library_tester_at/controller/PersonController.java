package com.example.movies_library_tester_at.controller;

import com.example.movies_library_tester_at.model.Movie;
import com.example.movies_library_tester_at.model.Passport;
import com.example.movies_library_tester_at.model.Person;
import com.example.movies_library_tester_at.repository.MovieRepository;
import com.example.movies_library_tester_at.repository.PassportRepository;
import com.example.movies_library_tester_at.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private PersonRepository personRepository;
    private PassportRepository passportRepository;
    private MovieRepository movieRepository;

    public PersonController(PersonRepository personRepository, PassportRepository passportRepository, MovieRepository movieRepository) {
        this.personRepository = personRepository;
        this.passportRepository = passportRepository;
        this.movieRepository = movieRepository;
    }

    @GetMapping("/person")
    public List<Person> getAll() {
        return personRepository.findAll();

    }

    @GetMapping("/person/passport/{passportId}")
    public Person getOne(@PathVariable String passportId) {
        return personRepository.findPersonByPassportNumber(passportId);

    }


    @GetMapping("/generate")
    public Person generateData() {
        Person person = new Person();
        person.setName("Vlad");

        Passport passport = new Passport();
        passport.setNumber("123456");
        passportRepository.save(passport);

        passport.setOwner(person);
        person.setPassport(passport);

        return personRepository.save(person);

    }

    @GetMapping("/generateMovie")
    public Person generateMovie() {
        Person person = new Person();
        person.setName("Vlad");

        Movie titanic = new Movie();
        titanic.setName("Titanic");
        Movie inception = new Movie();
        inception.setName("Inception");

        movieRepository.save(titanic);
        movieRepository.save(inception);
        titanic.setWatchers(List.of(person));
        inception.setWatchers(List.of(person));

        person.setMovies(List.of(titanic,inception));

        return personRepository.save(person);

    }


}
