package com.example.associacao_potira.infraestructure.repositories.interfaces.people.data;

import com.example.associacao_potira.domain.people.data.City;

import java.util.List;

public interface CityRepository {

    List<City> findAll();

    City findById(Long id);

    City update (City city, Long Id);

    City save(City city);

    void delete(Long Id);

}
