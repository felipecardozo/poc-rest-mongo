package com.oportunit.demo.repository;

import com.oportunit.demo.domain.RPerson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPeopleRepository extends CrudRepository<RPerson, Long> {
}
