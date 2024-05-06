package com.example.associacao_potira.domain.cannabis;

import com.example.associacao_potira.infraestructure.enums.Specie;
import com.example.associacao_potira.infraestructure.enums.Tested;
import com.example.associacao_potira.infraestructure.enums.TypeOfPlant;
import com.example.associacao_potira.domain.honey.Honey;
import jakarta.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cannabis {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @EqualsAndHashCode.Include
    private Long id;

    private String name;

    @Column(name = "image")
    private String imageURL;

    @Enumerated(EnumType.STRING)
    private Specie specie;

    @Enumerated(EnumType.STRING)
    private TypeOfPlant type;

    private BigDecimal level;

    @Column(name = "price_gram")
    private BigDecimal priceG;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    private Tested tested;

    @Column(name = "life_in_weeks")
    private Long lifeCycleInWeeks;

    @OneToOne(mappedBy = "cannabis")
    private Honey honey = new Honey();

    @OneToMany
    private List<Clone> clones = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "product_plants",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "plant_id")
    )
    private Set<CannabisProduct> products= new HashSet<>();

}
