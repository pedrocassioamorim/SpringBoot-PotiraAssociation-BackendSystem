package com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis;

import com.example.associacao_potira.domain.cannabis.Clone;

import java.util.List;

public interface CloneRepository {

    List<Clone> findAll();

    Clone findById(Long id);

    Clone update (Clone clone, Long Id);

    Clone save(Clone clone);

    void delete(Long Id);

}
