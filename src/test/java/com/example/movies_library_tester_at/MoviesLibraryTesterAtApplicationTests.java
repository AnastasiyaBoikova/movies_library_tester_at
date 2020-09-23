package com.example.movies_library_tester_at;

import com.example.movies_library_tester_at.model.Movie;
import com.example.movies_library_tester_at.model.Passport;
import com.example.movies_library_tester_at.model.Person;
import com.example.movies_library_tester_at.repository.MovieRepository;
import com.example.movies_library_tester_at.repository.PassportRepository;
import com.example.movies_library_tester_at.repository.PersonRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@SpringBootTest
class MoviesLibraryTesterAtApplicationTests {

    @Autowired
    PassportRepository passportRepository;
    @Autowired
    PersonRepository personRepository;
    @Autowired
    MovieRepository movieRepository;



    @Test
    void contextLoads() {

        List<Passport> all = passportRepository.findAll();
        List<Person> personAll = personRepository.findAll();
        List<Movie> movieAll = movieRepository.findAll();


        Assertions.assertThat(all).size().isEqualTo(1);
        Assertions.assertThat(movieAll).size().isEqualTo(2);
        Assertions.assertThat(personAll).size().isEqualTo(1);

    }

}
