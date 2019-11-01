package com.oportunit.demo.controller;

import com.oportunit.demo.domain.Person;
import com.oportunit.demo.domain.RPerson;
import com.oportunit.demo.repository.PeopleRepository;
import com.oportunit.demo.repository.RPeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PeopleRepository repository;

    @Autowired
    private RPeopleRepository repositoryR;

    @GetMapping("/add")
    public String addPerson(){
        Person person = new Person();

        person.setName("Andres Res");

        repository.save(person);

        return "OK ";
    }

    @GetMapping("/r/add")
    public String addRPerson(){
        RPerson person = new RPerson();
        person.setName("John Doe");

        repositoryR.save(person);

        return "OK";
    }

    @GetMapping("/list")
    public List<Person> getPeople(){
        return repository.findAll();
    }

    @GetMapping("/r/list")
    public Iterable<RPerson> getRPeople(){
        return repositoryR.findAll();
    }
}
