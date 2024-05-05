package com.example.associacao_potira.domain.people.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class State {

    @Id
    private Long id;

    private String name;
}
