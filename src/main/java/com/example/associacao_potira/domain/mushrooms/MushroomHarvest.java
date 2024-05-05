package com.example.associacao_potira.domain.mushrooms;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Duration;
import java.time.Instant;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MushroomHarvest {

    @Id
    private Long id;

    @ManyToOne
    private Mushroom mushroom;

    private Instant begin = Instant.now();

    public Duration getDuration() {
        Instant endOfCyle = begin.plus(mushroom.getLifeCycleInDays());
        Duration duration = Duration.between(Instant.now(), endOfCyle);
        return duration;
    }

}
