package com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis;

import com.example.associacao_potira.domain.cannabis.CannabisProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CannabisProductRepository {

    List<CannabisProduct> findAll();

    CannabisProduct findById(Long id);

    CannabisProduct update (CannabisProduct cannabisProduct, Long Id);

    CannabisProduct save(CannabisProduct cannabisProduct);

    void delete(Long Id);
}
