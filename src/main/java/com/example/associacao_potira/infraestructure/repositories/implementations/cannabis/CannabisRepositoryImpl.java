package com.example.associacao_potira.infraestructure.repositories.implementations.cannabis;

import com.example.associacao_potira.domain.cannabis.Cannabis;
import com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis.CannabisRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

public class CannabisRepositoryImpl implements CannabisRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cannabis> findAll() {
        return manager.createQuery("from Cannabis", Cannabis.class).getResultList();
    }

    @Override
    public Cannabis findById(Long id) {
        return manager.find(Cannabis.class, id);
    }

    @Override @Transactional
    public Cannabis update(Long cannabisId, Cannabis cannabis) {
        cannabis.setId(cannabisId);
        return manager.merge(cannabis);
    }

    @Override @Transactional
    public Cannabis save(Cannabis cannabis) {
        return manager.merge(cannabis);
    }

    @Override @Transactional
    public void delete(Long Id) {
        Cannabis c = manager.find(Cannabis.class, Id);
        manager.remove(c);
    }
}
