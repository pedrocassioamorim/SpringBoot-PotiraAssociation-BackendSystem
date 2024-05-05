package com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis;

import com.example.associacao_potira.domain.cannabis.CannabisProduct;

import java.util.List;

public interface CannabisProductRepository {

    List<CannabisProduct> findAll();

    CannabisProduct findById(Long id);

    CannabisProduct update (CannabisProduct cannabisProduct, Long Id);

    CannabisProduct save(CannabisProduct cannabisProduct);

    void delete(CannabisProduct cannabisProduct);
}
