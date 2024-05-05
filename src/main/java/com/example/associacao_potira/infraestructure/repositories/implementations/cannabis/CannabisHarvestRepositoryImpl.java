package com.example.associacao_potira.infraestructure.repositories.implementations.cannabis;

import com.example.associacao_potira.domain.cannabis.CannabisHarvest;
import com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis.CannabisHarvestRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class CannabisHarvestRepositoryImpl implements CannabisHarvestRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CannabisHarvest> findAll() {
        return entityManager.createQuery("from CannabisHarvest", CannabisHarvest.class).getResultList();
    }

    @Override
    public CannabisHarvest findById(Integer id) {
        return entityManager.find(CannabisHarvest.class, id);
    }

    @Override @Transactional
    public CannabisHarvest update(CannabisHarvest cannabisHarvest, Long Id) {
        cannabisHarvest.setId(Id);
        return entityManager.merge(cannabisHarvest);
    }

    @Override @Transactional
    public CannabisHarvest save(CannabisHarvest cannabisHarvest) {
        return entityManager.merge(cannabisHarvest);
    }

    @Override @Transactional
    public void delete(CannabisHarvest cannabisHarvest) {

    }
}
