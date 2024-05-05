package com.example.associacao_potira.infraestructure.repositories.interfaces.mushrooms;

import com.example.associacao_potira.domain.mushrooms.MushroomProduct;

import java.util.List;

public interface MushroomProductRepository {

    List<MushroomProduct> findAll();

    MushroomProduct findById(Long id);

    MushroomProduct update (MushroomProduct mushroomProduct, Long Id);

    MushroomProduct save(MushroomProduct mushroomProduct);

    void delete(Long Id);
}
