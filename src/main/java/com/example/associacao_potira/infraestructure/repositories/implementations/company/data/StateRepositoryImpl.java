package com.example.associacao_potira.infraestructure.repositories.implementations.company.data;

import com.example.associacao_potira.domain.company.data.State;
import com.example.associacao_potira.infraestructure.repositories.interfaces.company.data.StateRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class StateRepositoryImpl implements StateRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<State> findAll() {
        return entityManager.createQuery("from State", State.class).getResultList();
    }

    @Override
    public State findById(Long id) {
        return entityManager.find(State.class, id);
    }

    @Override @Transactional
    public State update(State state, Long Id) {
        state.setId(Id);
        return entityManager.merge(state);
    }

    @Override @Transactional
    public State save(State state) {
        return entityManager.merge(state);
    }

    @Override @Transactional
    public void delete(Long id) {
        State state = findById(id);
        entityManager.remove(state);
    }
}
