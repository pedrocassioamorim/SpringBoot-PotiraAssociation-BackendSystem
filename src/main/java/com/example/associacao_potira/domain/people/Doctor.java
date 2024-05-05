package com.example.associacao_potira.domain.people;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Doctor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @EqualsAndHashCode.Include
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    @Column(unique = true, nullable = false)
    private String crm;

    private String address;


}
