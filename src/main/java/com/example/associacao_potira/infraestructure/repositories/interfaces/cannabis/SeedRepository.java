package com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis;

import com.example.associacao_potira.domain.cannabis.Seed;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeedRepository {

    List<Seed> findAll();

    Seed findById(Long id);

    Seed update(Seed seed, Long id);

    Seed save(Seed seed);

    void delete (Long id);
}
