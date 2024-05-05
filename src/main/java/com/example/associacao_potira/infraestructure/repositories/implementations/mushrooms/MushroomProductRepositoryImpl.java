package com.example.associacao_potira.infraestructure.repositories.implementations.mushrooms;

import com.example.associacao_potira.domain.mushrooms.MushroomProduct;
import com.example.associacao_potira.infraestructure.repositories.interfaces.mushrooms.MushroomProductRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jdk.jfr.Percentage;

import java.util.List;

public class MushroomProductRepositoryImpl implements MushroomProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<MushroomProduct> findAll() {
        return entityManager.createQuery("from MushroomProduct", MushroomProduct.class).getResultList();
    }

    @Override
    public MushroomProduct findById(Long id) {
        return entityManager.find(MushroomProduct.class, id);
    }

    @Override @Transactional
    public MushroomProduct update(MushroomProduct mushroomProduct, Long Id) {
        mushroomProduct.setId(Id);
        return entityManager.merge(mushroomProduct);
    }

    @Override @Transactional
    public MushroomProduct save(MushroomProduct mushroomProduct) {
        return entityManager.merge(mushroomProduct);
    }

    @Override @Transactional
    public void delete(Long Id) {
        MushroomProduct mushroomProduct = findById(Id);
        entityManager.remove(mushroomProduct);
    }
}
