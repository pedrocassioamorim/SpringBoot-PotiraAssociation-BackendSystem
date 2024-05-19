package com.example.associacao_potira.domain.company.data;

import com.example.associacao_potira.domain.enums.cannabis.Nature;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Nature nature;

    @Column(name = "image")
    private String imageURL;

    @Column(columnDefinition = "TEXT")
    private String description;



}
