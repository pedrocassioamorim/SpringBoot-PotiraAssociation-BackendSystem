package com.example.associacao_potira.infraestructure.repositories.implementations.cannabis;

import com.example.associacao_potira.domain.cannabis.CannabisProduct;
import com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis.CannabisProductRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

public class CannabisProductRepositoryImpl implements CannabisProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CannabisProduct> findAll() {
        return entityManager.createQuery("from CannabisProduct", CannabisProduct.class).getResultList();
    }

    @Override
    public CannabisProduct findById(Long id) {
        return entityManager.find(CannabisProduct.class, id);
    }

    @Override @Transactional
    public CannabisProduct update(CannabisProduct cannabisProduct, Long Id) {
        cannabisProduct.setId(Id);
        return entityManager.merge(cannabisProduct);
    }

    @Override @Transactional
    public CannabisProduct save(CannabisProduct cannabisProduct) {
        return entityManager.merge(cannabisProduct);
    }

    @Override
    public void delete(CannabisProduct cannabisProduct) {
        CannabisProduct product = findById(cannabisProduct.getId());
        entityManager.remove(product);
    }
}
