package com.example.associacao_potira.infraestructure.repositories.interfaces.company.data;

import com.example.associacao_potira.domain.company.data.City;

import java.util.List;

public interface CityRepository {

    List<City> findAll();

    City findById(Long id);

    City update (City city, Long Id);

    City save(City city);

    void delete(Long Id);

}
