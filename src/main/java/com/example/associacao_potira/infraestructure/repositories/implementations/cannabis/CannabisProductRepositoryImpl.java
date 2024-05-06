package com.example.associacao_potira.infraestructure.repositories.implementations.cannabis;

import com.example.associacao_potira.domain.cannabis.CannabisProduct;
import com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis.CannabisProductRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Component
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
    public void delete(Long Id) {
        CannabisProduct product = entityManager.find(CannabisProduct.class, Id);
        entityManager.remove(product);
    }
}