package com.example.associacao_potira.infraestructure.repositories.implementations.honey;

import com.example.associacao_potira.domain.honey.HoneyProduct;
import com.example.associacao_potira.infraestructure.repositories.interfaces.honey.HoneyProductRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class HoneyProductRepositoryImpl implements HoneyProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<HoneyProduct> findAll() {
        return entityManager.createQuery("from HoneyProduct", HoneyProduct.class).getResultList();
    }

    @Override
    public HoneyProduct findById(Long id) {
        return entityManager.find(HoneyProduct.class, id);
    }

    @Override @Transactional
    public HoneyProduct update(HoneyProduct product, Long Id) {
        product.setId(Id);
        return entityManager.merge(product);
    }

    @Override @Transactional
    public HoneyProduct save(HoneyProduct honeyProduct) {
        return entityManager.merge(honeyProduct);
    }

    @Override @Transactional
    public void delete(Long Id) {
        HoneyProduct honeyProduct = findById(Id);
        entityManager.remove(honeyProduct);
    }
}
