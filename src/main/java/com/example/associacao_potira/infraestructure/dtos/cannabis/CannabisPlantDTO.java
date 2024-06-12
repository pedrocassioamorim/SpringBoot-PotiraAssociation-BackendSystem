package com.example.associacao_potira.infraestructure.dtos.cannabis;

import com.example.associacao_potira.domain.cannabis.CannabisPlant;
import com.example.associacao_potira.domain.cannabis.CannabisProduct;
import com.example.associacao_potira.domain.cannabis.seed.Clone;
import com.example.associacao_potira.domain.enums.cannabis.Nature;
import com.example.associacao_potira.domain.enums.cannabis.Specie;
import com.example.associacao_potira.domain.enums.cannabis.Tested;
import com.example.associacao_potira.domain.honey.Honey;
import jakarta.persistence.*;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CannabisPlantDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String imageURL;

    @Enumerated(EnumType.STRING)
    private Specie specie;

    @Enumerated(EnumType.STRING)
    private Nature nature;

    private BigDecimal level;

    private BigDecimal priceG;

    private String description;

    @Enumerated(EnumType.STRING)
    private Tested tested;

    private Long lifeCycleInWeeks;

    private Honey honey = new Honey();

    private List<Clone> clones = new ArrayList<>();

    private List<CannabisProduct> products= new ArrayList<>();



    public CannabisPlantDTO() {}

    public CannabisPlantDTO(CannabisPlant cannabisPlant){
        this.id = cannabisPlant.getId();
        this.name = cannabisPlant.getName();
        this.imageURL = cannabisPlant.getImageURL();
        this.specie = cannabisPlant.getSpecie();
        this.nature = cannabisPlant.getNature();
        this.level = cannabisPlant.getLevel();
        this.priceG = cannabisPlant.getPriceG();
        this.description = cannabisPlant.getDescription();
        this.tested = cannabisPlant.getTested();
        this.lifeCycleInWeeks = cannabisPlant.getLifeCycleInWeeks();
        this.honey = cannabisPlant.getHoney();
        this.clones = cannabisPlant.getClones();
        this.products = cannabisPlant.getProducts();
    }
}
