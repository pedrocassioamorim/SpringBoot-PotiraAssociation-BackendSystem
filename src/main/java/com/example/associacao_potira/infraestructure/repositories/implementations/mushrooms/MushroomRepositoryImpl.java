package com.example.associacao_potira.infraestructure.repositories.implementations.mushrooms;

import com.example.associacao_potira.domain.mushrooms.Mushroom;
import com.example.associacao_potira.infraestructure.repositories.interfaces.mushrooms.MushroomRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class MushroomRepositoryImpl implements MushroomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Mushroom> findAll() {
        return entityManager.createQuery("from Mushroom", Mushroom.class).getResultList();
    }

    @Override
    public Mushroom findById(Long id) {
        return entityManager.find(Mushroom.class, id);
    }

    @Override @Transactional
    public Mushroom update(Mushroom mushroom, Long Id) {
        mushroom.setId(Id);
        return entityManager.merge(mushroom);
    }

    @Override @Transactional
    public Mushroom save(Mushroom mushroom) {
        return entityManager.merge(mushroom);
    }

    @Override
    public void delete(Long Id) {
        Mushroom mushroom = entityManager.find(Mushroom.class, Id);
        entityManager.remove(mushroom);
    }
}
