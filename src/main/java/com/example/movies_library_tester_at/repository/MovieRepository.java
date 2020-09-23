package com.example.movies_library_tester_at.repository;

import com.example.movies_library_tester_at.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {


}
