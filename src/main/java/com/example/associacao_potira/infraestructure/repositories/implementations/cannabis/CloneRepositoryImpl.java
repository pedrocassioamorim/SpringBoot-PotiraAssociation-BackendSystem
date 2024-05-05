package com.example.associacao_potira.infraestructure.repositories.implementations.cannabis;

import com.example.associacao_potira.domain.cannabis.Clone;
import com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis.CloneRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class CloneRepositoryImpl implements CloneRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Clone> findAll() {
        return entityManager.createQuery("from Clone", Clone.class).getResultList();
    }

    @Override
    public Clone findById(Long id) {
        return entityManager.find(Clone.class, id);
    }

    @Override @Transactional
    public Clone update(Clone clone, Long Id) {
        clone.setId(Id);
        return entityManager.merge(clone);
    }

    @Override
    public Clone save(Clone clone) {
        return null;
    }

    @Override
    public void delete(Long Id) {

    }
}
