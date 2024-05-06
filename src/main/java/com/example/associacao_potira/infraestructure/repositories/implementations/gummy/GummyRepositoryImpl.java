package com.example.associacao_potira.infraestructure.repositories.implementations.gummy;

import com.example.associacao_potira.domain.gummy.Gummy;
import com.example.associacao_potira.infraestructure.repositories.interfaces.gummy.GummyRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GummyRepositoryImpl implements GummyRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Gummy> findAll() {
        return entityManager.createQuery("from Gummy", Gummy.class).getResultList();
    }

    @Override
    public Gummy findById(Long id) {
        return entityManager.find(Gummy.class, id);
    }

    @Override @Transactional
    public Gummy update(Gummy gummy, Long id) {
        gummy.setId(id);
        return entityManager.merge(gummy);
    }

    @Override @Transactional
    public Gummy save(Gummy gummy) {
        return entityManager.merge(gummy);
    }

    @Override @Transactional
    public void delete(Long id) {
        Gummy gummy = findById(id);
        entityManager.remove(gummy);
    }
}
