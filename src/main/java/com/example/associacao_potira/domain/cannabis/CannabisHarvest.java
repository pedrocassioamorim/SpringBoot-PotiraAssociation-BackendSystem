package com.example.associacao_potira.domain.cannabis;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

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
        Long days = cannabis.getLifeCycleInWeeks();
        Instant endOfLife = begin.plus(Duration.ofDays(days));
        Duration quantoFalta = Duration.between(Instant.now(), endOfLife);
        return quantoFalta.abs();
    }

    @ManyToMany
    @JoinTable( name = "harvest_clones",
            joinColumns = @JoinColumn(name = "harvest_id"),
            inverseJoinColumns = @JoinColumn(name = "clones_id"))
    private List<Clone> clones;

}
