package com.example.associacao_potira.infraestructure.repositories.implementations.mushroom;

import com.example.associacao_potira.domain.mushroom.MushroomHarvest;
import com.example.associacao_potira.infraestructure.repositories.interfaces.mushroom.MushroomHarvestRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class MushroomHarvestRepositoryImpl implements MushroomHarvestRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<MushroomHarvest> findAll() {
        return entityManager.createQuery("from MushroomHarvest", MushroomHarvest.class).getResultList();
    }

    @Override
    public MushroomHarvest findById(Long id) {
        return entityManager.find(MushroomHarvest.class, id);
    }

    @Override @Transactional
    public MushroomHarvest update(MushroomHarvest mushroomHarvest, Long Id) {
        mushroomHarvest.setId(Id);
        return entityManager.merge(mushroomHarvest);
    }

    @Override @Transactional
    public MushroomHarvest save(MushroomHarvest mushroomHarvest) {
        return entityManager.merge(mushroomHarvest);
    }

    @Override @Transactional
    public void delete(Long Id) {
        MushroomHarvest mushroomHarvest = findById(Id);
        entityManager.remove(mushroomHarvest);
    }
}
