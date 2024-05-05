package com.example.associacao_potira.infraestructure.repositories.interfaces.honeys;

import com.example.associacao_potira.domain.honey.Honey;

import java.util.List;

public interface HoneyRepository {

    List<Honey> findAll();

    Honey findById(Long id);

    Honey update(Honey honey, Long Id);

    Honey save(Honey honey);

    void delete(Long id);
}
