package com.example.associacao_potira.domain.honey;

import com.example.associacao_potira.domain.cannabis.Cannabis;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Duration;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Honey {

    @Id
    private Long id;

    private String nome;

    private String descricao;

    @OneToOne
    private Cannabis cannabis;

    @Column(name = "life_in_days")
    private Duration lifeCycleInDays;
}
