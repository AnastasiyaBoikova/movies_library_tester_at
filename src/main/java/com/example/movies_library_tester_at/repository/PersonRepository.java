package com.example.movies_library_tester_at.repository;

import com.example.movies_library_tester_at.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findPersonByPassportNumber(String passportId);
}
