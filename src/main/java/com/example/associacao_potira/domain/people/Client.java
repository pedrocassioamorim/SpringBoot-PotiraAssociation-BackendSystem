package com.example.associacao_potira.domain.people;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private String address;

    private String city;

    private String state;

    private String zip;

    private String country;

    @Column(nullable = false)
    private String identificationNumber;


}
