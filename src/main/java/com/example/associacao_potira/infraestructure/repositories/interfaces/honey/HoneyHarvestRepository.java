package com.example.associacao_potira.infraestructure.repositories.interfaces.honey;

import com.example.associacao_potira.domain.honey.HoneyHarvest;

import java.util.List;

public interface HoneyHarvestRepository {

    List<HoneyHarvest> findAll();

    HoneyHarvest findById(Long id);

    HoneyHarvest update(HoneyHarvest honeyHarvest, Long Id);

    HoneyHarvest save(HoneyHarvest honeyHarvest);

    void delete(Long Id);
}
