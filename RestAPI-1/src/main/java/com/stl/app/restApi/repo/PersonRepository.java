package com.stl.app.restApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stl.app.restApi.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}