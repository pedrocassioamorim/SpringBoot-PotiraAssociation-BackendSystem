package com.example.associacao_potira.infraestructure.repositories.interfaces.gummy;

import com.example.associacao_potira.domain.gummy.Gummy;

import java.util.List;

public interface GummyRepository {

    List<Gummy> findAll();

    Gummy findById(Long id);

    Gummy update(Gummy gummy, Long id);

    Gummy save(Gummy gummy);

    void delete(Long id);
}
