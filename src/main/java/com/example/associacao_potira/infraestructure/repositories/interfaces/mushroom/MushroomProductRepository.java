package com.example.associacao_potira.infraestructure.repositories.interfaces.mushroom;

import com.example.associacao_potira.domain.mushroom.MushroomProduct;

import java.util.List;

public interface MushroomProductRepository {

    List<MushroomProduct> findAll();

    MushroomProduct findById(Long id);

    MushroomProduct update (MushroomProduct mushroomProduct, Long Id);

    MushroomProduct save(MushroomProduct mushroomProduct);

    void delete(Long Id);
}
