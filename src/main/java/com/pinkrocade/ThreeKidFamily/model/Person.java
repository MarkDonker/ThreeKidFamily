package com.pinkrocade.ThreeKidFamily.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Person {

    @Id
    private Long id;
    private String name;
    private LocalDate birthDate;
    @ElementCollection
    private List<Long> parents = new ArrayList<>();
    private Long partner;
    @ElementCollection
    private List<Long> children = new ArrayList<>();


}
