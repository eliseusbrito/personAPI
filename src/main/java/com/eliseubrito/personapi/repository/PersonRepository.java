package com.eliseubrito.personapi.repository;

import com.eliseubrito.personapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
