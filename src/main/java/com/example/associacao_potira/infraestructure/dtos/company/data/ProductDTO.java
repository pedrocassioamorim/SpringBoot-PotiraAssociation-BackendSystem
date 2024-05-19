package com.example.associacao_potira.infraestructure.dtos.company.data;

import com.example.associacao_potira.domain.company.data.Product;
import com.example.associacao_potira.domain.enums.cannabis.Nature;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.io.Serializable;

public class ProductDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Nature nature;

    private String imageURL;

    @Column(columnDefinition = "TEXT")
    private String description;


    public ProductDTO() {}

    public ProductDTO(Product product){
        this.id = product.getId();
        this.name = product.getName();
        this.nature = product.getNature();
        this.imageURL = product.getImageURL();
        this.description = product.getDescription();
    }
}
