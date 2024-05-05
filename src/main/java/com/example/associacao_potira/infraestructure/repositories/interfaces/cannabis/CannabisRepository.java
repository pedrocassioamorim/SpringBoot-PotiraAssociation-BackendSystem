package com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis;

import com.example.associacao_potira.domain.cannabis.Cannabis;

import java.util.List;

public interface CannabisRepository {

    List<Cannabis> findAll();

    Cannabis findById(Long id);

    Cannabis update(Long cannabisId, Cannabis cannabis);

    Cannabis save(Cannabis cannabis);

    void delete(Long Id);
}
