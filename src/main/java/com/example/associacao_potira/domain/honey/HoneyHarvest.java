package com.example.associacao_potira.domain.honey;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Duration;
import java.time.Instant;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class HoneyHarvest {

    @Id
    private Long id;

    private Instant begin = Instant.now();

    @ManyToOne
    @JoinColumn(name = "honey_id", nullable = false)
    private Honey honey;

    public Duration getDuration() {
        Instant endOfCycle = begin.plus(honey.getLifeCycleInDays());
        return Duration.between(Instant.now(), endOfCycle);
    }

}
