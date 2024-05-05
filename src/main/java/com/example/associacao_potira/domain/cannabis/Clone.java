package com.example.associacao_potira.domain.cannabis;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Clone {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne
    private Cannabis cannabis;
}
