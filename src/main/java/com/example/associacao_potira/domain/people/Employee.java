package com.example.associacao_potira.domain.people;

import com.example.associacao_potira.infraestructure.enums.Department;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Employee {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @EqualsAndHashCode.Include
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private String address;

    @Enumerated(EnumType.STRING)
    private Department department;




}
