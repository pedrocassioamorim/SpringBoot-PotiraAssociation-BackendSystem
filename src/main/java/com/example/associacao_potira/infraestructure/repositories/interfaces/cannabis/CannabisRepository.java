package com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis;

import com.example.associacao_potira.domain.cannabis.Cannabis;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CannabisRepository {

    List<Cannabis> findAll();

    Cannabis findById(Long id);

    Cannabis update(Long cannabisId, Cannabis cannabis);

    Cannabis save(Cannabis cannabis);

    void delete(Long Id);
}
