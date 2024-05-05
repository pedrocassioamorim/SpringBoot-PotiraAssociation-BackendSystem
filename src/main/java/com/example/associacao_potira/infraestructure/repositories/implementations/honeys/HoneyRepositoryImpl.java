package com.example.associacao_potira.infraestructure.repositories.implementations.honeys;

import com.example.associacao_potira.domain.honey.Honey;
import com.example.associacao_potira.infraestructure.repositories.interfaces.honeys.HoneyRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class HoneyRepositoryImpl implements HoneyRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Honey> findAll() {
        return entityManager.createQuery("from Honey", Honey.class).getResultList();
    }

    @Override
    public Honey findById(Long id) {
        return entityManager.find(Honey.class, id);
    }

    @Override @Transactional
    public Honey update(Honey honey, Long Id) {
        honey.setId(Id);
        return entityManager.merge(honey);
    }

    @Override @Transactional
    public Honey save(Honey honey) {
        return entityManager.merge(honey);
    }

    @Override @Transactional
    public void delete(Long id) {
        Honey honey = entityManager.find(Honey.class, id);
        entityManager.remove(honey);
    }
}
