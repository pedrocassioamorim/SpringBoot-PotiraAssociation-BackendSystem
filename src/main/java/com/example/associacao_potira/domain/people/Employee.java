package com.example.associacao_potira.domain.people;

import com.example.associacao_potira.infraestructure.enums.Department;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Employee {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String cpf;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    private String email;

    private String phone;

    private String address;

    private Double salary;

    @Enumerated(EnumType.STRING)
    private Department department;






}
