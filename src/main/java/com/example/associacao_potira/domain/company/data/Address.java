package com.example.associacao_potira.domain.company.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Address {

    @Id
    private Long id;

    private String street;

    private String number;

    private String complement;

    @ManyToOne
    private City city;

    @ManyToOne
    private State state;
}
