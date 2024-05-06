package com.example.associacao_potira.infraestructure.repositories.interfaces.gummy;

import com.example.associacao_potira.domain.gummy.GummyProduct;

import java.util.List;

public interface GummyProductRepository {

    List<GummyProduct> findAll();

    GummyProduct findById(Long id);

    GummyProduct update(GummyProduct gummyProduct, Long id);

    GummyProduct save(GummyProduct gummyProduct);

    void delete(Long id);
}
