package com.example.associacao_potira.domain.honey;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @Entity @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class HoneyProduct {

    @Id
    private Long id;




}
