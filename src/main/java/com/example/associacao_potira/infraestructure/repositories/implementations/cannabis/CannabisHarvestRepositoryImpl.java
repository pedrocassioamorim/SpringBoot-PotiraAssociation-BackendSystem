package com.example.associacao_potira.infraestructure.repositories.implementations.cannabis;

import com.example.associacao_potira.domain.cannabis.CannabisHarvest;
import com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis.CannabisHarvestRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Component
public class CannabisHarvestRepositoryImpl implements CannabisHarvestRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<CannabisHarvest> findAll() {
        return entityManager.createQuery("from CannabisHarvest", CannabisHarvest.class).getResultList();
    }

    @Override
    public CannabisHarvest findById(Long id) {
        return entityManager.find(CannabisHarvest.class, id);
    }

    @Override @Transactional
    public CannabisHarvest update(CannabisHarvest cannabisHarvest, Long Id) {
        cannabisHarvest.setId(Id);
        return entityManager.merge(cannabisHarvest);
    }

    @Override @Transactional
    public CannabisHarvest save(CannabisHarvest cannabisHarvest) {
        return entityManager.merge(cannabisHarvest);
    }

    @Override @Transactional
    public void delete(Long Id) {
        CannabisHarvest harvest = entityManager.find(CannabisHarvest.class, Id);
        entityManager.remove(harvest);
    }
}
