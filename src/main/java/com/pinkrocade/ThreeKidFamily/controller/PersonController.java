package com.pinkrocade.ThreeKidFamily.controller;

import com.pinkrocade.ThreeKidFamily.dto.PersonDto;
import com.pinkrocade.ThreeKidFamily.model.Person;
import com.pinkrocade.ThreeKidFamily.respository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;

    @PostMapping
    public ResponseEntity<List<Person>> addPerson(@RequestBody PersonDto personDto) {

    }

}
