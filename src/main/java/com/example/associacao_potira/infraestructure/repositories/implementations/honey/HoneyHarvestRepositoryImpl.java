package com.example.associacao_potira.infraestructure.repositories.implementations.honey;

import com.example.associacao_potira.domain.honey.HoneyHarvest;
import com.example.associacao_potira.infraestructure.repositories.interfaces.honey.HoneyHarvestRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class HoneyHarvestRepositoryImpl implements HoneyHarvestRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<HoneyHarvest> findAll() {
        return entityManager.createQuery("from HoneyHarvest", HoneyHarvest.class).getResultList();
    }

    @Override
    public HoneyHarvest findById(Long id) {
        return entityManager.find(HoneyHarvest.class, id);
    }

    @Override @Transactional
    public HoneyHarvest update(HoneyHarvest honeyHarvest, Long Id) {
        honeyHarvest.setId(Id);
        return entityManager.merge(honeyHarvest);
    }

    @Override @Transactional
    public HoneyHarvest save(HoneyHarvest honeyHarvest) {
        return entityManager.merge(honeyHarvest);
    }

    @Override @Transactional
    public void delete(Long Id) {
        HoneyHarvest honeyHarvest = entityManager.find(HoneyHarvest.class, Id);
        entityManager.remove(honeyHarvest);
    }
}
