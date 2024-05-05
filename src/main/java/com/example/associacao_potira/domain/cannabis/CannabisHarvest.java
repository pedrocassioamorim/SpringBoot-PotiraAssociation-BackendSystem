package com.example.associacao_potira.domain.cannabis;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Duration;
import java.time.Instant;

@Entity @Data @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CannabisHarvest {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cannabis_id", nullable = false)
    private Cannabis cannabis;

    @Column(name = "clones", nullable = false)
    private Integer numberOfClones;

    @Column(nullable = false)
    private Instant begin = Instant.now();

    public Duration getDuration(){
        Instant endOfLife = begin.plus(cannabis.getLifeCycleInWeeks());
        Duration quantoFalta = Duration.between(Instant.now(), endOfLife);
        return quantoFalta.abs();
    }


}
