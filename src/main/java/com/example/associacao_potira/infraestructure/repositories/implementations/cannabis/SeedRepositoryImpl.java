package com.example.associacao_potira.infraestructure.repositories.implementations.cannabis;

import com.example.associacao_potira.domain.cannabis.Seed;
import com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis.SeedRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public class SeedRepositoryImpl implements SeedRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Seed> findAll() {
        return manager.createQuery("from Seed", Seed.class).getResultList();
    }

    @Override
    public Seed findById(Long id) {
        return manager.find(Seed.class, id);
    }

    @Override @Transactional
    public Seed update(Seed seed, Long id) {
        seed.setId(id);
        return manager.merge(seed);
    }

    @Override @Transactional
    public Seed save(Seed seed) {
        return manager.merge(seed);
    }

    @Override @Transactional
    public void delete(Long id) {
        Seed seed = manager.find(Seed.class, id);
        manager.remove(seed);
    }
}
