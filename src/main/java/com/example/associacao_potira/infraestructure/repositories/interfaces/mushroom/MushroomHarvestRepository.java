package com.example.associacao_potira.infraestructure.repositories.interfaces.mushroom;

import com.example.associacao_potira.domain.mushroom.MushroomHarvest;

import java.util.List;

public interface MushroomHarvestRepository {

    List<MushroomHarvest> findAll();

    MushroomHarvest findById(Long id);

    MushroomHarvest update(MushroomHarvest mushroomHarvest, Long Id);

    MushroomHarvest save(MushroomHarvest mushroomHarvest);

    void delete(Long Id);
}
