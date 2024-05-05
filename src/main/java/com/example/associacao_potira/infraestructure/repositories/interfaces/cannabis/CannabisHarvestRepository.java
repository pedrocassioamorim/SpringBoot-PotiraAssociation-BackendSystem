package com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis;

import com.example.associacao_potira.domain.cannabis.CannabisHarvest;

import java.util.List;

public interface CannabisHarvestRepository {

    List<CannabisHarvest> findAll();

    CannabisHarvest findById(Integer id);

    CannabisHarvest update(CannabisHarvest cannabisHarvest, Long Id);

    CannabisHarvest save(CannabisHarvest cannabisHarvest);

    void delete(CannabisHarvest cannabisHarvest);

}
