package com.example.movies_library_tester_at.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long Id;
    private String name;

    @ManyToMany
    @JsonIgnoreProperties("movies")
    private List<Person> watchers;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getWatchers() {
        return watchers;
    }

    public void setWatchers(List<Person> watchers) {
        this.watchers = watchers;
    }
}
