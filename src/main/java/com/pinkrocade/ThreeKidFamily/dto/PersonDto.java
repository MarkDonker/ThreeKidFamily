package com.pinkrocade.ThreeKidFamily.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
public class PersonDto {
    private Long id;
    private String name;
    private LocalDate birthDate;
    private ReferenceDto parent1;
    private ReferenceDto parent2;
    private ReferenceDto partner;
    private List<ReferenceDto> children;
}
