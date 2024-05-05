package com.example.associacao_potira.domain.people.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Permission {

    @Id
    private Long id;

    private String nome;

    private String description;
}
