package com.example.associacao_potira.infraestructure.repositories.interfaces.honeys;

import com.example.associacao_potira.domain.honey.HoneyProduct;

import java.util.List;

public interface HoneyProductRepository {

    List<HoneyProduct> findAll();

    HoneyProduct findById(Long id);

    HoneyProduct update (HoneyProduct product, Long Id);

    HoneyProduct save(HoneyProduct honeyProduct);

    void delete(Long Id);

}
