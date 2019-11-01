package com.oportunit.demo.repository;

import com.oportunit.demo.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends MongoRepository<Person, String> {
}
