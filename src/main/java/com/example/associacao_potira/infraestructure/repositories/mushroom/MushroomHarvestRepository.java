package com.example.associacao_potira.infraestructure.repositories.mushroom;

import com.example.associacao_potira.domain.mushroom.MushroomHarvest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MushroomHarvestRepository extends JpaRepository<MushroomHarvest,Long> {}
