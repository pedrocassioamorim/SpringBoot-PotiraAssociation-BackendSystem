package com.example.associacao_potira.domain.mushrooms;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MushroomProduct {
    @Id
    private Long id;

    private String name;

    private String description;

    private String imageURL;

    @Column(name = "price_kg")
    private BigDecimal priceKG;



}
