package com.example.associacao_potira.infraestructure.repositories.implementations.people.data;

import com.example.associacao_potira.domain.people.data.City;
import com.example.associacao_potira.infraestructure.repositories.interfaces.people.data.CityRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class CityRepositoryImpl implements CityRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<City> findAll() {
        return entityManager.createQuery("from City", City.class).getResultList();
    }

    @Override
    public City findById(Long id) {
        return entityManager.find(City.class, id);
    }

    @Override @Transactional
    public City update(City city, Long Id) {
        city.setId(Id);
        return entityManager.merge(city);
    }

    @Override @Transactional
    public City save(City city) {
        return entityManager.merge(city);
    }

    @Override
    public void delete(Long Id) {
        City city = findById(Id);
        entityManager.remove(city);
    }
}
