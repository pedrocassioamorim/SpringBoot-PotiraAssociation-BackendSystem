package com.example.associacao_potira.domain.mushrooms;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.TimerTask;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Mushroom {

    @Id
    private Long id;

    private String name;

    private String imageURL;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Duration lifeCycleInDays;
}
