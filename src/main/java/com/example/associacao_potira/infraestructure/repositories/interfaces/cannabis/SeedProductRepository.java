package com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis;

import com.example.associacao_potira.domain.cannabis.SeedProduct;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeedProductRepository {

    List<SeedProduct> findAll();

    SeedProduct findById(Long id);

    SeedProduct update(SeedProduct product, Long id);

    SeedProduct save (SeedProduct product);

    void delete(Long id);

}
