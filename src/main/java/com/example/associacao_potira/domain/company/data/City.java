package com.example.associacao_potira.domain.company.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class City {

    @Id @EqualsAndHashCode.Include
    private Long id;

    private String name;

    @ManyToOne
    private State state;


}
