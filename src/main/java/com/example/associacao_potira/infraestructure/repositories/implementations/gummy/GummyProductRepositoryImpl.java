package com.example.associacao_potira.infraestructure.repositories.implementations.gummy;

import com.example.associacao_potira.domain.gummy.GummyProduct;
import com.example.associacao_potira.infraestructure.repositories.interfaces.gummy.GummyProductRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GummyProductRepositoryImpl implements GummyProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<GummyProduct> findAll() {
        return entityManager.createQuery("from GummyProduct", GummyProduct.class).getResultList();
    }

    @Override
    public GummyProduct findById(Long id) {
        return entityManager.find(GummyProduct.class, id);
    }

    @Override @Transactional
    public GummyProduct update(GummyProduct gummyProduct, Long id) {
        gummyProduct.setId(id);
        return entityManager.merge(gummyProduct);
    }

    @Override @Transactional
    public GummyProduct save(GummyProduct gummyProduct) {
        return entityManager.merge(gummyProduct);
    }

    @Override @Transactional
    public void delete(Long id) {
        GummyProduct gummyProduct = findById(id);
        entityManager.remove(gummyProduct);
    }
}
