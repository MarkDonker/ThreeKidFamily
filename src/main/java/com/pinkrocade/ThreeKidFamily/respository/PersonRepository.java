package com.pinkrocade.ThreeKidFamily.respository;

import com.pinkrocade.ThreeKidFamily.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
