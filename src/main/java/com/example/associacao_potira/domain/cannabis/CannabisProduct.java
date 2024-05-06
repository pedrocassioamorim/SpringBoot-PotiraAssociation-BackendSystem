package com.example.associacao_potira.domain.cannabis;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CannabisProduct {

    @jakarta.persistence.Id @GeneratedValue(strategy = GenerationType.IDENTITY) @EqualsAndHashCode.Include
    private Long Id;

    private String type;

    private String name;

    @Column(name = "image")
    private String imageURL;

    private Integer dosage;

    @ManyToOne @JoinColumn(name = "cannabis_id")
    private Cannabis cannabis;

    @Column(columnDefinition = "TEXT")
    private String Description;

    private BigDecimal price;

    @ManyToMany(mappedBy = "products")
    private Set<Cannabis> plants = new HashSet<>();

}
