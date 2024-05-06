package com.example.associacao_potira.infraestructure.repositories.implementations.cannabis;

import com.example.associacao_potira.domain.cannabis.SeedProduct;
import com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis.SeedProductRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SeedProductRepositoryImpl implements SeedProductRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<SeedProduct> findAll() {
        return manager.createQuery("from SeedProduct", SeedProduct.class).getResultList();
    }

    @Override
    public SeedProduct findById(Long id) {
        return manager.find(SeedProduct.class, id);
    }

    @Override @Transactional
    public SeedProduct update(SeedProduct product, Long id) {
        product.setId(id);
        return manager.merge(product);
    }

    @Override @Transactional
    public SeedProduct save(SeedProduct product) {
        return manager.merge(product);
    }

    @Override @Transactional
    public void delete(Long id) {
        SeedProduct product = manager.find(SeedProduct.class, id);
        manager.remove(product);
    }
}
